/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//NAME : Sanatan Sharma																									   //
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.colorchooser.AbstractColorChooserPanel;

@SuppressWarnings("serial")
public class ColorChoose extends JFrame 
{

    private JButton jButton1;
    private JColorChooser jColorChooser1;
    private PopUp popup;
    private int id;
    public ColorChoose(PopUp popup, int id) 
    {
    	this.id = id;
    	this.popup = popup;
        initComponents();
    }
    
    
    private void initComponents() 
    {

        jColorChooser1 = new JColorChooser();
        jButton1 = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("OK");
        jButton1.addActionListener(new ActionListener() 
        {
            public void actionPerformed( ActionEvent evt) 
            {
                jButton1ActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, GroupLayout.PREFERRED_SIZE, 598, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(286, 286, 286))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jColorChooser1, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        AbstractColorChooserPanel[] panels = jColorChooser1.getChooserPanels();
        for (AbstractColorChooserPanel accp : panels) {
           if(!accp.getDisplayName().equals("Swatches")) {
              jColorChooser1.removeChooserPanel(accp);
           } 
        }
        pack();
        setLocationRelativeTo(null);
    }                       

    private void jButton1ActionPerformed( ActionEvent evt) 
    {
    	if(id==2)
    	{
    		popup.setBG(jColorChooser1.getColor());
    	}
    	else
    	{
    		popup.setFG(jColorChooser1.getColor());
    	}
        dispose();
    }                                               
}

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

    private JButton buttonOK;
    private JColorChooser colorChooser;
    private PopUpWindow PopUpWindow;
    private int id;
    public ColorChoose(PopUpWindow PopUpWindow, int id) 
    {
    	this.id = id;
    	this.PopUpWindow = PopUpWindow;
        initComponents();
    }
    
    
    private void initComponents() 
    {

        colorChooser = new JColorChooser();
        buttonOK = new JButton();

        this.setTitle("Choose Color");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        buttonOK.setText("OK");
        buttonOK.addActionListener(new ActionListener() 
        {
            public void actionPerformed( ActionEvent evt) 
            {
                buttonOKActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorChooser, GroupLayout.PREFERRED_SIZE, 598, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonOK)
                .addGap(286, 286, 286))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(colorChooser, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonOK)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        AbstractColorChooserPanel[] panels = colorChooser.getChooserPanels();
        for (AbstractColorChooserPanel accp : panels) {
           if(!accp.getDisplayName().equals("Swatches")) {
              colorChooser.removeChooserPanel(accp);
           } 
        }
        pack();
        setLocationRelativeTo(null);
    }                       

    private void buttonOKActionPerformed( ActionEvent evt) 
    {
    	if(id==2)
    	{
    		PopUpWindow.setBG(colorChooser.getColor());
    	}
    	else
    	{
    		PopUpWindow.setFG(colorChooser.getColor());
    	}
        dispose();
    }                                               
}

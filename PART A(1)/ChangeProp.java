/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//NAME : Sanatan Sharma																									   //
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class ChangeProp extends JFrame 
{
                    
    private JLabel labelChangeProp;
    private JMenuItem menuitemProperties;
    private JMenuItem menuitemBlah;
    private JMenuItem menuitemBlah2;
    private JPopupMenu menuPopup;
	private Color fontColor = null;
    private Color backColor = null;
	private String font = null;
	
    public ChangeProp() 
    {
        initComponents();
        backColor = new Color(240,240,240);
        font = labelChangeProp.getFont().getName();
    }  
                        
    private void initComponents() 
    {

        menuPopup = new JPopupMenu();
        menuitemProperties = new JMenuItem();
        menuitemBlah = new JMenuItem();
        menuitemBlah2 = new JMenuItem();
        labelChangeProp = new JLabel();

        this.setTitle("Change Properties");
        
        menuitemProperties.setText("Properties");
        menuPopup.add(menuitemProperties);
        menuitemProperties.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent evt) 
            {
                menuitemPropertiesActionPerformed(evt);
            }
        });

        menuitemBlah.setText("Blah");
        menuPopup.add(menuitemBlah);

        menuitemBlah2.setText("Blah");
        menuPopup.add(menuitemBlah2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        labelChangeProp.setFont(new Font("Comic Sans MS", 0, 14));
        labelChangeProp.setText("Change Properties");
        labelChangeProp.setOpaque(true);
        labelChangeProp.addMouseListener(new MouseAdapter() 
        {
            public void mouseReleased(MouseEvent evt) 
            {
                labelChangePropMouseReleased(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(labelChangeProp)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(labelChangeProp)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }                       
                                

    private void labelChangePropMouseReleased(MouseEvent evt) 
    {                                      
        if(evt.isPopupTrigger())
        {
        	menuPopup.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }                                     
    
    private void menuitemPropertiesActionPerformed(ActionEvent evt) 
    {                                           
        new PopUpWindow(this).setVisible(true);
    } 
    
    

    void changeProp(Object ob1, Color bg, Color fc)
    {	
    	if (ob1!="")
    		font = ob1.toString();
    	if(bg!=null)
    		backColor = bg;
    	if(fc!=null)
    		fontColor = fc;
    	labelChangeProp.setForeground(fontColor);
    	labelChangeProp.setBackground(backColor);
    	labelChangeProp.setFont(new Font(font, 0, 14));
    }                  
}



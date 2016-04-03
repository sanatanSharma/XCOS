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
                    
    private JLabel jLabel1;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem2;
    private JMenuItem jMenuItem3;
    private JPopupMenu jPopupMenu1;
	private int[] fore = new int[3];
    private int[] back = new int[3];
	private String font = null;
	
    public ChangeProp() 
    {
        initComponents();
        back[0]=back[1]=back[2]=240;
        font = jLabel1.getFont().getName();
    }  
                        
    private void initComponents() 
    {

        jPopupMenu1 = new JPopupMenu();
        jMenuItem1 = new JMenuItem();
        jMenuItem2 = new JMenuItem();
        jMenuItem3 = new JMenuItem();
        jLabel1 = new JLabel();

        jMenuItem1.setText("Properties");
        jPopupMenu1.add(jMenuItem1);
        jMenuItem1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent evt) 
            {
                jMenuItem1ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Blah");
        jPopupMenu1.add(jMenuItem2);

        jMenuItem3.setText("Blah");
        jPopupMenu1.add(jMenuItem3);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new Font("Comic Sans MS", 0, 14));
        jLabel1.setText("Change Properties");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new MouseAdapter() 
        {
            public void mouseReleased(MouseEvent evt) 
            {
                jLabel1MouseReleased(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }                       
                                

    private void jLabel1MouseReleased(MouseEvent evt) 
    {                                      
        if(evt.isPopupTrigger())
        {
        	jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }                                     
    
    private void jMenuItem1ActionPerformed(ActionEvent evt) 
    {                                           
        new PopUp(this).setVisible(true);
    } 
    
    

    void changeProp(Object ob1, int[] bg, int[] fc)
    {	
    	if (ob1!="")
    		font = ob1.toString();
    	if(bg!=null)
    		back = bg;
    	if(fc!=null)
    		fore = fc;
    	jLabel1.setForeground(new Color(fore[0], fore[1], fore[2]));
    	jLabel1.setBackground(new Color(back[0], back[1], back[2]));
    	jLabel1.setFont(new Font(font, 0, 14));
    }                  
}



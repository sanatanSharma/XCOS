/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//NAME : Sanatan Sharma																									   //
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class PopUp extends JFrame 
{
	private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
	@SuppressWarnings("rawtypes")
	private JComboBox jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private ChangeProp changeprop;
    private int[] fore = null;
    private int[] back = null;
    
	public PopUp(ChangeProp changeprop) {
    	this.changeprop = changeprop;
        initComponents();
    }
                        
    @SuppressWarnings({ "unchecked", "rawtypes" })
	private void initComponents() 
    {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jButton1 = new JButton();
        jButton3 = new JButton();
        jComboBox1 = new JComboBox();
        jButton2 = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Properties", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Times New Roman", 1, 14), new java.awt.Color(0, 51, 255))); 
        jPanel1.setToolTipText("");

        jLabel1.setText("Change Text");

        jLabel2.setText("Change BG Color");

        jLabel3.setText("Change Font Color");

        jTextField1.setToolTipText("RGB Values");

        jTextField2.setToolTipText("RGB Values");

        jButton1.setText("OK");
        jButton1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent evt) 
            {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent evt) 
            {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new DefaultComboBoxModel(new String[] {"", "Times New Roman ", "Monotype Corsiva"}));
        

        jButton2.setText("jButton2");
        jButton2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent evt) 
            {
                jButton2ActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox1, 0, 168, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jButton1)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }                      

    private void jButton1ActionPerformed(ActionEvent evt) 
    {      
        changeprop.changeProp(jComboBox1.getSelectedItem(), back, fore);
        dispose();
    }                                        

    private void jButton2ActionPerformed(ActionEvent evt) 
    {                                         
        ColorChoose cc = new ColorChoose(this, 2);
        cc.setVisible(true);
    }                                        

    private void jButton3ActionPerformed(ActionEvent evt) 
    {                                         
    	ColorChoose cc = new ColorChoose(this, 3);
        cc.setVisible(true);
    }     
    
    void setBG(Color color)
    {
    	back = new int[3];
    	back[0] = color.getRed();
    	back[1] = color.getGreen();
    	back[2] = color.getBlue();
    	String s = "("+back[0]+", "+back[1]+", "+back[2]+")";
    	jTextField1.setText(s);
    }
    
    void setFG(Color color)
    {
    	fore = new int[3];
    	fore[0] = color.getRed();
    	fore[1] = color.getGreen();
    	fore[2] = color.getBlue();
    	String s = "("+fore[0]+", "+fore[1]+", "+fore[2]+")";
    	jTextField2.setText(s);
    }                  
}

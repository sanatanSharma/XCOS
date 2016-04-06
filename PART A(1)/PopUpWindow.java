/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//NAME : Sanatan Sharma																									   //
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class PopUpWindow extends JFrame 
{
	private JButton buttonOK;
    private JButton buttonChooseBGColor;
    private JButton buttonChooseFontColor;
	@SuppressWarnings("rawtypes")
	private JComboBox comboboxChooseText;
    private JLabel labelChangeText;
    private JLabel labelChangeBGColor;
    private JLabel labelChangeFontColor;
    private JPanel panel;
    private JTextField textfieldChosenBGColor;
    private JTextField textfieldChosenFontColor;
    private ChangeProp changeprop;
    private Color fore = null;
    private Color back = null;
    
	public PopUpWindow(ChangeProp changeprop) {
    	this.changeprop = changeprop;
        initComponents();
    }
                        
    @SuppressWarnings({ "unchecked", "rawtypes" })
	private void initComponents() 
    {

        panel = new JPanel();
        labelChangeText = new JLabel();
        labelChangeBGColor = new JLabel();
        labelChangeFontColor = new JLabel();
        textfieldChosenBGColor = new JTextField();
        textfieldChosenFontColor = new JTextField();
        buttonOK = new JButton();
        buttonChooseFontColor = new JButton();
        comboboxChooseText = new JComboBox();
        buttonChooseBGColor = new JButton();

        this.setTitle("Set Values");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        panel.setBorder(BorderFactory.createTitledBorder(null, "Properties", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Times New Roman", 1, 14), new java.awt.Color(0, 51, 255))); 
        panel.setToolTipText("");

        labelChangeText.setText("Change Text");

        labelChangeBGColor.setText("Change BG Color");

        labelChangeFontColor.setText("Change Font Color");

        textfieldChosenBGColor.setEnabled(false);
        
        textfieldChosenFontColor.setEnabled(false);

        buttonOK.setText("OK");
        buttonOK.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent evt) 
            {
                buttonOKActionPerformed(evt);
            }
        });

        buttonChooseFontColor.setText("buttonChooseFontColor");
        buttonChooseFontColor.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent evt) 
            {
                buttonChooseFontColorActionPerformed(evt);
            }
        });

        comboboxChooseText.setModel(new DefaultComboBoxModel(new String[] {"", "Times New Roman ", "Monotype Corsiva"}));
        

        buttonChooseBGColor.setText("buttonChooseBGColor");
        buttonChooseBGColor.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent evt) 
            {
                buttonChooseBGColorActionPerformed(evt);
            }
        });

        GroupLayout panelLayout = new GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(labelChangeBGColor)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonChooseBGColor, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(labelChangeFontColor)
                            .addComponent(labelChangeText))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(textfieldChosenBGColor)
                                    .addComponent(textfieldChosenFontColor))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonChooseFontColor, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboboxChooseText, 0, 168, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(buttonOK)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(labelChangeText)
                    .addComponent(comboboxChooseText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldChosenBGColor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelChangeBGColor)
                    .addComponent(buttonChooseBGColor))
                .addGap(15, 15, 15)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(labelChangeFontColor)
                    .addComponent(textfieldChosenFontColor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonChooseFontColor))
                .addGap(18, 18, 18)
                .addComponent(buttonOK)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }                      

    private void buttonOKActionPerformed(ActionEvent evt) 
    {      
        changeprop.changeProp(comboboxChooseText.getSelectedItem(), back, fore);
        dispose();
    }                                        

    private void buttonChooseBGColorActionPerformed(ActionEvent evt) 
    {                                         
        ColorChoose cc = new ColorChoose(this, 2);
        cc.setVisible(true);
    }                                        

    private void buttonChooseFontColorActionPerformed(ActionEvent evt) 
    {                                         
    	ColorChoose cc = new ColorChoose(this, 3);
        cc.setVisible(true);
    }     
    
    void setBG(Color color)
    {
    	textfieldChosenBGColor.setBackground(color);
    	back = color;
    }
    
    void setFG(Color color)
    {
    	textfieldChosenFontColor.setBackground(color);
    	fore = color;
    }                  
}

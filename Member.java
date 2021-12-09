import javax.swing.*;

public class Member extends Variable{

    Member(){
        MemberDash();
        MemberSetting();
    }
    void MemberDash(){
        MemberFrame.setSize(500, 500);
        MemberFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MemberFrame.setLocationRelativeTo(null);
        MemberFrame.setResizable(false);
        MemberPanel.setLayout(null);
        MemberFrame.add(MemberPanel);

        for(int i = 0; i < MemberLabel.length; i++){
            MemberLabel[i] = new JLabel();
            MemberLabel[i].setFont(MainFont);
            MemberPanel.add(MemberLabel[i]);
        }

        for(int i = 0; i < MemberButton.length; i++){
            MemberButton[i] = new JButton();
            MemberButton[i].setBorder(null);
            MemberButton[i].setBackground(buttonColor);
            MemberButton[i].setFocusable(false);
            MemberButton[i].setFont(MainFont);
            MemberButton[i].addActionListener(this);
            MemberPanel.add(MemberButton[i]);
        }

        //Title
        MemberLabel[0].setText("Member Account");
        MemberLabel[0].setFont(TitleFont);
        MemberLabel[0].setHorizontalAlignment(JLabel.CENTER);
        MemberLabel[0].setBorder(border);
        MemberLabel[0].setBounds(10, 10, 480, 50);

        MemberLabel[1].setText("Full name: ");
        MemberLabel[1].setFont(MainFont);
        MemberLabel[1].setBounds(10, 70, 480, 50);

        MemberLabel[2].setText("Address: ");
        MemberLabel[2].setFont(MainFont);
        MemberLabel[2].setBounds(20, 120, 480, 50);

        MemberLabel[3].setFont(MainFont);
        MemberLabel[3].setText("Balance: ");
        MemberLabel[3].setBounds(20, 170, 480, 50);

        //User Info
        MemberLabel[4].setBounds(150, 70, 480, 50);
        MemberLabel[4].setFont(InfoFont);
        MemberLabel[5].setBounds(150, 120, 480, 50);
        MemberLabel[5].setFont(InfoFont);
        MemberLabel[6].setBounds(150, 170, 480, 50);
        MemberLabel[6].setFont(InfoFont);

        //SendCash Button
        MemberButton[0].setText("Send Cash");
        MemberButton[0].setBounds(10, 250, 200, 50);

        //User Setting Button
        MemberButton[1].setText("Setting");
        MemberButton[1].setBounds(290, 250, 200, 50);

        //Logout Button
        MemberButton[2].setText("Logout");
        MemberButton[2].setBounds(290, 350, 200, 50);
    }

    void MemberSetting(){
        SettingFrame.setSize(400, 600);
        SettingFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        SettingFrame.setLocationRelativeTo(null);
        SettingFrame.setResizable(false);
        SettingFrame.add(SettingPanel);
        SettingPanel.setLayout(null);

        SettingPanel.add(UserCurrency);
        
        for(int i = 0; i < SettingLabel.length; i++){
            SettingLabel[i] = new JLabel();
            SettingLabel[i].setFont(MainFont);
            SettingPanel.add(SettingLabel[i]);
        }

        for(int i = 0; i < SettingField.length; i++){
            SettingField[i] = new JTextField();
            SettingField[i].setFont(MainFont);
            SettingField[i].setHorizontalAlignment(JTextField.CENTER);
            SettingPanel.add(SettingField[i]);
        }

        for(int i = 0; i < SettingButton.length; i++){
            SettingButton[i] = new JButton();
            SettingButton[i].setFont(MainFont);
            SettingButton[i].setFocusable(false);
            SettingButton[i].setBorder(null);
            SettingButton[i].setBackground(buttonColor);
            SettingButton[i].addActionListener(this);
            SettingPanel.add(SettingButton[i]);
        }
        //Title
        SettingLabel[0].setText("Account Information");
        SettingLabel[0].setBounds(10, 10, 380, 50);
        SettingLabel[0].setHorizontalAlignment(JLabel.CENTER);
        SettingLabel[0].setFont(TitleFont);
        SettingLabel[0].setBorder(border);

        //ICTS ID
        SettingLabel[1].setText("ICTS ID");
        SettingLabel[1].setHorizontalAlignment(JLabel.CENTER);
        SettingLabel[1].setBounds(10, 100, 380, 20);
        SettingField[0].setBounds(10, 130, 380, 25);
        SettingField[0].setEditable(false);

        //FULL NAME
        SettingLabel[2].setText("FULLNAME");
        SettingLabel[2].setHorizontalAlignment(JLabel.CENTER);
        SettingLabel[2].setBounds(10, 180, 380, 20);
        SettingField[1].setBounds(10, 210, 380, 25);
        SettingField[1].setEditable(false);

        //Address
        SettingLabel[3].setText("ADDRESS");
        SettingLabel[3].setHorizontalAlignment(JLabel.CENTER);
        SettingLabel[3].setFont(InfoFont);
        SettingLabel[3].setBounds(10, 260, 380, 20);
        SettingField[2].setBounds(10, 290, 380, 25);
        SettingField[2].setEditable(false);

        //Default Currency
        SettingLabel[4].setText("USED CURRENCY");
        SettingLabel[4].setHorizontalAlignment(JLabel.CENTER);
        SettingLabel[4].setBounds(10, 330, 380, 20);
        UserCurrency.setBounds(10, 360, 380, 25);
        UserCurrency.setSelectedIndex(0);
        UserCurrency.setFocusable(false);

        //Apply Button
        SettingButton[0].setText("Apply Change");
        SettingButton[0].setBounds(10, 450, 380, 30);
        SettingFrame.setVisible(true);
        
    }
}

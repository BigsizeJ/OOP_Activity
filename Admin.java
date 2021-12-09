import javax.swing.*;

public class Admin extends Member{

    Admin(){
        AdminDash();
        MemberRegistration();
        showMember();
        AdminCash();
    }
    void AdminDash(){
        AdminFrame.setSize(500, 500);
        AdminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AdminFrame.setLocationRelativeTo(null);
        AdminFrame.setResizable(false);
        AdminPanel.setLayout(null);
        AdminFrame.add(AdminPanel);

        for(int i = 0; i < AdminLabel.length; i++){
            AdminLabel[i] = new JLabel();
            AdminLabel[i].setFont(MainFont);
            AdminPanel.add(AdminLabel[i]);
        }
        
        for(int i = 0; i < AdminButton.length; i++){
            AdminButton[i] = new JButton();
            AdminButton[i].setFocusable(false);
            AdminButton[i].setBackground(buttonColor);
            AdminButton[i].setFont(MainFont);
            AdminButton[i].setBorder(null);
            AdminButton[i].addActionListener(this);
            AdminPanel.add(AdminButton[i]);
        }
        //Title
        AdminLabel[0].setFont(TitleFont);
        AdminLabel[0].setText("Administrator account");
        AdminLabel[0].setHorizontalAlignment(JLabel.CENTER);
        AdminLabel[0].setBorder(border);
        AdminLabel[0].setBounds(10, 10, 480, 50);

        //Add Member button
        AdminButton[0].setText("Add Member");
        AdminButton[0].setBounds(10, 100, 150, 50);
        
        //Show Member button
        AdminButton[1].setText("Show Member");
        AdminButton[1].setBounds(340, 100, 150, 50);
        
        //Add Cash button
        AdminButton[2].setText("Add Balance");
        AdminButton[2].setBounds(10, 200, 150, 50);

        //Logout Button
        AdminButton[3].setText("Logout");
        AdminButton[3].setBounds(340, 200, 150, 50);
    }

    void MemberRegistration(){
        RegFrame.setSize(500, 600);
        RegFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        RegFrame.setLocationRelativeTo(null);
        RegFrame.setResizable(false);
        RegFrame.add(RegPanel);
        RegPanel.setLayout(null);
        
        for(int i = 0; i < RegLabel.length; i++){
            RegLabel[i] = new JLabel();
            RegLabel[i].setFont(MainFont);
            RegPanel.add(RegLabel[i]);
        }
        
        for(int i = 0; i < RegName.length; i++){
            RegName[i] = new JTextField();
            RegName[i].setFont(MainFont);
            RegPanel.add(RegName[i]);
        }

        for(int i = 0; i < RegField.length; i++){
            RegField[i] = new JTextField();
            RegField[i].setFont(MainFont);
            RegPanel.add(RegField[i]);
        }

        for(int i = 0; i < RegPW.length; i++){
            RegButton[i] = new JButton();
            RegButton[i].addActionListener(this);
            RegButton[i].setFont(MainFont);
            RegButton[i].setBorder(null);
            RegButton[i].setFocusable(false);
            RegButton[i].setBackground(buttonColor);
            RegPW[i] = new JPasswordField();
            RegPW[i].setFont(MainFont);
            RegPanel.add(RegButton[i]);
            RegPanel.add(RegPW[i]);
        }

        //Title 
        RegLabel[0].setFont(TitleFont);
        RegLabel[0].setText("Personal Information");
        RegLabel[0].setBorder(border);
        RegLabel[0].setHorizontalAlignment(JLabel.CENTER);
        RegLabel[0].setBounds(10, 10, 480, 50);


        //Firstname 
        RegLabel[1].setText("Surname");
        RegLabel[1].setBounds(45, 100, 200, 25);
        RegName[0].setBounds(10, 130, 150, 25);

        //Surname
        RegLabel[2].setText("Firstname");
        RegLabel[2].setBounds(200, 100, 200, 25);
        RegName[1].setBounds(175, 130, 150, 25);

        //MiddleName
        RegLabel[3].setText("M.I");
        RegLabel[3].setBounds(400, 100, 200, 25);
        RegName[2].setBounds(340, 130, 150, 25);
        
        //Address
        RegLabel[4].setText("Home Address");
        RegLabel[4].setBounds(180, 180, 150, 25);
        RegField[0].setBounds(10, 210, 480, 25);
        

        //Title
        RegLabel[5].setText("Information you use to login your account");
        RegLabel[5].setFont(TitleFont);
        RegLabel[5].setBorder(border);
        RegLabel[5].setHorizontalAlignment(JLabel.CENTER);
        RegLabel[5].setBounds(10, 250, 480, 50);
    
        //ICST ID
        RegLabel[6].setText("ICTS ID");
        RegLabel[6].setBounds(55, 320, 150, 25);
        RegField[1].setBounds(190, 320, 300, 25);
        RegField[1].setEditable(false);

        //Password
        RegLabel[7].setText("Password");
        RegLabel[7].setBounds(50, 360, 150, 25);
        RegPW[0].setBounds(190, 360, 300, 25);

        //Retype Password
        RegLabel[8].setText("Retype Password");
        RegLabel[8].setBounds(10, 400, 200, 25);
        RegPW[1].setBounds(190, 400, 300, 25);

        //Button
        RegButton[0].setText("Generate ICTS ID");
        RegButton[0].setBounds(10, 470, 230, 50);
        RegButton[1].setText("Submit");
        RegButton[1].setBounds(260, 470, 230, 50);
    }

    void showMember(){
        ShowFrame.setSize(500, 500);
        ShowFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ShowFrame.setLocationRelativeTo(null);
        ShowFrame.setResizable(false);
        ShowFrame.add(ShowPanel);
        ShowPanel.setLayout(null);
        ShowPanel.add(Show);
        ShowPanel.add(ShowButton);

        for(int i = 0; i < ShowLabel_info.length; i++){
            ShowLabel_info[i] = new JLabel();
            ShowLabel_info[i].setFont(MainFont);
            ShowPanel.add(ShowLabel_info[i]);
        }

        //Info Label
        ShowLabel_info[0].setText("Full name");
        ShowLabel_info[0].setBounds(10, 20, 200, 25);
        ShowLabel_info[1].setText("ICTS ID");
        ShowLabel_info[1].setBounds(150, 20, 200, 25);
        ShowLabel_info[2].setText("Password");
        ShowLabel_info[2].setBounds(280, 20, 200, 25);
        ShowLabel_info[3].setText("Balance");
        ShowLabel_info[3].setBounds(400, 20, 200, 25);
        
        //TextArea
        JScrollPane Scroll = new JScrollPane(Show, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        Show.setFont(ShowFont);
        Show.setEditable(false);
        Show.setBorder(Showborder);
        Show.setBackground(ShowColor);
        ShowPanel.add(Scroll);
        Scroll.setBounds(10, 60, 470, 300);

        //Button
        ShowButton.setText("Show Member");
        ShowButton.addActionListener(this);
        ShowButton.setFont(MainFont);
        ShowButton.setBorder(null);
        ShowButton.setFocusable(false);
        ShowButton.setBackground(buttonColor);
        ShowButton.setBounds(10, 390, 470, 50);
    }

    void AdminCash(){
        AddCashFrame.setSize(500, 300);
        AddCashFrame.setLocationRelativeTo(null);
        AddCashFrame.setResizable(false);
        AddCashFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        AddCashFrame.add(AddCashPanel);
        AddCashPanel.setLayout(null);
        AddCashPanel.add(CurrencySelector);
        AddCashPanel.add(AddCashButton);

        for(int i = 0; i < AddCashLabel.length; i++){
            AddCashLabel[i] = new JLabel();
            AddCashLabel[i].setFont(MainFont);
            AddCashPanel.add(AddCashLabel[i]);
        }
        
        for(int i = 0; i < AddCashField.length; i++){
            AddCashField[i] = new JTextField();
            AddCashField[i].setFont(MainFont);
            AddCashPanel.add(AddCashField[i]);
        }

        //ICTS ID
        AddCashLabel[0].setText("ICTS ID");
        AddCashLabel[0].setBounds(10, 10, 200, 30);
        AddCashField[0].setBounds(150, 10, 330, 30);

        //Currency
        AddCashLabel[1].setText("Currency");
        AddCashLabel[1].setBounds(10, 60, 200, 50);
        CurrencySelector.setBounds(150, 70, 330, 30);
        CurrencySelector.setFont(MainFont);
        CurrencySelector.setSelectedItem(0);
        CurrencySelector.setEditable(false);
        CurrencySelector.setFocusable(false);
        CurrencySelector.setBorder(null);

        //Amount
        AddCashLabel[2].setText("Amount");
        AddCashLabel[2].setBounds(10, 130, 200, 30);
        AddCashField[1].setBounds(150, 130, 330, 30);

        //Button
        AddCashButton.setText("Send");
        AddCashButton.setFont(MainFont);
        AddCashButton.addActionListener(this);
        AddCashButton.setFocusable(false);
        AddCashButton.setBorder(null);
        AddCashButton.setBackground(buttonColor);
        AddCashButton.setBounds(10, 190, 480, 50);
    }
}

import java.awt.Font;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Frame implements ActionListener{

    //Login Variable
    JFrame Loginframe = new JFrame("Login Account");
    JPanel LoginPanel = new JPanel();
    JLabel LoginLabel[] = new JLabel[3];
    JButton LoginButton[] = new JButton[2];
    JTextField LoginID = new JTextField();
    JPasswordField LoginPW = new JPasswordField();

    //Admin Variable
    JFrame AdminFrame = new JFrame("Admin - Dashboard");
    JPanel AdminPanel = new JPanel();
    JLabel AdminLabel[] = new JLabel[3];
    JButton AdminButton[] = new JButton[4];

    //Member Variable
    JFrame MemberFrame = new JFrame("Member - Dashboard");
    JPanel MemberPanel = new JPanel();
    JLabel MemberLabel[] = new JLabel[7];
    JButton MemberButton[] = new JButton[3];

    //Registration of Member Variable
    JFrame RegFrame = new JFrame("Member Registration");
    JPanel RegPanel = new JPanel();
    JLabel RegLabel[] = new JLabel[10];
    JTextField RegName[] = new JTextField[3];
    JTextField RegField[] = new JTextField[2];
    JPasswordField RegPW[] = new JPasswordField[2];
    JButton RegButton[] = new JButton[2];

    //Show Member Variable
    JFrame ShowFrame = new JFrame("Show Member");
    JPanel ShowPanel = new JPanel();
    JLabel ShowLabel[] = new JLabel[20];
    JLabel ShowLabel_info[] = new JLabel[5];
    JTextArea Show = new JTextArea();
    JButton ShowButton = new JButton();

    //Admin add cash
    JFrame AddCashFrame = new JFrame("Add Balance");
    JPanel AddCashPanel = new JPanel();
    JLabel AddCashLabel[] = new JLabel[3];
    JButton AddCashButton = new JButton();
    JTextField AddCashField[] = new JTextField[2];
    String CurrencyBox[] = {"US Dollar", "EUR", "Philippines Peso"};
    JComboBox<String> CurrencySelector = new JComboBox<String>(CurrencyBox);
    
    


    //Misc Variable
    Font MainFont = new Font("Roboto Mono", Font.PLAIN, 18);
    Font TitleFont = new Font("Roboto Mono", Font.BOLD, 16);
    Font ShowFont = new Font("Roboto Mono", Font.PLAIN, 16);
    Font InfoFont = new Font("Roboto Mono", Font.PLAIN, 13);
    Color buttonColor = new Color(153, 156, 148);
    Color ShowColor = new Color(217, 219, 222);
    Border border = BorderFactory.createLineBorder(Color.black);
    Border Showborder = BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10));
    JButton example = new JButton("Click");
    
    //Array Data
    String MemberID[] = new String[20];
    String MemberPW[] = new String[20];
    String MemberFN[] = new String[20];
    String MemberSN[] = new String[20];
    String MemberMI[] = new String[20];
    String MemberAddress[] = new String[20];
    int MemberCash[] = new int[20];
    int memberCount = 0;

    //Admin Account
    String AdminUser = "ICTS";
    String AdminPW = "123";

    Frame(){
        login();
        AdminDash();
        MemberDash();
        MemberRegistration();
        showMember();
        AdminCash();
    };

    void login(){
        Loginframe.setSize(400, 300);
        Loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Loginframe.setLocationRelativeTo(null);
        Loginframe.setResizable(false);
        LoginPanel.setLayout(null);
        Loginframe.add(LoginPanel);
        
        for(int i = 0; i < LoginLabel.length; i++){
            LoginLabel[i] = new JLabel();
            LoginLabel[i].setFont(MainFont);
            LoginID.setFont(MainFont);
            LoginPW.setFont(MainFont);
            LoginPanel.add(LoginLabel[i]);
            LoginPanel.add(LoginID);
            LoginPanel.add(LoginPW);
        }
        
        for(int i = 0; i < LoginButton.length; i++){
            LoginButton[i] = new JButton();
            LoginButton[i].setFont(MainFont);
            LoginButton[i].setFocusable(false);
            LoginButton[i].setBorder(null);
            LoginButton[i].setBackground(buttonColor);
            LoginButton[i].addActionListener(this);
            LoginPanel.add(LoginButton[i]);
        }
        //LoginTitle
        LoginLabel[0].setText("International Cash and Trading System");
        LoginLabel[0].setFont(TitleFont);
        LoginLabel[0].setBounds(13, 10, 500, 25);
        //ICST ID
        LoginLabel[1].setText("ICTS ID");
        LoginLabel[1].setBounds(20, 60, 300, 25);
        LoginID.setBounds(130, 60, 250, 25);
        //ICST PW
        LoginLabel[2].setText("PASSWORD");
        LoginLabel[2].setBounds(20, 110, 300, 25);
        LoginPW.setBounds(130, 110, 250, 25);

        //Button
        LoginButton[0].setText("Admin Login");
        LoginButton[0].setBounds(50, 160, 300, 35);
        LoginButton[1].setText("Member Login");
        LoginButton[1].setBounds(50, 210, 300, 35);
        
        Loginframe.setVisible(true);
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
        AddCashFrame.setVisible(true);

        //Button
        AddCashButton.setText("Submit");
        AddCashButton.setFont(MainFont);
        AddCashButton.addActionListener(this);
        AddCashButton.setFocusable(false);
        AddCashButton.setBorder(null);
        AddCashButton.setBackground(buttonColor);
        AddCashButton.setBounds(10, 190, 480, 50);
    }

    @Override
    public void actionPerformed(ActionEvent Clicked){};
}

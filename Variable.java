import java.awt.Font;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Variable implements ActionListener{

    String CurrencyArray[] = {"US Dollar", "EUR", "Philippines Peso"};

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

    //Member Settings
    JFrame SettingFrame = new JFrame("Account Setting");
    JPanel SettingPanel = new JPanel();
    JLabel SettingLabel[] = new JLabel[7];
    JTextField SettingField[] = new JTextField[5];
    JButton SettingButton = new JButton();
    JComboBox<String> UserCurrency = new JComboBox<String>(CurrencyArray);

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
    
    JComboBox<String> CurrencySelector = new JComboBox<String>(CurrencyArray);
        
    //Misc Variable
    Font MainFont = new Font("Roboto Mono", Font.PLAIN, 18);
    Font TitleFont = new Font("Roboto Mono", Font.BOLD, 16);
    Font ShowFont = new Font("Roboto Mono", Font.PLAIN, 16);
    Font InfoFont = new Font("Roboto Mono", Font.PLAIN, 13);
    Color buttonColor = new Color(153, 156, 148);
    Color ShowColor = new Color(217, 219, 222);
    Border border = BorderFactory.createLineBorder(Color.black);
    Border Showborder = BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10));
    final double US_RATE = 1;
    final double PH_RATE = 0.020;
    final double EUR_RATE = 1.13;
    
    //Array Data
    String MemberID[] = new String[20];
    String MemberPW[] = new String[20];
    String MemberFN[] = new String[20];
    String MemberSN[] = new String[20];
    String MemberMI[] = new String[20];
    String MemberAddress[] = new String[20];
    double MemberCash[] = new double[20];
    int memberCount = 0;
    int memberActive;

    //Admin Account
    String AdminUser = "ICTS";
    String AdminPW = "123";

    Variable(){
        login();
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

    @Override
    public void actionPerformed(ActionEvent Clicked){};
}

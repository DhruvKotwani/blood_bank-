import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class AdminLogin extends JFrame
{
	Container c;
	JButton btnLogin , btnBack;
	JTextField txtUsername;
	JPasswordField Password;
	JLabel lblUsername , lblPassword;
	
	AdminLogin()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		Font f = new Font("Calibri",Font.BOLD,30);

		lblUsername = new JLabel("Enter the username : ");
		lblUsername.setFont(f);
		txtUsername = new JTextField(15);
		txtUsername.setFont(f);
		lblPassword = new JLabel("Enter the password : ");
		lblPassword.setFont(f);
		Password = new JPasswordField(15);
		Password.setFont(f);
		btnLogin = new  JButton("Login");
		btnLogin.setFont(f);
		btnBack = new JButton("Back");
		btnBack.setFont(f);
		
		ActionListener a1 = (ae) -> { Main a = new Main(); dispose(); };
		btnBack.addActionListener(a1);
		ActionListener a2 = (ae) -> { Admin a = new Admin(); dispose(); };
		btnLogin.addActionListener(a2);

		c.add(lblUsername);
		c.add(txtUsername);
		c.add(lblPassword);
		c.add(Password);
		c.add(btnLogin);
		c.add(btnBack);

		setSize(400,400);
		setLocationRelativeTo(null);
		setTitle("Admin Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new AdminLogin();
	}

}		 
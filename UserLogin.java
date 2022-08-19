import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class UserLogin extends JFrame
{
	Container c;
	JButton btnLogin , btnBack , btnRegister;
	JTextField txtUsername;
	JPasswordField Password;
	JLabel lblUsername , lblPassword;
		
	UserLogin()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		Font f = new Font("Calibri",Font.BOLD,30);

		lblUsername = new JLabel("Enter the username : ");
		lblUsername.setFont(f);
		c.add(lblUsername);
		txtUsername = new JTextField(15);
		txtUsername.setFont(f);
		c.add(txtUsername);
		lblPassword = new JLabel("Enter the password : ");
		lblPassword.setFont(f);
		c.add(lblPassword);
		Password = new JPasswordField(15);
		Password.setFont(f);
		c.add(Password);
		btnLogin = new JButton("Login");
		btnLogin.setFont(f);
		c.add(btnLogin);
		btnRegister = new JButton("Register");
		btnRegister.setFont(f);
		c.add(btnRegister);
		btnBack = new JButton("Back");
		btnBack.setFont(f);
		c.add(btnBack);
		
		ActionListener a1 = (ae) -> { Main a = new Main(); dispose(); };
		btnBack.addActionListener(a1);
		ActionListener a2 = (ae) -> { UserRegister a = new UserRegister(); dispose(); };
		btnRegister.addActionListener(a2);
		ActionListener a3 = (ae) -> { UserMenu a = new UserMenu(); dispose(); };
		btnLogin.addActionListener(a3);
		
		setTitle("User's Login");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
		
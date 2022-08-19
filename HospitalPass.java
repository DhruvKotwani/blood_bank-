import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class HospitalPass extends JFrame
{
	Container c;
	JTextField txtUsername;
	JPasswordField Password1 , Password2;
	JLabel lblUsername , lblPassword1 , lblPassword2;
	JButton btnSubmit;
	
	HospitalPass()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		Font f = new Font("Calibri",Font.BOLD,30);
	
		lblUsername = new JLabel("Enter the Username: ");
		lblUsername.setFont(f);
		c.add(lblUsername);
		txtUsername = new JTextField(15);
		txtUsername.setFont(f);
		c.add(txtUsername);
		lblPassword1 = new JLabel("Enter the Password: ");
		lblPassword1.setFont(f);
		c.add(lblPassword1);
		Password1 = new JPasswordField(15);
		Password1.setFont(f);
		c.add(Password1);
		lblPassword2 = new JLabel("Re-Enter the Password: ");
		lblPassword2.setFont(f);
		c.add(lblPassword2);
		Password2 = new JPasswordField(15);
		Password2.setFont(f);
		c.add(Password2);
		btnSubmit = new JButton("Submit");
		btnSubmit.setFont(f);
		c.add(btnSubmit);
		
		setTitle("Registeration");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
	
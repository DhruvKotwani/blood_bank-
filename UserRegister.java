import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class UserRegister extends JFrame
{
	Container c;
	JLabel lblName , lblMobile , lblDob , lblGender , lblEmail , lblBloodGroup , lblAddress , lblState , lblCity;
	JTextField txtName , txtMobile , txtDob , txtGender , txtEmail , txtBloodGroup , txtAddress , txtState , txtCity;
	JButton btnRegister , btnBack;
	
	UserRegister()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		Font f = new Font("Calibri",Font.BOLD,24);
	
		lblName = new JLabel("Enter your name : ");
		lblName.setFont(f);
		c.add(lblName);
		txtName = new JTextField(25);
		txtName.setFont(f);
		c.add(txtName);
		lblMobile = new JLabel("Enter your Mobile No. : ");
		lblMobile.setFont(f);	
		c.add(lblMobile);
		txtMobile = new JTextField(25);
		txtMobile.setFont(f);
		c.add(txtMobile);
		lblDob = new JLabel("Enter your Date of Birth : ");
		lblDob.setFont(f);	
		c.add(lblDob);
		txtDob = new JTextField(25);
		txtDob.setFont(f);
		c.add(txtDob);
		lblGender = new JLabel("Enter your Gender(M/F) : ");
		lblGender.setFont(f);	
		c.add(lblGender);
		txtGender = new JTextField(25);
		txtGender.setFont(f);
		c.add(txtGender);
		lblEmail = new JLabel("Enter your Email-Id : ");
		lblEmail.setFont(f);	
		c.add(lblEmail);
		txtEmail = new JTextField(25);
		txtEmail.setFont(f);
		c.add(txtEmail);
		lblBloodGroup = new JLabel("Enter your Blood Group : ");
		lblBloodGroup.setFont(f);	
		c.add(lblBloodGroup);
		txtBloodGroup = new JTextField(25);
		txtBloodGroup.setFont(f);
		c.add(txtBloodGroup);
		lblAddress = new JLabel("Enter your Address :    ");
		lblAddress.setFont(f);	
		c.add(lblAddress);
		txtAddress = new JTextField(25);
		txtAddress.setFont(f);
		c.add(txtAddress);
		lblCity = new JLabel("Enter your City Name : ");
		lblCity.setFont(f);	
		c.add(lblCity);
		txtCity = new JTextField(25);
		txtCity.setFont(f);
		c.add(txtCity);
		lblState = new JLabel("Enter your State : ");
		lblState.setFont(f);	
		c.add(lblState);
		txtState = new JTextField(25);
		txtState.setFont(f);
		c.add(txtState);
		btnRegister = new JButton("Register");
		btnRegister.setFont(f);
		c.add(btnRegister);
		btnBack = new JButton("Back");
		btnBack.setFont(f);
		c.add(btnBack);
		
		ActionListener a1 = (ae) -> { UserLogin a = new UserLogin(); dispose();};
		btnBack.addActionListener(a1);
		ActionListener a2 = (ae) -> { UserPass a = new UserPass(); dispose();};
		btnRegister.addActionListener(a2);
 
		
		setTitle("User's Registeration");
		setSize(600,800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
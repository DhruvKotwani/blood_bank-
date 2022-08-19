import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.lang.*;


class BloodBankRegister extends JFrame
{
	Container c;
	JLabel lblName , lblMobile , lblAddress , lblCity , lblState;
	JTextField txtName , txtMobile , txtCity , txtState , txtAddress ;
	JButton btnRegister , btnBack;
	
	BloodBankRegister()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		Font f = new Font("Calibri",Font.BOLD,30);
		
		lblName = new JLabel("Enter the name of the organization : ");
		lblName.setFont(f);
		c.add(lblName);
		txtName = new JTextField(20);
		txtName.setFont(f);
		c.add(txtName);
		lblMobile = new JLabel("Enter the mobile no of the organization : ");
		lblMobile.setFont(f);
		c.add(lblMobile);
		txtMobile = new JTextField(20);
		txtMobile.setFont(f);
		c.add(txtMobile);
		lblAddress = new JLabel("Enter the address of the organization : ");
		lblAddress.setFont(f);
		c.add(lblAddress);
		txtAddress = new JTextField(20);
		txtAddress.setFont(f);
		c.add(txtAddress);
		lblCity = new JLabel("Enter the City Name  : ");
		lblCity.setFont(f);
		c.add(lblCity);
		txtCity = new JTextField(20);
		txtCity.setFont(f);
		c.add(txtCity);
		lblState = new JLabel("Enter the State Name : ");
		lblState.setFont(f);
		c.add(lblState);
		txtState = new JTextField(20);
		txtState.setFont(f);
		c.add(txtState);
		btnRegister = new JButton(" Register ");
		btnRegister.setFont(f);
		c.add(btnRegister);
		btnBack = new JButton("Back");
		btnBack.setFont(f);
		c.add(btnBack);
		 
		ActionListener a1 = (ae) -> { BloodBankLogin a = new BloodBankLogin(); dispose(); };
		btnBack.addActionListener(a1);
		ActionListener a2 = (ae) -> { BloodBankPass a = new BloodBankPass(); dispose(); };
		btnRegister.addActionListener(a2);

		
		setTitle("Blood Bank's Registeration");
		setSize(600,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setVisible(true);
	}
	
}
		
	
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main extends JFrame
{
	Container c;
	JButton btnAdmin , btnBloodBank , btnHospital , btnUser;
	
	Main()
	{
		c = getContentPane();
		c.setLayout(new GridLayout(4,1,10,10));
	
		Font f = new Font("Calibri",Font.BOLD,30);

		btnAdmin = new JButton("Admin's Login");
		btnAdmin.setFont(f);
		c.add(btnAdmin);
		btnBloodBank = new JButton("Blood Bank's Login");
		btnBloodBank.setFont(f);
		c.add(btnBloodBank);
		btnHospital = new JButton("Hospital's Login");
		btnHospital.setFont(f);
		c.add(btnHospital);
		btnUser = new JButton("User's Login");
		btnUser.setFont(f);
		c.add(btnUser);
		
		ActionListener a1 = (ae) -> { AdminLogin a = new AdminLogin(); dispose();};
		btnAdmin.addActionListener(a1);
		ActionListener a2 = (ae) -> { BloodBankLogin a = new BloodBankLogin(); dispose();};
		btnBloodBank.addActionListener(a2);
		ActionListener a3 = (ae) -> { HospitalLogin a = new HospitalLogin(); dispose();};
		btnHospital.addActionListener(a3);
		ActionListener a4 = (ae) -> { UserLogin a = new UserLogin(); dispose();};
		btnUser.addActionListener(a4);

		
		setTitle("HomePage");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
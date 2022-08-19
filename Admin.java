import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Admin extends JFrame
{
	Container c;
	JButton btnBack , btnManageAdmin , btnManageOrg , btnManageHospital , btnManageUser;
	
	Admin()
	{
		c = getContentPane();
		c.setLayout(new GridLayout(5,1,10,10));
		
		Font f = new Font("Calibri",Font.BOLD,30);
		
		btnManageAdmin = new JButton("Manage Admin");
		btnManageAdmin.setFont(f);
		c.add(btnManageAdmin);
		btnManageOrg = new JButton("Manage Organisation's");
		btnManageOrg.setFont(f);
		c.add(btnManageOrg);
		btnManageHospital = new JButton("Manage Hospital's");
		btnManageHospital.setFont(f);
		c.add(btnManageHospital);
		btnManageUser = new JButton("Manage User's");
		btnManageUser.setFont(f);
		c.add(btnManageUser);
		btnBack = new JButton("Back");
		btnBack.setFont(f);
		c.add(btnBack);
		
		ActionListener a1 = (ae) -> { AdminLogin a = new AdminLogin(); dispose(); };
		btnBack.addActionListener(a1);
		ActionListener a2 = (ae) -> { ManageAdmin a = new ManageAdmin(); dispose();};
		btnManageAdmin.addActionListener(a2);
		ActionListener a3 = (ae) -> { ManageOrg a = new ManageOrg(); dispose();};
		btnManageOrg.addActionListener(a3);
		ActionListener a4 = (ae) -> { ManageHospital a = new ManageHospital(); dispose();};
		btnManageHospital.addActionListener(a4);
		ActionListener a5 = (ae) -> { ManageUser a = new ManageUser(); dispose();};
		btnManageUser.addActionListener(a5);
				
		setTitle("Admin Menu");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
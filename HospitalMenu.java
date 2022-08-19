import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.lang.*;

class HospitalMenu extends JFrame
{
	Container c;
	JButton btnAdd , btnDelete , btnBack;
	
	HospitalMenu()
	{
		c = getContentPane();
		c.setLayout(new GridLayout(3,1,10,10));

		Font f = new Font("Calibri",Font.BOLD,30);
		
		btnAdd = new JButton("Add");
		btnAdd.setFont(f);
		c.add(btnAdd);
		btnDelete = new JButton("Delete");
		btnDelete.setFont(f);
		c.add(btnDelete);
		btnBack = new JButton("Back");
		btnBack.setFont(f);
		c.add(btnBack);
		
		ActionListener a1 = (ae) -> { HospitalLogin a = new HospitalLogin(); dispose();};
		btnBack.addActionListener(a1);
		
		setTitle("Hospital Menu ");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}	
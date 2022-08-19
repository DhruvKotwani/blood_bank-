import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ManageAdmin extends JFrame
{
	Container c;
	JButton btnBack , btnAdd , btnDelete ;
	
	ManageAdmin()
	{
		c = getContentPane();
		c.setLayout(new GridLayout(3,1,10,10));
		
		Font f = new Font("Calibri",Font.BOLD,30);
		
		btnAdd = new JButton("Add a new Admin");
		btnAdd.setFont(f);
		c.add(btnAdd);
		btnDelete = new JButton("Delete an Admin");
		btnDelete.setFont(f);
		c.add(btnDelete);
		btnBack = new JButton("Back");
		btnBack.setFont(f);
		c.add(btnBack);
		
		ActionListener a1 = (ae) -> { Admin a = new Admin(); dispose(); };
		btnBack.addActionListener(a1);
		
		setTitle("Manage Admin");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
} 
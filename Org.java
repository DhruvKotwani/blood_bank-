import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Org extends JFrame
{
	Container c;
	JButton btnAdd , btnDelete , btnUpdate , btnBack;
		
	Org()
	{
		c = getContentPane();
		c.setLayout(new GridLayout(4,1,10,10));
		
		Font f = new Font("Calibri",Font.BOLD,30);
		
		btnAdd = new JButton("Add a record");
		btnAdd.setFont(f);
		c.add(btnAdd);
		btnUpdate = new JButton("Update a record");
		btnUpdate.setFont(f);
		c.add(btnUpdate);
		btnDelete = new JButton("Delete a record");
		btnDelete.setFont(f);
		c.add(btnDelete);
		btnBack = new JButton("Back");
		btnBack.setFont(f);
		c.add(btnBack);
		
		ActionListener a1 = (ae) -> { BloodBankLogin a = new BloodBankLogin();
		
		setTitle(" Organisation Menu");
		setSize(400,400);
		setLoactionRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
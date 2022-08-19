import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class UserMenu extends JFrame
{
	Container c;
	JButton btnAdd , btnSearch , btnBack;
	
	UserMenu()
	{
		c = getContentPane();
		c.setLayout(new GridLayout(3,1,10,10));
		
		Font f = new Font("Calibri",Font.BOLD,30);
		
		btnAdd = new JButton("Register as Donor");
		btnAdd.setFont(f);
		c.add(btnAdd);
		btnSearch = new JButton("Search for the Donor");
		btnSearch.setFont(f);
		c.add(btnSearch);
		btnBack = new JButton("Back");
		btnBack.setFont(f);
		c.add(btnBack);
		
		ActionListener a1 = (ae) -> { UserLogin a = new UserLogin(); dispose(); };
		btnBack.addActionListener(a1);
		
		setTitle("User Menu");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
		
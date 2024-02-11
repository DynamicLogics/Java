package Assing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class GraphicAdminAddingUser extends JFrame implements ActionListener
{
	JButton b1,b2;
	JRadioButton r1,r2;
	JLabel l1,l2,l3;
	JTextArea t1,t2;
	ButtonGroup g1;
	
	GraphicAdminAddingUser() 
	{
		b1 = new JButton("Add");
		b2 = new JButton("Exit");
		l1 = new JLabel("username");
		l2 = new JLabel("password");
		t1 = new JTextArea();
		t2 = new JTextArea();
		r1 = new JRadioButton("male");
		r2 = new JRadioButton("female");
		l3 = new JLabel("Gender");
		g1 = new ButtonGroup();
		g1.add(r1);
		g1.add(r2);
		
		
		l1.setBounds(10, 20, 100, 30);
		t1.setBounds(130, 20, 100, 30);
		l2.setBounds(10, 60, 100, 30);
		t2.setBounds(130, 60, 100, 30);
		l3.setBounds(10, 110, 80, 20);
		r1.setBounds(100, 110, 60, 20);
		r2.setBounds(180, 110, 90, 20);
		b1.setBounds(10, 150, 80, 30);
		b2.setBounds(120, 150, 80, 30);
		
		
		b1.addActionListener(this);
		
		
		add(b1);
		add(b2);
		add(r1);
		add(r2);
		add(t1);
		add(t2);
		add(l1);
		add(l2);
		add(l3);
		
		setLayout(null);
		setSize(300,300);
		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource().equals(b1))
		{
			try
			{
			Class.forName("org.postgresql.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","cdac123");

			String str1 =t1.getText();
			String str2 =t2.getText();

			PreparedStatement ps = connection.prepareStatement("insert into userdetails values(?,?)");

			ps.setString(1,str1);
			ps.setString(2,str2);
			//ps.setString(3,str1);

			int value = ps.executeUpdate();

			if(value>0)
			{	
				System.out.println("User Details Added....");
			}

			else
			{	
				System.out.println("Error While Adding User Details....");
			}
			}
			catch(Exception r)
			{
				System.out.println("Error"+r);
			}

		}
		}
	


public static void main(String[] args)
	{
		 new GraphicAdminAddingUser();


}
}

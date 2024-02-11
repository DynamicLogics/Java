package Assing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class BankGraphics extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JButton b1,b2;
	JPasswordField p1;
	JTextArea t1;
	
	public BankGraphics() 
	{
		l1 = new JLabel("enter your name");
		l2 = new JLabel("enter your password");
		p1 = new JPasswordField();
		b1 = new JButton("login");
		b2 = new JButton("cancle");
		t1 = new JTextArea();
		
		l1.setBounds(30, 40, 100, 30);
		t1.setBounds(150, 40, 100, 30);
		l2.setBounds(30, 80, 120, 30);
		p1.setBounds(150, 80, 120, 30);
		b1.setBounds(60, 120, 90, 30);
		b2.setBounds(160, 120, 90, 30);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		add(l1);
		add(l2);
		add(p1);
		add(t1);
		add(b1);
		add(b2);
		
		setLayout(null);
		setSize(350,350);
		setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource().equals(b1))
		{
			String str = t1.getText();
			String str1 = p1.getText();
			
			if(str.equalsIgnoreCase("Admin") && str1.equalsIgnoreCase("root"))
			{
				new GraphicAdminAddingUser();
			}
		}
	}

	public static void main(String[] args)
	{
		new BankGraphics();
	}

}

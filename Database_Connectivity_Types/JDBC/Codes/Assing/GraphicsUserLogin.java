package Assing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class GraphicsUserLogin extends JFrame implements ActionListener
{
	JButton b1,b2;
	JRadioButton r1,r2;
	JLabel l1,l2,l3;
	JTextArea t1,t2;
	ButtonGroup g1;
	
	GraphicsUserLogin() 
	{
		b1 = new JButton("Login");
		b2 = new JButton("Exit");
		l1 = new JLabel("username");
		l2 = new JLabel("password");
		t1 = new JTextArea();
		t2 = new JTextArea();

		
		l1.setBounds(10, 20, 100, 30);
		t1.setBounds(130, 20, 100, 30);
		l2.setBounds(10, 60, 100, 30);
		t2.setBounds(130, 60, 100, 30);
		b1.setBounds(10, 150, 80, 30);
		b2.setBounds(120, 150, 80, 30);
		
		
		add(b1);
		add(b2);
		add(t1);
		add(t2);
		add(l1);
		add(l2);
		
		setLayout(null);
		setSize(300,300);
		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{

	}
	

	public static void main(String[] args) 
	{
		new GraphicsUserLogin();

	}

}

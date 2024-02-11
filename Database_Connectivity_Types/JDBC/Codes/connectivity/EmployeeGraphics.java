package allFiles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class EmployeeGraphics extends JFrame implements ActionListener
{	
	JButton b1,b2;
	JTextField t1,t2,t3,t4;
	
	EmployeeGraphics()
	{
		b1 = new JButton("ok");
		b2 = new JButton("cancle");
		
		t1 = new JTextField("insert empno");
		t1 = new JTextField("insert ename");
		t1 = new JTextField("insert salary");
		t1 = new JTextField("insert department");
		
		t1.setBounds(10, 20, 100, 40);
		t1.setBounds(10, 60, 100, 40);
		t1.setBounds(10, 80, 100, 40);
		t1.setBounds(10, 100, 100, 40);
		
		b1.setBounds(10, 160, 60, 30);
		b1.setBounds(80, 160, 60, 30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		add(b1);
		add(b2);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		

	}

	public void actionPerformed(ActionEvent e) 
	{
		new EmployeeGraphics();
		
	}

}

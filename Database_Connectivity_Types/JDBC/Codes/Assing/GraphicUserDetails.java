package Assing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class GraphicUserDetails extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
	JButton b1,b2;
	JRadioButton r1,r2;//r3;
	ButtonGroup g1;
	
	GraphicUserDetails()
	{
		b1 = new JButton("Upload");
		b2 = new JButton("Exit");
		
		t1 = new JTextField("name");
		t2 = new JTextField("age");
		t3 = new JTextField("Nationality");
		t4 = new JTextField("State");
		t5 = new JTextField("Addhar-Card Number");
		t6 = new JTextField("Occupation");
		t7 = new JTextField("Bank-Name");
		t8 = new JTextField("Account-Type");
		t9 = new JTextField("Deposite-Amount");
		t10 = new JTextField("Yearly-Income");
		t11 = new JTextField("Todays-Date");
		
		r1 = new JRadioButton("male");
		r2 = new JRadioButton("female");
		
		g1 = new ButtonGroup();
		g1.add(r1);
		g1.add(r2);
		//g1.add(r3);
		//add(r1);
		//add(r2);
		
		l1 = new JLabel("name");
		l2 = new JLabel("age");
		l3 = new JLabel("Gender");
		l4 = new JLabel("Nationality");
		l5 = new JLabel("State");
		l6 = new JLabel("Addhar-Card Number");
		l7 = new JLabel("Occupation");
		l8 = new JLabel("Bank-Name");
		l9 = new JLabel("Account-Type");
		l10 = new JLabel("Deposite-Amount");
		l11 = new JLabel("Yearly-Income");
		l12 = new JLabel("Todays-Date");
		
		//r3 = new JRadioButton("female");
		
		l1.setBounds(20, 20, 100, 30);
		t1.setBounds(140, 20, 100, 30);
		l2.setBounds(20, 60, 100, 30);
		t2.setBounds(140, 60, 100, 30);
		l3.setBounds(20, 90, 100, 30);
		r1.setBounds(130, 90, 100, 30);
		r2.setBounds(250, 90, 100, 30);
		
		l4.setBounds(20, 130, 100, 30);
		t3.setBounds(140, 130, 100, 30);
		
		l5.setBounds(20, 160, 100, 30);
		t4.setBounds(140, 160, 100, 30);
		
		l6.setBounds(20, 190, 100, 30);
		t5.setBounds(140, 190, 100, 30);
		l7.setBounds(20, 220, 100, 30);
		t6.setBounds(140, 220, 100, 30);
		l8.setBounds(20, 250, 100, 30);
		t7.setBounds(140, 250, 100, 30);
		l9.setBounds(20, 280, 100, 30);
		t8.setBounds(140, 280, 100, 30);
		l10.setBounds(20, 310, 100, 30);
		t9.setBounds(140, 310, 100, 30);
		l11.setBounds(20, 330, 100, 30);
		t10.setBounds(140, 330, 100, 30);
		l12.setBounds(20, 360, 100, 30);
		t11.setBounds(140, 360, 100, 30);
		
		b1.setBounds(60, 400, 100, 35);
		b2.setBounds(180, 400, 100, 35);
		
		add(r1);
		add(r2);
		//add(r3);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		add(l10);
		add(l11);
		add(l12);
		
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(t7);
		add(t8);
		add(t9);
		add(t10);
		add(t11);
		add(b1);
		add(b2);
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args)
	{
		new GraphicUserDetails();
	}


}

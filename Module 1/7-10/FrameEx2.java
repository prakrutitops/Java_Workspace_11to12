package com.a710;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FrameEx2 implements ActionListener
{
	
	JFrame frame;
	JTextField tf1,tf2,tf3;
	JButton btn1,btn2;
	
	public FrameEx2() 
	{
		frame = new JFrame();
		
		tf1 = new JTextField();
		tf1.setBounds(162, 20, 150, 20);
		
		tf2 = new JPasswordField();
		tf2.setBounds(162, 51, 150, 20);
		
		tf3 = new JTextField();
		tf3.setBounds(162, 85, 150, 20);
		tf3.setEditable(false);
		
		btn1 = new JButton("+");
		btn1.setBounds(180, 129, 52, 44);
		btn1.addActionListener(this);
		
		btn2 = new JButton("-");
		btn2.setBounds(250, 129, 52, 44);
		btn2.addActionListener(this);
		
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(btn1);
		frame.add(btn2);
		
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args)
	{
		new FrameEx2();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
	
		String a = tf1.getText().toString();
		String b = tf2.getText().toString();
		int c = 0;
		
		if(e.getSource()==btn1)
		{
			c=Integer.parseInt(a)+Integer.parseInt(b);
		}
		if(e.getSource()==btn2)
		{
			c=Integer.parseInt(a)-Integer.parseInt(b);
		}
		
		tf3.setText(String.valueOf(c));
	}
}

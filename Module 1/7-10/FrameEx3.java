package com.a710;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FrameEx3 implements ActionListener
{
	
	JFrame frame;
	JTextArea ta;
	JButton btn;
	JLabel l1,l2;
	
	public FrameEx3() 
	{
		frame = new JFrame();
		
		ta = new JTextArea();
		ta.setBounds(60, 39, 322, 119);
		
		btn = new JButton("Count");
		btn.setBounds(176, 183, 89, 23);
		btn.addActionListener(this);
		l1 = new JLabel();
		l1.setBounds(70, 14, 176, 14);
		//l1.setSize(0, 0);
		
		l2 = new JLabel();
		l2.setBounds(304, 14, 176, 14);
		
		frame.add(ta);
		frame.add(btn);
		frame.add(l1);
		frame.add(l2);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args)
	{
		new FrameEx3();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource()==btn)
		{
			String a = ta.getText().toString();
			String words[]= a.split("\\s");
			l1.setText("Words are: "+words.length);
			l2.setText("Characters are: "+a.length());
			
		}
		
	}
	
}

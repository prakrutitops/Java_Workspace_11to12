package com.a710;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameEx 
{
	JFrame frame;
	JButton btn;
	
	public FrameEx() 
	{
		frame = new JFrame();
		
		btn = new JButton("One");
		btn.setBounds(83, 11, 176, 66);
		
		
		frame.add(btn);
		
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new FrameEx();
	}
}

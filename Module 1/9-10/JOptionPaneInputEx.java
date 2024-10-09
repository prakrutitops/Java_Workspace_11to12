package com.a910;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPaneInputEx 
{
	JFrame frame;
	
	JOptionPaneInputEx()
	{
		frame = new JFrame();
		
		String name= JOptionPane.showInputDialog(frame,"Enter Your Name");
		System.out.println(name);
	}
	
	public static void main(String[] args) 
	{
		new JOptionPaneInputEx();
	}
}

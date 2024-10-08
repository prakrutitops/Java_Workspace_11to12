package com.a810;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ComboBoxEx1 implements ActionListener
{
	
	JFrame frame;
	JComboBox<String> cb;
	String city[]= {"Select Your City","Rajkot","Ahmedabad","Baroda"};
	
	public ComboBoxEx1() 
	{
		frame = new JFrame();
		
		cb = new JComboBox<>(city);
		cb.setBounds(164, 169, 130, 22);
		cb.addActionListener(this);
		frame.add(cb);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new ComboBoxEx1();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==cb)
		{
			System.out.println(cb.getItemAt(cb.getSelectedIndex()));
			
		}
	}
	
	
}

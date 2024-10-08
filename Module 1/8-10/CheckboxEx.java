package com.a810;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CheckboxEx implements ItemListener
{
	
	JFrame frame;
	JCheckBox chk1,chk2,chk3;
	
	public CheckboxEx() 
	{
		frame = new JFrame();
		
		chk1 = new JCheckBox("Java");
		
		
		chk2 = new JCheckBox("Android");
		
		
		chk3 = new JCheckBox("Php");
		
		chk1.addItemListener(this);
		chk2.addItemListener(this);
		chk3.addItemListener(this);
		
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new CheckboxEx();
	}
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		if(e.getSource()==chk1)
		{
			JOptionPane.showMessageDialog(frame,"Checkbox1 Clicked");
		}
		if(e.getSource()==chk2)
		{
			JOptionPane.showMessageDialog(frame,"Checkbox2 Clicked");

		}
		if(e.getSource()==chk3)
		{
			JOptionPane.showMessageDialog(frame,"Checkbox3 Clicked");

		}
		
	}
}

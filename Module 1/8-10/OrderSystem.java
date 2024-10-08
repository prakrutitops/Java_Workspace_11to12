package com.a810;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class OrderSystem implements ActionListener
{
	JFrame frame;
	JCheckBox chk1,chk2,chk3;
	JButton btnorder;
	JLabel l1;
	
	public OrderSystem() 
	{
		frame = new JFrame();
		
		l1 = new JLabel("Cafe Ordering System");
		l1.setBounds(186, 10, 146, 14);
		
		chk1 = new JCheckBox("Pizza @ Rs.100");
		chk1.setBounds(164, 50, 197, 23);
		
		chk2 = new JCheckBox("Burger @ Rs. 70");
		chk2.setBounds(164, 80, 197, 23);
		
		chk3 = new JCheckBox("Coffee @ Rs. 120");
		chk3.setBounds(164, 110, 197, 23);
		
		btnorder = new JButton("Order");
		btnorder.setBounds(172, 150, 150, 23);
		
		btnorder.addActionListener(this);
		
		
		frame.add(l1);
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.add(btnorder);
		
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new OrderSystem();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
		int amount = 0;
		StringBuffer buffer = new StringBuffer();
		buffer.append("\n selected items: ");
		
		if(chk1.isSelected())
		{
			amount+=100;
			buffer.append("\n Pizza @ Rs. 100");

		}
		if(chk2.isSelected())
		{
			amount+=70;
			buffer.append("\n Burger @ Rs. 70");

		}
		if(chk3.isSelected())
		{
			amount+=120;
			buffer.append("\n Coffee @ Rs. 120");

		}
		buffer.append("\n Total: "+amount);
		JOptionPane.showMessageDialog(frame,buffer.toString());
	}
	
}

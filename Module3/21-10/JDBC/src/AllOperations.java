import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AllOperations 
{
	
	JFrame insertframe;
	JTextField tfname,tfsurname;
	JButton insert;
	
	
	public void insertdata()
	{
		insertframe = new JFrame();
		
		tfname = new JTextField(15);
		tfsurname = new JTextField(15);
		insert = new JButton("INSERT");
		
		insert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				
				
				
				
			}
		});
		
		insertframe.add(tfname);
		insertframe.add(tfsurname);
		insertframe.add(insert);
		insertframe.setSize(500,500);
		insertframe.setLayout(new FlowLayout());
		insertframe.setVisible(true);
	}
}

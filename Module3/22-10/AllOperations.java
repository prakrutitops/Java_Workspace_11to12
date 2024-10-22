import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

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
				
				String db ="jdbc";	
				String host="jdbc:mysql://localhost:3306/";
				String url = host+db;
				
				String name1 = tfname.getText().toString();
				String surname1 = tfsurname.getText().toString();
				
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					
					String sql = "insert into details values (null,'"+name1+"','"+surname1+"')";
					
					Statement stmt = con.createStatement();
					
					int status = stmt.executeUpdate(sql);
					
					if(status > 0)
					{
						System.out.println("Inserted");
						insertframe.setVisible(false);
					}
					else
					{
						System.out.println("Fail");
					}
					
					
					
				}
				catch (Exception e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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

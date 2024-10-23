import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AllOperations 
{
	
	JFrame insertframe,deleteframe,updateframe;
	JTextField tfname,tfsurname,tfid;
	JButton insert,delete,update,edit;
	JPanel jp,jp2;
	int did=0;
	
	
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
	
	public void viewdata()
	{
		String db ="jdbc";	
		String host="jdbc:mysql://localhost:3306/";
		String url = host+db;
		
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","");
			
			String sql = "select * from details";
			
			Statement stmt = con.createStatement();
			
			ResultSet set = stmt.executeQuery(sql);
			
			System.out.println("\tID \tNAME \tSURNAME");
			while(set.next())
			{
				
				int id = set.getInt(1);
				String name = set.getString(2);
				String surname = set.getString(3);
				
				
				System.out.println("\t"+id+" \t"+name+" \t"+surname);
				
				
				
			}
		
			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void deletedata()
	{
		
		
		deleteframe = new JFrame();
		tfid = new JTextField(15);
		delete = new JButton("Delete");
		
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String id = tfid.getText().toString();	
				int id2 = Integer.parseInt(id);
				
				
				String db ="jdbc";	
				String host="jdbc:mysql://localhost:3306/";
				String url = host+db;
				
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					String sql = "delete from details where id='"+id2+"'";
					
					Statement stmt = con.createStatement();
					int status = stmt.executeUpdate(sql);
					
					if(status>0)
					{
						deleteframe.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
					
					
					
				}
				catch (Exception e2) 
				{
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				
				
				
			}
		});
		
		
		deleteframe.add(tfid);
		deleteframe.add(delete);
		deleteframe.setSize(500,500);
		deleteframe.setLayout(new FlowLayout());
		deleteframe.setVisible(true);
	}
	public void updatedata()
	{
		updateframe = new JFrame();
		
		jp = new JPanel();
		jp2 = new JPanel();
		
		tfid = new JTextField(15);
		tfname = new JTextField(15);
		tfsurname = new JTextField(15);
		update = new JButton("Update");
		edit = new JButton("Edit");
		
		jp.add(tfid);
		jp.add(edit);
		
		jp2.add(tfname);
		jp2.add(tfsurname);
		jp2.add(update);
		
		jp2.setVisible(false);
		
		edit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
			
				String myid = tfid.getText().toString();
				int myid2 = Integer.parseInt(myid);
				
				did = myid2;
				
				String db ="jdbc";	
				String host="jdbc:mysql://localhost:3306/";
				String url = host+db;
				
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					String sql = "select * from details where id='"+myid2+"'";
					
					Statement stmt = con.createStatement();
					
					ResultSet set = stmt.executeQuery(sql);
					
					if(set.next())
					{
						int id = set.getInt(1);
						String name = set.getString(2);
						String surname = set.getString(3);
						
						tfname.setText(name);
						tfsurname.setText(surname);
					
						
						jp2.setVisible(true);
						jp.setVisible(false);
						
						
						
					}
					
				}
				catch(Exception e2)
				{
					e2.printStackTrace();
				}
				
				
			}
		});
		
		update.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				
				String n = tfname.getText().toString();
				String s = tfsurname.getText().toString();
				
				String db ="jdbc";	
				String host="jdbc:mysql://localhost:3306/";
				String url = host+db;
		
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					String sql = "update details set name='"+n+"',surname='"+s+"' where id='"+did+"'";
					
					Statement stmt = con.createStatement();
					
					int status = stmt.executeUpdate(sql);
					
					if(status>0)
					{
						updateframe.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
					
				}
				catch (Exception e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		
		
		
		
		
		
		
		updateframe.add(jp);
		updateframe.add(jp2);
		updateframe.setSize(500,500);
		updateframe.setLayout(new FlowLayout());
		updateframe.setVisible(true);
		
		
	}
}

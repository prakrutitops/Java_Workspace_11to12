package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.model.SignupModel;

public class Dao 
{
	
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecom","root","");

		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	
	public static int signupuser(SignupModel m)
	{
		int status = 0;
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into users (fullname,email,phone,password) values (?,?,?,?)");
			
			ps.setString(1,m.getFullname());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getPhone());
			ps.setString(4,m.getPassword());
			
			status = ps.executeUpdate();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
		
		
	}
	
	
}

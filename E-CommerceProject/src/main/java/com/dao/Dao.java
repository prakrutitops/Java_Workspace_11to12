package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import com.model.ProductModel;
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
	
	public static SignupModel loginuser(SignupModel m)
	{
		int status = 0;
		Connection con = Dao.getconnect();
		SignupModel m2 = null;
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from users where email=? and password=?");
			
			ps.setString(1,m.getEmail());
			ps.setString(2,m.getPassword());
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				int id = set.getInt(1);
				String fname = set.getString(2);
				String email = set.getString(3);
				String phone = set.getString(4);
				String pass = set.getString(5);
			
				
				 m2 = new SignupModel();
				m2.setId(id);
				m2.setFullname(fname);
				m2.setEmail(email);
				m2.setPhone(phone);
				m2.setPassword(pass);
				
			}
			
			//status = ps.executeUpdate();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return m2;
		
		
	}
	
	
	public static List<ProductModel>viewproducts()
	{
		
		List<ProductModel>list = new ArrayList<>();
		
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from products");
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				
				int id = set.getInt(1);
				String p_name = set.getString(2);
				String p_price = set.getString(3);
				String p_des = set.getString(4);
				
				byte[] imgData = set.getBytes(5);
				String encode = Base64.getEncoder().encodeToString(imgData);
				//String p_image = set.getString(5);
				
				ProductModel pm = new ProductModel();
				pm.setId(id);
				pm.setP_name(p_name);
				pm.setP_price(p_price);
				pm.setP_des(p_des);
				pm.setP_image(encode);
				
				list.add(pm);
				
			}
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
		
	}
	
	
	
	
	
	
}

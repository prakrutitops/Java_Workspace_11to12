package com.atest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeEx 
{
	public static void main(String[] args) 
	{
		
		try 
		{
			Student s1 = new Student(101, "abcd");
			FileOutputStream fout = new FileOutputStream("D://a.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			System.out.println("success");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}

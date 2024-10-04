package com.atest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerializeEx2 
{
	public static void main(String[] args) 
	{
		
		try 
		{
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://a.txt"));
			Student s = (Student) in.readObject();
			System.out.println(s.id+" "+s.name);
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}

package com.a110;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx 
{
	public static void main(String[] args)
	{
		System.out.println("Hello");
		
		try 
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		
		System.out.println("Welcome");
		try 
		{
			String s = "welcome to tops";
			FileOutputStream fout = new FileOutputStream("E://java123.txt");
			fout.write(s.getBytes());
		}
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("success");
		}
	}
}

package com.a110;

public class TrycatchEx 
{
	public static void main(String[] args) 
	{
		try
		{
			int data = 10/0;
			System.out.println(data);
		}
		catch(Exception e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Success");
			
		}
		
		
	}
}

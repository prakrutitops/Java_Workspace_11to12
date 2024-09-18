package com.a189;

public class NestedIfEx 
{
	public static void main(String[] args) 
	{
		
		int age = 68;
		
		if(age>=18)
		{
			System.out.println("Eligible to vote");
			
			if(age>=60)
			{
				System.out.println("Senior Citizen");
			}
			else
			{
				
			}
			
		}
		else
		{
			System.out.println("Not Eligible to vote");
		}
		
		
	}
}

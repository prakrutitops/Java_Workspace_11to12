package com.a210;

public class ThrowEx 
{
	static void validate(int age) 
	{
		if(age>18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			throw new ArithmeticException("Not Eligible to vote");
			//throw new Exception();
		}
	}
	
	public static void main(String[] args) 
	{
		validate(12);
	}
}

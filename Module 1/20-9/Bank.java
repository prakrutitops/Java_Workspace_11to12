package com.a209;

public class Bank 
{
	static int count = 0;
	
	public Bank() 
	{
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args)
	{
		
		Bank b1 = new Bank();
		Bank b2 = new Bank();
		Bank b3 = new Bank();
		
	}
}

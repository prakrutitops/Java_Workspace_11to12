package com.a269;

public class OverloadinEx 
{
	
	static int add(int a,int b)
	{
		return a+b;
	}
	static double add(double a,double b)
	{
		return a*b;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(add(6,5));
		System.out.println(add(4.00,5.00));
	}
}

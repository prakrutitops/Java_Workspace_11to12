package com.a279;

public class StringClass 
{
	public static void main(String[] args) 
	{
		//Obj
		
		String s1 = "Sachin";//literal String
		
		String s2 = new String("Sachin");//keyword String
		
		char data[]= {'s','a','c','h','i','n'};//character array string
		String s3 = new String(data);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
}

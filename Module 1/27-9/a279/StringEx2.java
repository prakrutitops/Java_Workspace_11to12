package com.a279;

public class StringEx2 
{
	public static void main(String[] args) 
	{
		
		String s1 ="sachin";
		String s2 = new String("sachin");
		String s3 ="sachin";
		String s4 = "ratan";
		String s5 ="SACHIN";
		
		//equals
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(s3));
//		System.out.println(s1.equals(s4));
		
		//equalsignorecase
//		System.out.println(s1.equals(s3));
//		System.out.println(s1.equalsIgnoreCase(s5));
		
		//==
//		System.out.println(s1==s2);
//		System.out.println(s1==s3);
//		System.out.println(s1==s4);
		
		//compareTo
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
	}
}

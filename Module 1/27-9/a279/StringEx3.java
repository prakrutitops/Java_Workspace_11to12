package com.a279;

public class StringEx3 
{
	public static void main(String[] args) 
	{
		
		String s1 = "sachin";
		String s2 = "SACHIN";
		String s3 = "  tops  ";
		String s4 = "Java is a programming language ,Java is providing secure platform";
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s3.trim());
		System.out.println(s1.charAt(0));
		System.out.println(s1.startsWith("sa"));
		System.out.println(s1.endsWith("in"));
		System.out.println(s4.replace("Java", "tops"));
		System.out.println(s4.length());
	}
}

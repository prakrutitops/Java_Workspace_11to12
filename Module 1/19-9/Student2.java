package com.a199;

import java.util.Scanner;

public class Student2 
{
	
	//data members or variables
	int id;
	String name;
	
	
	public static void main(String[] args)
	{
		
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();
	
		s1.id=101;
		s1.name="shiv";
		
		s2.id=102;
		s2.name="neelam";
		
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
	}
	
}

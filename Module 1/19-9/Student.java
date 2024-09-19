package com.a199;

import java.util.Scanner;

public class Student 
{
	
	//data members or variables
	int id;
	String name;
	
	
	public static void main(String[] args)
	{
		//object is o1
		Student o1 = new Student();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Id");
		int i = sc.nextInt();
		
		System.out.println("Enter Your Name");
		String s = sc.next();
		
		o1.id=i;
		o1.name=s;
		
		System.out.println(i+" "+s);
		
		
	}
	
}

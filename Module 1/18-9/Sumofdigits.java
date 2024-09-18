package com.a189;

import java.util.Scanner;

public class Sumofdigits 
{
	public static void main(String[] args) 
	{
		
		//int num = 8748954;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num = sc.nextInt();
		
		int sum =0;//4//7//9//10
		
		while(num>0) 
		{
			int rem = num%10;//4//3//2//1
			sum+=rem;
			num=num/10;//123//12//1//
		}
		System.out.println("Sum of all digits:"+sum);
		
		
		
		
	}
}

package com.a189;

import java.util.Scanner;

public class maxnumex 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num = sc.nextInt();
		
		int max =0;
		
		while(num>0) 
		{
			int rem = num%10;
			
			if(rem>max)
			{
				max = rem;
			}
			
			num = num/10;
			
		}
		System.out.println("Max Number:"+max);
		
		
		
		
	}
}

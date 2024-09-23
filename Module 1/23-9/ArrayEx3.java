package com.a239;

public class ArrayEx3 
{
	public static void main(String[] args) 
	{
		
		int arr1[] = {10,20,30,40,50};
		
		int arr2[] = new int[10];
		
		System.arraycopy(arr1, 0, arr2, 1, 3);
		
		for(int i=0;i<10;i++)
		{
			System.out.println(arr2[i]);
		}
		
		
		
		
	}
}

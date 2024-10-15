package com.a1510;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx 
{
	public static void main(String[] args) 
	{
		
		HashSet set = new HashSet<>();
		
		set.add("android");
		set.add("java");
		set.add("php");
		set.add("ios");
		set.add("xampp");
		set.add("java");
		
		Iterator i = set.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}
}

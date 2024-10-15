package com.a1510;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx2 
{
	public static void main(String[] args) 
	{
		
		LinkedHashSet set = new LinkedHashSet<>();
		
		set.add("android");
		set.add("java");
		set.add("php");
		set.add("ios");
		set.add("xampp");
		set.add("android");
		
		Iterator i = set.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}
}

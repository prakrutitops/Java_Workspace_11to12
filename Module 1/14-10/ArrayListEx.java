package com.a1410;

import java.util.*;

public class ArrayListEx 
{
	public static void main(String[] args)
	{
		ArrayList<String>arrayList = new ArrayList<>();
		
		arrayList.add("Neelam");
		arrayList.add("Devang");
		arrayList.add("Shiv");
		
		ArrayList<String>arrayList2 = new ArrayList<>();
		
		arrayList2.add("Rahul");
		arrayList2.add("Kapil");
		arrayList2.add("Deep");
		arrayList2.add("Devang");
		//System.out.println(arrayList);
	
		//arrayList.addAll(arrayList2);
		//arrayList.remove(1);
		//arrayList.removeAll(arrayList2);
		arrayList.retainAll(arrayList2);
		
		Iterator<String> i = arrayList.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
}

package com.a1410;

import java.util.*;

public class LinkedListEx 
{
	public static void main(String[] args)
	{
		LinkedList<String>arrayList = new LinkedList<>();
		
		arrayList.add("Neelam");
		arrayList.add("Devang");
		arrayList.add("Shiv");
		
		LinkedList<String>arrayList2 = new LinkedList<>();
		
		arrayList2.add("Rahul");
		arrayList2.add("Kapil");
		arrayList2.add("Deep");
		arrayList2.add("Devang");
		
		//System.out.println(arrayList);
	
		//arrayList.addAll(arrayList2);
		//arrayList.remove(1);
		//arrayList.removeAll(arrayList2);
		//arrayList.retainAll(arrayList2);
		
		arrayList.addAll(arrayList2);
		arrayList.addFirst("Jay");
		arrayList.addLast("Xyz");
		Iterator<String> i = arrayList.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
}

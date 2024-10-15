package com.a1510;

import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector<>(5);
		
		v.addElement("android");
		v.addElement("java");
		v.addElement("php");
		v.addElement("ios");
		v.addElement("php");
		v.addElement("ios");
		v.addElement("php");
		v.addElement("ios");
		v.addElement("php");
		v.addElement("ios");
		v.addElement("ios");
		
		System.out.println("Size: "+v.size());
		System.out.println("Capacity: "+v.capacity());
		
		
		
	}
}

package com.a199;

public class ParaEx 
{
	int id;
	String name;
	
	public ParaEx(int id,String name)
	{
		
		this.id = id;
		this.name = name;
		
	}
	
	//method create
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) 
	{
		
		ParaEx p1 = new ParaEx(101, "neelam");
		ParaEx p2 = new ParaEx(102, "shiv");
		
		//method calling
		p1.display();
		p2.display();
		
//		System.out.println(p1.id+" "+p1.name);
//		System.out.println(p2.id+" "+p2.name);
		
		
	}
}

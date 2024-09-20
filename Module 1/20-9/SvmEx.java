package com.a209;

public class SvmEx 
{
	int id;
	String name;
	static String college="VVP";//static variable
	
	public SvmEx(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	
	static void change()
	{
		college="Marwadi";
	}
	
	public static void main(String[] args) 
	{
		SvmEx s1 = new SvmEx(101,"neelam");
		SvmEx s2 = new SvmEx(102,"shiv");
		
		//s1.display();
		
		change();
		
		s1.display();
		//s2.change();
		s2.display();
		
	}
}

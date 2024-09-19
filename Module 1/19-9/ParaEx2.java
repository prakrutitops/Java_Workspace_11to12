package com.a199;

public class ParaEx2 
{
	int id;
	String name;
	String surname;
	String email;
	String mobile;
	
	public ParaEx2(int id,String name,String surname,String email,String mobile)
	{
		
		this.id = id;
		this.name = name;
		this.surname=surname;
		this.email=email;
		this.mobile=mobile;
		
	}
	
	//method create
	void display()
	{
		System.out.println(id+" "+name+" "+surname+" "+email+" "+mobile);
	}
	
	public static void main(String[] args) 
	{
		
		ParaEx2 p1 = new ParaEx2(101, "neelam","a","a","1");
		ParaEx2 p2 = new ParaEx2(102, "shiv","b","b","2");
		ParaEx2 p3 = new ParaEx2(103, "shiv","b","b","2");
		ParaEx2 p4 = new ParaEx2(104, "shiv","b","b","2");
		ParaEx2 p5 = new ParaEx2(105, "shiv","b","b","2");
		
		//method calling
		p1.display();
		p2.display();
		p3.display();
		p4.display();
		p5.display();
		
//		System.out.println(p1.id+" "+p1.name);
//		System.out.println(p2.id+" "+p2.name);
		
		
	}
}

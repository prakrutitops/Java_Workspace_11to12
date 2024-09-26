package com.a269;

class A
{
	String color="white";
}
class B extends A
{
	String color="black";
	
	void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperEx 
{
	
	
	public static void main(String[] args) 
	{
		
		B b1 = new B();
		b1.display();
	}
}

package com.a259;

class A1
{
	void a()
	{
		System.out.println("A called");
	}
}
class B1 extends A1
{
	void b()
	{
		System.out.println("B called");
	}
}
class C1 extends B1
{
	void c()
	{
		System.out.println("C called");
	}
}

public class MultilevelEx 
{
	public static void main(String[] args)
	{
		
		C1 c = new C1();
		c.a();
		c.b();
		c.c();
	}
}

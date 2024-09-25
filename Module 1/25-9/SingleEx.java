package com.a259;

class A
{
	void a()
	{
		System.out.println("A called");
	}
}
class B extends A
{
	void b()
	{
		System.out.println("B called");
	}
}

public class SingleEx 
{
	public static void main(String[] args)
	{
		
		B b = new B();
		//A a = new A();
		b.b();
		b.a();
	}
}

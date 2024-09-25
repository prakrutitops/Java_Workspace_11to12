package com.a259;

class M
{
	void m()
	{
		System.out.println("M Called");
	}
}
class N extends M
{
	void n()
	{
		System.out.println("N Called");
	}
}
interface J 
{
	void j();
}
class K extends N implements J
{
	void k()
	{
		System.out.println("K Called");
	}

	@Override
	public void j() 
	{
		System.out.println("J Called");
		
	}
}

public class HybridEx 
{
	public static void main(String[] args) 
	{
		K k = new K();
		k.m();
		k.n();
		k.j();
		k.k();
	}
}

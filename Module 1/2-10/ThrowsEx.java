package com.a210;

import java.io.IOException;

class M
{
	void m() throws IOException
	{
		System.out.println("M Executed");
	}
}
class N extends M
{
	void n() throws IOException
	{
		System.out.println("N Executed");
	}
}
class P extends N
{
	void p()
	{
		System.out.println("P Executed");
	}
}


public class ThrowsEx 
{
	
	public static void main(String[] args) throws IOException
	{
		P p = new P();
		
		p.m();
		p.n();
		p.p();
	}
}

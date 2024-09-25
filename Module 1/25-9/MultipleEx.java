package com.a259;

interface P
{
	void p();
}
interface Q
{
	void q();
}
class R implements P,Q
{

	//annotation
	@Override
	public void q() 
	{
		System.out.println("q");
		
	}

	@Override
	public void p() 
	{
		System.out.println("p");
	}

	
	
}

public class MultipleEx 
{
	public static void main(String[] args) 
	{
		
		R r = new R();
		r.p();
		r.q();
		
	}
}

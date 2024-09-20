package com.a209;

public class CopyConEx 
{
	int id;
	String name;
	
	CopyConEx(int id,String name) 
	{
		this.id=id;
		this.name=name;
	}
	CopyConEx(CopyConEx c3) 
	{
		//c3.id=101;
		System.out.println(c3.id+" "+c3.name);
	}
	
	public static void main(String[] args) 
	{
		CopyConEx c1 = new CopyConEx(101,"tops");
		CopyConEx c2 = new CopyConEx(c1);
	}
	
}

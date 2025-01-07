package com.model;

public class Person 
{
	int id;
	String name;
	Address address;
	
	Person(Address address) 
	{
		this.address=address;
	}
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display()
	{
		System.out.println(name+" lives in "+address.getAdd());
	}
	
	
	
}

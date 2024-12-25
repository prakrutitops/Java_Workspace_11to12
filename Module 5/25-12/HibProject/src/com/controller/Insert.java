package com.controller;

import java.util.Scanner;

import com.dao.Dao;
import com.model.Person;

public class Insert 
{	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name");
		System.out.println("Enter Surname");
	
		Person p = new Person();
		
		p.setName(sc.next());
		p.setSurname(sc.next());
		
		new Dao().insertdata(p);
		
		System.out.println("Inserted");
	}
}

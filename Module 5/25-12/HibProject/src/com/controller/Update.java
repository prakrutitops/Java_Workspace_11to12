package com.controller;

import java.util.Scanner;

import com.dao.Dao;
import com.model.Person;

public class Update 
{	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Id");
		System.out.println("Enter Name");
		System.out.println("Enter Surname");
	
		Person p = new Person();
		
		p.setId(sc.nextInt());
		p.setName(sc.next());
		p.setSurname(sc.next());
		
		new Dao().updatedata(p);
		
		System.out.println("Updated");
	}
}

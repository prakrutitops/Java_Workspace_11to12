package com.controller;

import java.util.Scanner;

import com.dao.Dao;
import com.model.Person;

public class Select 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID");
		int id = sc.nextInt();
		
	
		Person p = new Person();
		p.setId(id);
	
		
		Person p2 = new Dao().selectdata(p);
		
		System.out.println(p2.getId()+" "+p2.getName()+" "+p2.getSurname());
	}
}

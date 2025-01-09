package com.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bo.BO;
import com.model.Person;

public class MainClass 	
{
	public static void main(String[] args)
	{
		
		ApplicationContext acm = new ClassPathXmlApplicationContext("tops.xml");
		Scanner sc = new Scanner(System.in);
		BO bo = (BO) acm.getBean("bo");
		
		//INSERT PERSON DATA
		
		
//		Person p = new Person();
//		System.out.println("Enter Your Name");
//		p.setName(sc.next());
//		bo.insert(p);
		
		//DELETE PERSON DATA

//		Person p = new Person();
//		System.out.println("Enter Your Id");
//		p.setId(sc.nextInt());
//		bo.delete(p);
		
		//UPDATE PERSON DATA
		
//		Person p = new Person();
//		
//		System.out.println("Enter Your Id");
//		p.setId(sc.nextInt());
//		
//		System.out.println("Enter Your Name");
//		p.setName(sc.next());		
//		
//		bo.update(p);
		
		//Get Single Data
		
//		Person p = new Person();
//		
//		System.out.println("Enter Your Id");
//		p.setId(sc.nextInt());
//		
//		Person p2 = bo.getSingle(p);
//		
//		System.out.println(p2.getId()+" "+p2.getName());
		
		List<Person> getall = bo.getall();
		
		System.out.println("ID\t|\tName");
		
		for (Person person : getall) 
		{
			System.out.println(person.getId()+"\t|\t"+person.getName());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

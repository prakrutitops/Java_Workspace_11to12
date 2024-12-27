package com.controller;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Util;
import com.model.Address;
import com.model.Person;

public class MainClass 
{
	public static void main(String[] args) 
	{
		
		Session sess = new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		
		System.out.println("Enter Your Address");
		String address = sc.next();
		
		Person person = new Person();
		Address address2 = new Address();
	
		person.setName(name);
		
		address2.setAddress(address);
		address2.setPerson(person);
		
		sess.save(person);
		sess.save(address2);
		
		tr.commit();
		sess.close();
		
		
		
		
		
	}
}

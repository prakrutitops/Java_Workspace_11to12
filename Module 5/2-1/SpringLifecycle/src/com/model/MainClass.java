package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
	public static void main(String[] args) 
	{
		
		ApplicationContext acm = new ClassPathXmlApplicationContext("beans.xml");
		Person p1 = (Person) acm.getBean("t1");
		System.out.println(p1.getId()+" "+p1.getName());
		((AbstractApplicationContext)acm).registerShutdownHook();
		Person p2 = (Person) acm.getBean("t1");
		System.out.println(p2.getId()+" "+p2.getName());
		
	}
}

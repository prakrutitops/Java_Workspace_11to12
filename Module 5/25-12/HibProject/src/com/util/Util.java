package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Util 
{
	
	public static Session getconnect()
	{
		Session sess = null;
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		sess = sf.openSession();
		
		return sess;
	}
	
}

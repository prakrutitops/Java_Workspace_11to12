package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.Person;

public class DAO extends HibernateDaoSupport
{
	
	public void insert(Person p)
	{
		this.getHibernateTemplate().save(p);
	}
	
	public void update(Person p)
	{
		this.getHibernateTemplate().update(p);
	}
	
	public void delete(Person p)
	{
		this.getHibernateTemplate().delete(p);
	}
	
	public List<Person> getall()
	{
		List<Person> getlist = this.getHibernateTemplate().find("from Person");
		return getlist;
	}
	
	public Person getSingle(Person p)
	{
		Person p1 = this.getHibernateTemplate().get(Person.class, p.getId());
		return p1;
	}
	
}

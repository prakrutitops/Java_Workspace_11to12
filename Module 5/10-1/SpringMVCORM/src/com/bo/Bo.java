package com.bo;

import java.util.List;

import com.dao.Dao;
import com.model.Person;

public class Bo 
{
	Dao dao;

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	public void insert(Person p)
	{
		dao.insert(p);
	}
	
	public void update(Person p)
	{
		dao.update(p);
	}
	
	public void delete(Person p)
	{
		dao.delete(p);
	}
	
	public List<Person> getall()
	{
		return dao.getall();
	}
	
	public Person getSingle(Person p)
	{
		return dao.getSingle(p);
	}
	
}

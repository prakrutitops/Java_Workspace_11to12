package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bo.Bo;
import com.model.Person;

@Controller
public class MyController 
{
	
	@RequestMapping(value="/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value="/insert")
	public String insert(HttpServletRequest req,HttpServletResponse resp,ModelMap map)
	{
		
		Person p = new Person();
		p.setName(req.getParameter("name"));
		p.setAddress(req.getParameter("address"));
		
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		Bo bo = (Bo) acm.getBean("bo");
		bo.insert(p);
		return "show";
	}
	
	@RequestMapping(value="/show")
	public String show()
	{
		return "show";
	}
	
	@RequestMapping(value="/delete")
	public String delete(HttpServletRequest req,HttpServletResponse resp,ModelMap map)
	{
		
		Person p = new Person();
		p.setId(Integer.parseInt(req.getParameter("id")));
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		Bo bo = (Bo) acm.getBean("bo");
		bo.delete(p);
		return "show";
	}
	
	
	@RequestMapping(value="/edit",method =RequestMethod.POST)
	public String edit(HttpServletRequest req, HttpServletResponse resp,ModelMap map )
	{
		int id=Integer.parseInt(req.getParameter("id"));
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		Bo bo = (Bo) acm.getBean("bo");
		Person p = new Person();
		p.setId(id);
		
		Person p2 = bo.getSingle(p);
		map.addAttribute("tops", p2);//key,value
		return "update";
	}
	
	
	
	@RequestMapping(value="/update")
	public String update(HttpServletRequest req,HttpServletResponse resp,ModelMap map)
	{
		
		Person p = new Person();
		p.setId(Integer.parseInt(req.getParameter("id")));
		p.setName(req.getParameter("name"));
		p.setAddress(req.getParameter("address"));
		
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		Bo bo = (Bo) acm.getBean("bo");
		bo.update(p);
		return "show";
	}
}

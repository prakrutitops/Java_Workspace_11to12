package com.a1510;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	
	int sid;
	String sname;
	
	
	public Student(	int sid,String sname) 
	{
		this.sid=sid;
		this.sname=sname;
	}
	
	
	@Override
	public int compareTo(Student o) 
	{
		
		if(this.sid>o.sid) 
		{
			return 1;
		}
		else if (this.sid<o.sid)
		{
			return -1;
		}
		else if(this.sid==o.sid)
		{
			return 0;
		}
		
		
		return 0;
	}
	
}

public class ComparableEx 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(101,"devang");
		Student s2 = new Student(104,"shiv");
		Student s3 = new Student(103,"neelam");
	
		ArrayList<Student>arrayList = new ArrayList<>();
		
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		
		Collections.sort(arrayList);
		
		for(Student s :arrayList) 
		{
			System.out.println("Id : - "+s.sid+"  Name : - "+s.sname);
		}
	}
}

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	StudentRepo repo;

	@Override
	public Student addStudent(Student s) {
		// TODO Auto-generated method stub
		return repo.save(s);
	}

	@Override
	public List<Student> viewAllStudent() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);		
	}

	@Override
	public Student StudentById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow();
	}

	@Override
	public Student updateStudent(Student s, int id) {
		// TODO Auto-generated method stub
		s.setId(id);
		return repo.save(s);
	}

}

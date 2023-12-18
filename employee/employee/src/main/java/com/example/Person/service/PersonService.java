package com.example.Person.service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Person.entity.Person;
import com.example.Person.repository.PersonRepository;


@Service
public class PersonService 
{
	@Autowired
	Person e;

	@Autowired
	PersonRepository repo;
	
	public Person check(int Id,String name)
	{
	
		e.setId(Id);
		e.setName(name);

		repo.hibernate(e);
		return e;


	}
	
	public void employeeInfo(int Id,String name)
	{
	
		e.setId(Id);
		e.setName(name);


		repo.update(Id,name);


	}
	
	public void employeedelete(int id)
	{
	
		repo.delete(id);


	}
	
	public List<Person>  employeefetch()
	{
		return repo.fetch();
	

	}
}

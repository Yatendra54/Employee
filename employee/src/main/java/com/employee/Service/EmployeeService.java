package com.employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.Entity.Employee;
import com.employee.Repository.EmployeeRepository;




@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repo;

	@Autowired
	Employee e;
	
	
	public void employeedetails(int Id, String Name,int Age,double Salary)
	{
		e.setId(Id);
		e.setName(Name);
		e.setAge(Age);
		e.setSalary(Salary); 
       
		repo.savedata(e);
	}
	
	
	public List<Employee> read()
	{
		return repo.fetch();
	}
	
	public void updateEmployee(int Id,double Salary)
	{
		repo.update(Id,Salary);
	}
	
	public void deletedEmployee(int Id)
	{
		repo.delete(Id);
	}
}

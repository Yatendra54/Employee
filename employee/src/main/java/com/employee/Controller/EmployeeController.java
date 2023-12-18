package com.employee.Controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.employee.Entity.Employee;
import com.employee.Service.EmployeeService;


import jakarta.servlet.http.HttpServletRequest;



@Controller
public class EmployeeController {

	@RequestMapping("/")
	public String test()
	{
		return "index.jsp";
	}
	
	@Autowired
	EmployeeService e;
	
	
	@RequestMapping("/save")
public ModelAndView save(HttpServletRequest req,HttpServletRequest res)
{
	int Id=Integer.parseInt(req.getParameter("Id"));
	String Name=req.getParameter("Name");
	int Age=Integer.parseInt(req.getParameter("Age"));
	double Salary=Double.parseDouble(req.getParameter("Salary"));
	
	
	e.employeedetails(Id, Name, Age,Salary);
	
	ModelAndView mav= new ModelAndView();
	mav.setViewName("save.jsp");
	return mav;
	
}
	
	@RequestMapping("/read")
public ModelAndView fetch(HttpServletRequest req,HttpServletRequest res)
{
	List<Employee> list = e.read();
	
	ModelAndView mav= new ModelAndView();
	mav.setViewName("read.jsp");
	mav.addObject("read", list);
	return mav;
}
	
	@RequestMapping("/update")
public ModelAndView update(HttpServletRequest req,HttpServletRequest res)
{
	int Id=Integer.parseInt(req.getParameter("Id"));
	Double Salary=Double.parseDouble(req.getParameter("Salary"));
	e.updateEmployee(Id, Salary);
	
	ModelAndView mav= new ModelAndView();
	mav.setViewName("update.jsp");
	return mav;
}
	
	@RequestMapping("/delete")
public ModelAndView delete(HttpServletRequest req,HttpServletRequest res)
{
	int Id=Integer.parseInt(req.getParameter("Id"));
	e.deletedEmployee(Id);
	
	ModelAndView mav= new ModelAndView();
	mav.setViewName("delete.jsp");
	return mav;
}
}

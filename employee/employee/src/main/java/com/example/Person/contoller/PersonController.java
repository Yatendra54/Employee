package com.example.Person.contoller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.Person.entity.Person;
import com.example.Person.service.PersonService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class PersonController 
{
	Person emp;
	
	@Autowired
	PersonService e;

	@RequestMapping("/")
	public String test() {
		return "index.jsp";
	}

	@RequestMapping("/save")
	public ModelAndView signup(HttpServletRequest req,HttpServletResponse res)
	{
		int Id=Integer.parseInt(req.getParameter("id"));
		String Name = req.getParameter("name");

		Person emp = e.check(Id,Name);

		String s="";
		if(emp!=null)
		{
			s="saved successfully";
		}
		else
		{
			s="failed to save";
		}

		ModelAndView mav= new ModelAndView();
		mav.setViewName("output.jsp");//for rendering on UI
		mav.addObject("output",s);

		return mav;
	}


	@RequestMapping("/update")
	public ModelAndView check(HttpServletRequest req,HttpServletResponse res)
	{
	
		int Id=Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");


		e.employeeInfo(Id, name);
		String o="";
		if(emp!=null)
		{
			o="update succesful";
		}
		else
		{
			o="update failed";
		}
		ModelAndView mav= new ModelAndView();
		mav.setViewName("output.jsp");
		mav.addObject("update",o);

		return mav;
	}

	@RequestMapping("/delete")
	public ModelAndView display(HttpServletRequest req,HttpServletResponse res)
	{

		int id=Integer.parseInt(req.getParameter("id"));

		e.employeedelete(id);
		
		String o=(emp!=null)?"successful":"failed";
	

		ModelAndView mav= new ModelAndView();
		mav.setViewName("output.jsp");
		mav.addObject("delete", o);

		return mav;
	}


	@RequestMapping("/read")
	public ModelAndView fetch(HttpServletRequest req,HttpServletResponse res)
	{
		List<Person> ef = e.employeefetch();

		ModelAndView mav= new ModelAndView();
		mav.setViewName("read.jsp");
		mav.addObject("read",ef);


		return mav;
	}	
}

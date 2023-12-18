package com.employee.Repository;

import java.util.List; 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.Entity.Employee;




@Repository
public class EmployeeRepository {

	
	@Autowired
	private Employee e;
	Configuration cfg= new Configuration().configure().addAnnotatedClass(Employee.class);
	SessionFactory sf=cfg.buildSessionFactory();
	
	
	public void savedata(Employee e)
	{

		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();

		session.persist(e);

		trans.commit();
		session.close();
	}
	
	public List<Employee> fetch()
	{
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
		
		NativeQuery<Employee> query = session.createNativeQuery("select * from Employee");
		query.addEntity(Employee.class);
		List<Employee> l = query.list();
		
		trans.commit();
		session.close();
		return l;

	}
	
	public void update(int Id,double Salary)
	{

		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();

		Employee load=session.load(Employee.class,Id);
		load.setSalary(Salary);
		session.update(load);
		
		trans.commit();
		session.close();
	}
	
	public void delete(int Id)
	{
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();

		Employee load=session.load(Employee.class, Id);
		session.delete(load);
		
		trans.commit();
		session.close();

	}
}

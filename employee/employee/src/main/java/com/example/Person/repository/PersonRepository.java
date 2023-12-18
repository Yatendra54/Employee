package com.example.Person.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.springframework.stereotype.Repository;

import com.example.Person.entity.Person;

@Repository
public class PersonRepository
{
	Configuration cfg= new Configuration().configure().addAnnotatedClass(Person.class);
	SessionFactory sf=cfg.buildSessionFactory();
	public void hibernate(Person e)
	{
		
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();

		session.persist(e);

		trans.commit();
		session.close();

	}

	public void update (int Id,String name)
	{
		
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();

		Person load = session.load(Person.class,Id);
		load.setName(name);
		session.update(load);

		trans.commit();
		session.close();
	}


	public void delete(int id)
	{
		
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();


		Person load = session.load(Person.class,id);
		session.delete(load);

		trans.commit();
		session.close();
	}


	@SuppressWarnings("deprecation")
	public List<Person> fetch()
	{
		
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();

		NativeQuery<Person> query = session.createNativeQuery("select * from Employee");
		query.addEntity(Person.class);
		List<Person> l = query.list();


		trans.commit();
		session.close();
	    return l;
	}
}

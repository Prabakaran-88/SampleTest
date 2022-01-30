package com.prabakaran.libmgmtsys.testMain;

import org.hibernate.Session;

import com.prabakaran.libmgmtsys.entities.Author;
import com.prabakaran.libmgmtsys.util.HibernateUtil;
public class AppTestMain {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
	    session.beginTransaction();
	    
	    //Add new Employee object
	    Author emp = new Author();
	  
	  emp.setContact(12345678);
	  emp.setName("Srividhya");
	     
	    //Save the employee in database
	    session.save(emp);

	    //Commit the transaction
	    session.getTransaction().commit();
	    HibernateUtil.shutdown();}
	}


package com.prabakaran.libmgmtsys.util;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();
    
    private static SessionFactory buildSessionFactory() 
    {
    	
    	    return new Configuration().configure(new File("D:\\Canada\\workspace\\libmgmtsys\\src\\main\\java\\hibernate.cfg.xml")).buildSessionFactory();
    	
    }
  
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
  
    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }
}

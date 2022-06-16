package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
public class App1 {

	public static void main(String[] args) {
		
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
    	
	       ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
	       
	       SessionFactory sf = con.buildSessionFactory(reg);
	       
	       Session session = sf.openSession();
	       
	       session.beginTransaction();
	       
	       session.getTransaction().commit();
	}

}

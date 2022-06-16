package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class App 
{
    public static void main( String[] args )
    {
    	//caching
    	Alien a = null;
    	/**
    	Laptop laptop = new Laptop();
    	laptop.setLid(101);
    	laptop.setLname("Dell");
    	
    	
    	Student s = new Student();
    	s.setMarks(50);
    	s.setName("navin");
    	s.setRollno(1);
    	s.getLaptop().add(laptop);
    	
    	
    	/**
    	AlienName an = new AlienName();
    	an.setFname("Felix");
    	an.setLname("Chite");
    	an.setMname("Melvo");
    	
       Alien telusko = new Alien();
       
       telusko.setAid(101);
       telusko.setAname(an);
       telusko.setColor("green");
    
        **/
    	
      // Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
       
    	Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
    	
       ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
       
       SessionFactory sf = con.buildSessionFactory(reg);
       
      // Session session = sf.openSession();
       
       Session session1 = sf.openSession();
       
     //  Transaction tx = session.beginTransaction();
       session1.beginTransaction();
       
       a = (Alien) session1.get(Alien.class, 101);
       
       System.out.println(a);
       
       session1.getTransaction().commit();
       session1.close();
       
       Session session2 = sf.openSession();
       session2.beginTransaction();
       
       a = (Alien) session2.get(Alien.class, 101);
       System.out.println(a);
       
       session2.getTransaction().commit();
       session2.close();
       
      // telusko = (Alien) session.get(Alien.class, 101);
       
    //   session.save(s);
       //session.save(laptop);
       
       
     //  tx.commit();
       
       //System.out.println(telusko);
       
       
       
    }
}

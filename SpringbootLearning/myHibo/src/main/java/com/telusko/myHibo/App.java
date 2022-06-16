package com.telusko.myHibo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   
    	Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        SessionFactory sf = con.buildSessionFactory(reg);
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        //Alien a1 = session.get();
        // System.out.println(a1.getAname());
        
       // session.save();
        
        //Transient state
        /**
        Laptop l = new Laptop();
        l.setLid(51);
        l.setBrand("Sony");
        l.setPrice(700);
        
        //setting the object to persistence state
        session.save(l);
        **/
        //changing the price value
       // l.setPrice(650);
      
      //  Laptop lap = session.load(Laptop.class, 1);
       // System.out.println(lap);
        
        tx.commit();
        
    }
}

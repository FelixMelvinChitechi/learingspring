package com.telusko.tryhqlDemo;

import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{public static void main(String[] args)
    {
    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
    	
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        SessionFactory sf = con.buildSessionFactory(reg);
        
        Session session = sf.openSession();
        
        session.beginTransaction();
        
       /**
        Random r = new Random();
        
        for(int i = 1; i <= 50; i++) {
        	//create an object of student
        	Student s = new Student();
        	
        	//set values
        	s.setRollno(i);
        	s.setName("Name " + i);
        	s.setMarks(r.nextInt(100));
        	session.save(s);
        }
        **/
        
        //fetching data using Query language
        //create an object of query
      //  Query q = session.createQuery("from Student");
        
        //fetching the result of one student
        Query q = session.createQuery("from Student where rollno = 7");
        
        Student student = (Student) q.uniqueResult();
        
        System.out.println(student);
        
        //fetch value
      // List<Student> students = q.list();
       
       /**
        for(Student s : students)
        {
        	System.out.println(s);
        }
        **/
        
        /**
         * Query q = session.createQuery("select rollno, name, marks from Student where rollno = 7");
         * Object[] student = (Object[])q.uniqueResult();
         * for(Object 0 : student)
         * {
         * System.out.println(o);
         * }
         * 
         * 
         */
         
        session.getTransaction().commit();
        
    }
}

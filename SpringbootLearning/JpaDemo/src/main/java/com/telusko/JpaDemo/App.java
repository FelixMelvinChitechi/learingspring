package com.telusko.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //fetching data from our db
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ls");
    	EntityManager em = emf.createEntityManager();
    	Alien a = em.find(Alien.class, 2);
    	
    	System.out.println(a);
    }
}

package com.connector.Hibernate_mapping1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sf= new Configuration().configure().buildSessionFactory();
    	Session s =  sf.openSession();
    	Transaction t = s.beginTransaction();
    	
    	Laptop ob = new Laptop(1,"Asus");
    	
         
    	
    	StudentLaptop ob1 = new StudentLaptop(101,"ramya",4000);
    	
    	ob.setLap(ob1);
    	s.save(ob);
       	s.save(ob1);
    	t.commit();
    	s.close();

    }
}

package com.connector.Hibernate_Maping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = (Session) sf.openSession();
		Transaction t = s.beginTransaction();
		
		Laptop ob = new Laptop(1, "hp");
		
		
		s.save(ob);
		t.commit();
		
		System.out.println("record has been inserted");
		
		Student ob1=new Student(101, "Nikita", 3000);
		s.save(ob);
		t.commit();
		s.close();    }
}

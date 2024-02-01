package com.connector.Hibernate_1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = (Session) sf.openSession();
		Transaction t = s.beginTransaction();
		Employee ob = new Employee();
		ob.setEid(101);
		ob.setName("Nikita");
		ob.setEmail("niki@gmail.com");
		ob.setSalary(5000);

		s.save(ob);
		t.commit();
		s.close();
		System.out.println("record has been inserted");

	}
}

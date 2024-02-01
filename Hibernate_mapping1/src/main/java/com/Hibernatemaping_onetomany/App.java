package com.Hibernatemaping_onetomany;

import java.lang.module.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		 Answer ob1=new Answer();
	       ob1.setAid(1);
	       ob1.setAnswer("java is coding language");
	       s.save(ob1);
	       
	       Question ob=new Question();
	       ob.setQuestion("what is java");
	       ob.setQid(101);
	       ob.getAns().add(ob1);
	       s.save(ob);
	       t.commit();
	       s.close();


	}
}

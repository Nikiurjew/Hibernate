package com.connector.Hibernate_2;

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
      Transaction t= s.beginTransaction();
      Student ob= new Student();
      
//      to insert data
//      ob.setUsn(1);
//      ob.setName("Nikita");
//      ob.setEmail("nikita@gmail.com");
//      ob.setDept("CSE");
//      
//      s.save(ob);
//      t.commit();
//      s.close();
//      System.out.println("data inserted");
      
      // to delete
//      ob.setUsn(1);
//      s.delete(ob);
//      t.commit();
//      s.close();
//      System.out.println("data deleted");
      
      //to update
      ob.setUsn(1);
      ob.setName("Muskan");
      ob.setEmail("mus@gmail.com");
      ob.setDept("bca");
      s.update(ob);
      t.commit();
      System.out.println("data is updated");
      
    }
}

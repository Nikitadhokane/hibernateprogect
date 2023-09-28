//create a hibernate project showing one to one relation ship between product and customer(uni-directional)

package com.project.hibernateproject3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started!" );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
      //creating the session factory
        SessionFactory factory=cfg.buildSessionFactory();
        
      //creating the object of Customer entity and setting its value
        Customer c1=new Customer();
        c1.setCid(101);
        c1.setCname("Isha Patil");
        c1.setCage(21);
      
        //creating the object of Product 
        Product p1=new Product();
        p1.setPid(201);
        p1.setPname("Laptop");
        p1.setPprice(50000);
        
      //passing the object of product in customer
        c1.setProd(p1);
        
        
        //opening the session
        Session session =factory.openSession();
        
      //starting the transaction
        Transaction tx=session.beginTransaction();
        
        session.save(c1); //saving the customer object
        session.save(p1); //saving the Product object
        
        tx.commit();
        
        session.close(); //closing the session
        factory.close(); //closing the factory
        
     }
}

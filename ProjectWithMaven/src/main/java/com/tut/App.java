package com.tut;

import org.hibernate.Session;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )throws IOException
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
//    	creating student
    	Student st=new Student();
    	st.setId(101);
    	st.setName("JOHN");
    	st.setCity("DELHI");
    	System.out.println(st);
    	
//    	creating object of address class
    	Address ad=new Address();
    	ad.setStreet("strret1");
    	ad.setCity("DELHI");
    	ad.setOpen(true);
    	ad.setAddedDate(new Date);
    	ad.setX(1234.234);
//    	reading image
    	FileInputStream fis=new FileInputStream("src/main/java/pic.jpg");
    	byte[] data=new byte[fis.available()];
    	fis.read(data);
    	ad.setImage(data);
    	
    	
    	Session session=factory.getCurrentSession();
    	Transaction tx= session.beginTransaction();
    	session.save(st);
    	session.save(ad);
    	
    	tx.commit();
    	session.close();
       
    }
    
}

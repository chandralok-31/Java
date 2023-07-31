package com.tut;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmDemo {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	
	Student student1=new Student();
	student1.setId(14123);
	student1.setName("ankit tiwari");
	student1.setCity("LKO");
	
	Certificate certificate=new Certificate();
	certificate.setCourse("Android");
	certificate.setDuration("2 month");
	student1.setCerti(certificate);
	
	
	Student student2=new Student();
	student2.setId(14233);
	student2.setName("Ravi tiwari");
	student2.setCity("Patna");
	
	Certificate certificate1=new Certificate();
	certificate1.setCourse("Hibernate");
	certificate1.setDuration("1.5 month");
	student2.setCerti(certificate1);
	
	Session s=factory.openSession();
	Transaction tx=s.beginTransaction();
	
	//object save
	s.save(student1);
	s.save(student2);
	
	tx.commit();
	s.clear();
	
	
	factory.close();
}
}

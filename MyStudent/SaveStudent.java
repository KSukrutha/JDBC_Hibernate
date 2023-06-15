package com.stu;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
	   Student student = new  Student();
	   student.setName("sani");
	   student.setAge(22);
	   student.setGender("female");
	   student.setPhno(9921911362l);
	   student.setMarks(37);
	   student.setCourse("MSC");
	   
	   Student student1 = new  Student();
	   student1.setName("sukku");
	   student1.setAge(23);
	   student1.setGender("female");
	   student1.setPhno(9931111362l);
	   student1.setMarks(47);
	   student1.setCourse("BE");
	   
	   entityTransaction.begin();
	   entityManager.persist(student);
	   entityManager.persist(student1);
	   entityTransaction.commit();
	   

	}

}

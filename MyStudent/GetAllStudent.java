package com.stu;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class GetAllStudent{

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager=entityManagerFactory.createEntityManager();
		Query query = enityManager.createQuery("select s from Student s where s.phno=?1 or s.age>=?2");
		query.setParameter(1,9901811362l);
		query.setParameter(2,20);
		List<Student> students = query.getResultList();
		for(Student student: students) {
		System.out.println("the Student id is "+student.getId());
		System.out.println("the Student id is "+student.getName());
		System.out.println("the Student id is "+student.getAge());
		System.out.println("the Student id is "+student.getGender());
		System.out.println("the Student id is "+student.getPhno());
		System.out.println("the Student id is "+student.getMarks());
		System.out.println("the Student id is "+student.getCourse());
		
		System.out.println("******************************************");

	}

	}
}

package com.stu;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

public class GetStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager=entityManagerFactory.createEntityManager();
		
		Student student = enityManager.find(Student.class,1);
		System.out.println("the Student id is "+student.getId());
		System.out.println("the Student id is "+student.getName());
		System.out.println("the Student id is "+student.getAge());
		System.out.println("the Student id is "+student.getGender());
		System.out.println("the Student id is "+student.getPhno());
		System.out.println("the Student id is "+student.getMarks());
		System.out.println("the Student id is "+student.getCourse());
		
	}

}

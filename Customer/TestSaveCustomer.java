package com.sukku;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class TestSaveCustomer {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();

		Customer customer = new Customer();
		customer.setId(103);
		customer.setName("Swaroop");
		customer.setGender("Male");
		customer.setAge(30);
		customer.setPhno(9895786907l);
		customer.setEmail("Swaroop18@gmail.com");

		Customer customer1 = new Customer();
		customer1.setId(104);
		customer1.setName("Sumukh");
		customer1.setGender("Male");
		customer1.setAge(26);
		customer1.setPhno(9008475546l);
		customer1.setEmail("Sumukh06@gmail.com");

		entityTransaction.begin();
		entityManager.persist(customer);
		entityManager.persist(customer1);
		entityTransaction.commit();

	}
}

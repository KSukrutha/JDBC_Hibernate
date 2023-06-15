package com.sukku;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.border.EtchedBorder;

public class DeleteCus {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction() ;
		
		Customer customer = entityManager.find(Customer.class,103);
		entityTransaction.begin();
		entityManager.remove(customer);
		entityTransaction.commit();
	}

}

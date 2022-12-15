package hibernate_second_project.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_second_project.dto.Bus;

public class BusDelete {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("action");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Bus bus=entityManager.find(Bus.class, 123);
		
		while(bus!=null) {
			entityTransaction.begin();
			entityManager.remove(bus);
			entityTransaction.commit();
			
			System.out.println("data deleted Sucessfully..............");
		}
	}

}

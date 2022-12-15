package hibernate_second_project.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_second_project.dto.Bus;

public class BusInsert {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("action");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Bus bus=new Bus();
		
		bus.setId(124);
		bus.setName("redbus");
		bus.setType("Diesel");
		bus.setColor("sky");
		
		entityTransaction.begin();
		entityManager.persist(bus);
		entityTransaction.commit();
		System.out.println("data inserted");
	}

}

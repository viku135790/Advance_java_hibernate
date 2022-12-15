package hibernate_second_project.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_second_project.dto.Bus;

public class BusUpdate {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("action");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Bus bus=entityManager.find(Bus.class, 123);
		System.out.println(bus.getId()+" "+bus.getName());
		if(bus!=null) {
			bus.setName("Abhibus");
			bus.setColor("white");
			bus.setType("Diesel");
			
			entityTransaction.begin();
			entityManager.merge(bus);
			entityTransaction.commit();
			
			System.out.println("data updated Sucessfully....................");
		}
		
	}

}

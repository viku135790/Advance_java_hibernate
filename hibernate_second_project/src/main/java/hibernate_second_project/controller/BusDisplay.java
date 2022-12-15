package hibernate_second_project.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_second_project.dto.Bus;

public class BusDisplay {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("action");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		String select="select b from Bus b";
		
		Query query=entityManager.createQuery(select);
		List<Bus> bus=query.getResultList();
		
		for (Bus bus2 : bus) {
			System.out.println("id = "+bus2.getId());
			System.out.println("name = "+bus2.getName());
			System.out.println("type = "+bus2.getType());
			System.out.println("color = "+bus2.getColor());
			System.out.println("=========================");
		}
		
	}

}

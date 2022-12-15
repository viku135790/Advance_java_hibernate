package hibernate_first_project.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_first_project.bean.Student;

public class StudentDisplayController {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("insert");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		String select="Select s from Student s";
		Query query=entityManager.createQuery(select);
		
		List<Student> students=query.getResultList();
		
		for (Student student : students) {
			System.out.println("id = "+student.getId());
			System.out.println("name = "+student.getName());
			System.out.println("email = "+student.getEmail());
			
			System.out.println("=====================");
		}
	}

}
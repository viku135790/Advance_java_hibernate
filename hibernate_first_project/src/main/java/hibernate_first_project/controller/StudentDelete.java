package hibernate_first_project.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_first_project.bean.Student;

public class StudentDelete {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("insert");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student=entityManager.find(Student.class, 400);
		if(student !=null) {
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
			
			System.out.println("data deleted ..................");
		}
		
	}

}

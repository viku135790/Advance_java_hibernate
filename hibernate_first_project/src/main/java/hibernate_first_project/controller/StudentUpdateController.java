package hibernate_first_project.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_first_project.bean.Student;

public class StudentUpdateController {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("insert");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student=entityManager.find(Student.class, 1);
		
		System.out.println(student.getId()+" "+student.getEmail());
		if(student !=null) {
			student.setEmail("xyz@gmail.com");
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			
			System.out.println("data updated sucessfully");
			
		}
	}

}

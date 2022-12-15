package hibernate_first_project.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_first_project.bean.Student;

public class StudentInsertController {
	public static void main(String[] args) {
		//connection
		EntityManagerFactory emfEntityManagerFactory=Persistence.createEntityManagerFactory("insert");
		//method call
		EntityManager entityManager=emfEntityManagerFactory.createEntityManager();
		//transaction
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student=new Student();
		student.setId(2);
		student.setName("fdhjs");
		student.setEmail("bvdsk@gmail.com");
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		
		System.out.println("Data inserted");
		
	}

}

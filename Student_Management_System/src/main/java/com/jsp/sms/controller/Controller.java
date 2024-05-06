package com.jsp.sms.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.jsp.sms.model.Student;

public class Controller {
	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		public boolean insertStudent(Student student)
		{
			if(student!=null)
			{
				entityTransaction.begin();
				entityManager.persist(student);
				entityTransaction.commit();
				return true;
			}
			else
			{
				return false;
			}
			
		}
		public List<Student> serachStudent()
		{
			TypedQuery<Student> studentList = entityManager.createQuery("select s from Student s",Student.class);
			return studentList.getResultList();
			
		}
		public boolean updateStudentName(int studentid,String studentname)
		{
			
			Student student = entityManager.find(Student.class,studentid);
			if (student!=null) {
				entityTransaction.begin();
				student.setStudent_name(studentname);
				entityManager.merge(student);
				entityTransaction.commit();
				return true;
			}
			return false;
			
		}
		public boolean updateStudentEmail(int studentid,String studentemail)
		{
			
			Student student = entityManager.find(Student.class,studentid);
			if (student!=null) {
				entityTransaction.begin();
				student.setStudent_email(studentemail);
				entityManager.merge(student);
				entityTransaction.commit();
				return true;
			}
			return false;
			
		}
		public boolean updateStudentAddress(int studentid,String studentaddress)
		{
			
			Student student = entityManager.find(Student.class,studentid);
			if (student!=null) {
				entityTransaction.begin();
				student.setStudent_address(studentaddress);
				entityManager.merge(student);
				entityTransaction.commit();
				return true;
			}
			return false;
			
		}
		public boolean updateStudentBranch(int studentid,String studentbranch)
		{
			
			Student student = entityManager.find(Student.class,studentid);
			if (student!=null) {
				entityTransaction.begin();
				student.setStudent_branch(studentbranch);
				entityManager.merge(student);
				entityTransaction.commit();
				return true;
			}
			return false;
			
		}
		public boolean updateStudentUsername(int studentid,String studentusername)
		{
			
			Student student = entityManager.find(Student.class,studentid);
			if (student!=null) {
				entityTransaction.begin();
				student.setStudent_username(studentusername);
				entityManager.merge(student);
				entityTransaction.commit();
				return true;
			}
			return false;
			
		}
		public boolean updateStudentPassword(int studentid,String studentpassword)
		{
			
			Student student = entityManager.find(Student.class,studentid);
			if (student!=null) {
				entityTransaction.begin();
				student.setStudent_password(studentpassword);
				entityManager.merge(student);
				entityTransaction.commit();
				return true;
			}
			return false;
			
		}
		public boolean updateStudentContact(int studentid,long studentcontact)
		{
			
			Student student = entityManager.find(Student.class,studentid);
			if (student!=null) {
				entityTransaction.begin();
				student.setStudent_contact(studentcontact);
				entityManager.merge(student);
				entityTransaction.commit();
				return true;
			}
			return false;
			
		}
	
}

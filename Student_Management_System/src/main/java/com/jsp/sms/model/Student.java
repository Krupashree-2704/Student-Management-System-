package com.jsp.sms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String student_name;
	private String student_email;
	private long student_contact;
	private boolean student_gender;
	private String student_address;
	private String student_branch;
	private String student_username;
	private String student_password;
	
	public Student() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_email() {
		return student_email;
	}

	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}

	public long getStudent_contact() {
		return student_contact;
	}

	public void setStudent_contact(long student_contact) {
		this.student_contact = student_contact;
	}

	public boolean isStudent_gender() {
		return student_gender;
	}

	public void setStudent_gender(boolean student_gender) {
		this.student_gender = student_gender;
	}

	public String getStudent_address() {
		return student_address;
	}

	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}

	public String getStudent_branch() {
		return student_branch;
	}

	public void setStudent_branch(String student_branch) {
		this.student_branch = student_branch;
	}

	public String getStudent_username() {
		return student_username;
	}

	public void setStudent_username(String student_username) {
		this.student_username = student_username;
	}

	public String getStudent_password() {
		return student_password;
	}

	public void setStudent_password(String student_password) {
		this.student_password = student_password;
	}
	
	

}

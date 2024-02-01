package com.connector.Hibernate_2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")

public class Student {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	int usn;
	String name;
	String email;
	String dept;
	public int getUsn() {
		return usn;
	}
	public void setUsn(int usn) {
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Student(int usn, String name, String email, String dept) {
		super();
		this.usn = usn;
		this.name = name;
		this.email = email;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", email=" + email + ", dept=" + dept + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}

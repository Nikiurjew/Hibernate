package com.connector.Hibernate_1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_table")

public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
int eid;
String name;
float salary;
String email;
// getter setter
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
//constructor
public Employee() {
	super();
	this.eid=eid;
	this.name=name;
	this.email=email;
	this.salary=salary;
	
	
}
@Override
public String toString(){
	return null ;
}
}


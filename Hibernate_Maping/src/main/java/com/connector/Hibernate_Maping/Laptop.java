package com.connector.Hibernate_Maping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	private int lid;
	private String lname;
	
	@OneToOne
	private Student lap;
	


	public Student getLap() {
		return lap;
	}


	public void setLap(Student lap) {
		this.lap = lap;
	}


	public int getLid() {
		return lid;
	}


	public void setLid(int lid) {
		this.lid = lid;
	}




	public String getLname() {
		return lname;
		
	}




	public Laptop(int lid, String lname) {
		super();
		this.lid = lid;
		this.lname = lname;
	}




	public void setLname(String lname) {
		this.lname = lname;
	}

	public static void main(String[] args) {
		

	}

}

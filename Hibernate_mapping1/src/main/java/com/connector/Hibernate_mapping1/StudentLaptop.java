package com.connector.Hibernate_mapping1;

	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.OneToOne;

	@Entity
	public class StudentLaptop {
	   @Id
	   private int sid;
	   private String sname;
	   private float fees;
	   
	  
	public StudentLaptop(int sid, String sname, float fees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.fees = fees;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	

}

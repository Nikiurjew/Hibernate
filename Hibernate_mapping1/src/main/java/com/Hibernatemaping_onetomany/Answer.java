package com.Hibernatemaping_onetomany;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.connector.Hibernate_mapping1.StudentLaptop;

@Entity
	@Table(name="Answer")
public class Answer {
	@Id
	private int aid;
	private String answer;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	}
	


	
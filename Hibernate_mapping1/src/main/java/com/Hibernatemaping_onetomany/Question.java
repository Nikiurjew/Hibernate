package com.Hibernatemaping_onetomany;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.connector.Hibernate_mapping1.StudentLaptop;

@Entity
public class Question {
	@Id
	private int qid;
	private String question;
	
	@OneToMany
	private List<Answer> ans = new ArrayList<Answer>();
	
	
	
	public List<Answer> getAns() {
		return ans;
	}
	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	
} 

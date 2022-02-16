package com.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class QuizBank {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String question;
	private String opection1;
	private String opection2;
	private String opection3;
	private String opection4;
	private String answer;
	private int marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOpection1() {
		return opection1;
	}
	public void setOpection1(String opection1) {
		this.opection1 = opection1;
	}
	public String getOpection2() {
		return opection2;
	}
	public void setOpection2(String opection2) {
		this.opection2 = opection2;
	}
	public String getOpection3() {
		return opection3;
	}
	public void setOpection3(String opection3) {
		this.opection3 = opection3;
	}
	public String getOpection4() {
		return opection4;
	}
	public void setOpection4(String opection4) {
		this.opection4 = opection4;
	}
	public String getAns() {
		return answer;
	}
	public void setAns(String ans) {
		this.answer = ans;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public QuizBank( String question, String opection1, String opection2, String opection3, String opection4,
			String ans, int marks) {
		super();
		
		this.question = question;
		this.opection1 = opection1;
		this.opection2 = opection2;
		this.opection3 = opection3;
		this.opection4 = opection4;
		this.answer = ans;
		this.marks = marks;
	}
	public QuizBank() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "QuizBank [id=" + id + ", question=" + question + ", opection1=" + opection1 + ", opection2=" + opection2
				+ ", opection3=" + opection3 + ", opection4=" + opection4 + ", ans=" + answer + ", marks=" + marks + "]";
	}
	
}

package com.app.model;

public class QuizByUser {
	private int id;
	public QuizByUser(int id, String queans, double percentage, String result) {
		super();
		this.id = id;
		this.queans = queans;
		this.percentage = percentage;
		this.result = result;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String queans;
	private double percentage;
	private String result;
	public String getQueans() {
		return queans;
	}
	public void setQueans(String queans) {
		this.queans = queans;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public QuizByUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "QuizByUser [id=" + id + ", queans=" + queans + ", percentage=" + percentage + ", result=" + result
				+ "]";
	}
	
	

}

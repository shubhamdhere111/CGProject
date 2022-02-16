package com.app.dto;

public class loginDto {
	private String userName;
	private String password;
	private String queAns;
	private double percentage;
	private String Role;
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}

	private String result;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	  public String getQueAns() { return queAns; }  public void
	  setQueAns(String queAns) { this.queAns = queAns; } public double
	  getPercentage() {  return percentage; }
	  public void
	  setPercentage(double percentage) { this.percentage = percentage; }
	  public String getResult() { return result; } public void
	  setResult(String result) { this.result = result; }
	 
	
	
	
	public loginDto(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "loginDto [Role=" + Role + "]";
	}
	public loginDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	  public loginDto(String role) {
		super();
		Role = role;
	}
	public loginDto(String queAns, double percentage, String result) { super();
	  this.queAns = queAns; this.percentage = percentage; this.result = result; }
	 
	
	
}
	

package com.app.dto;

public class UserProfile {
private String name;
private long mobile;
private String email;
private String msg;
private String role;
private String Adminname;
public String getAdminname() {
	return Adminname;
}
public void setAdminname(String adminname) {
	Adminname = adminname;
}
private boolean flag;
public boolean isFlag() {
	return flag;
}
public void setFlag(boolean flag) {
	this.flag = flag;
}
public String getName() {
	return name;
}
public UserProfile(String adminname) {
	super();
	Adminname = adminname;
}
public void setName(String name) {
	this.name = name;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
@Override
public String toString() {
	return "UserProfile [Adminname=" + Adminname + "]";
}
public UserProfile(String name, long mobile, String email, String msg, String role, boolean flag) {
	super();
	this.name = name;
	this.mobile = mobile;
	this.email = email;
	this.msg = msg;
	this.role = role;
	this.flag = flag;
	this.Adminname=Adminname;
}
public UserProfile() {
	super();
	// TODO Auto-generated constructor stub
}



}

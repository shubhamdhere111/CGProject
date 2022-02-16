package com.app.dto;

import java.util.Scanner;

import com.app.model.User;

public class RequestDto {
	Scanner sn=new Scanner(System.in);
	public User registeRequest() {
		System.out.println("enter your userName:");
		String uname=sn.next();
		System.out.println("enter your email:");
		String email=sn.next();
		System.out.println("enter your password:");
		String password=sn.next();
		System.out.println("enter your mobile:");
		long mobile=sn.nextLong();
		System.out.println("enter your address:");
		String address=sn.next();
		System.out.println("enter your role:");
		String role=sn.next();
		return new User(uname, email, password, address, mobile, role);
		
	}
	public loginDto loginRequest() {
		System.out.println("enter your userName:");
		String uname=sn.next();
		System.out.println("enter your password:");
		String password=sn.next();
		return new loginDto(uname,password);
	}

}

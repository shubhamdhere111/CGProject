package com.app.model;

import java.util.Scanner;

import online.QuizProgram;

public class Admin {
public void run() {
	String s1="shubham", s2="Admin@123",s3,password;
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Your Admin login id");
	s3 = in.nextLine();	
	System.out.println("Enter Your password");
	password=in.next();
	
	//if((uname.contains(sp)) || uname.length()<5)
	if (s1.equalsIgnoreCase(s3)||s2.equalsIgnoreCase(password) ) {
	System.out.println("You have Successfully login to the admin page");
	int number=10;
	System.out.println("Enter 1 for add quiz");
	Scanner sc=new Scanner(System.in);
	number=sc.nextInt();
	QuizProgram obj=new QuizProgram();
	switch(number) {
	case 1:
		obj.quiz();
		break;
	}
	
	}
	else	
	System.out.println("invalid login contact to adminstretor for login and password");

	
}
}

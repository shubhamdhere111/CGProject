package com.app.sample;

import java.io.FileNotFoundException;
import java.util.Scanner;

import com.app.Dao.LoginDao;
import com.app.Dao.RegisterDao;
import com.app.dto.RequestDto;
import com.app.dto.UserProfile;
import com.app.dto.loginDto;
import com.app.model.Admin;
import com.app.model.User;

import online.QuizProgram;

public class SC {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
RequestDto request=new RequestDto();
Admin obj=new Admin();
String choice="";
do {
	System.out.println("Welcome to Application");
	System.out.println("press 1. Register");
	System.out.println("press 2. Login");
	System.out.println("press 3. Admin Login");

	System.out.println("-------------------------------------------");
	System.out.println("Enter your choice");
	int key=sn.nextInt();
	
	switch (key) {
	case 1:
		User user=request.registeRequest();
		RegisterDao dao=new RegisterDao();
		int i=dao.register(user);
		if(i==1) {
			System.out.println("Data Register successfully..!");
		}
		else {
			System.out.println("Sorry user not register..!");
		}
		break;
	case 3:
		System.out.println("enter admin");
		obj.run();
		break;
			
	case 2:
		loginDto dto=request.loginRequest();
		LoginDao loginDao=new LoginDao();
		UserProfile profile=loginDao.login(dto);
		if(profile!=null) {
			System.out.println(profile);
				break;
		}
	default:
		System.out.println("Invalid Request");
		break;
	}
	
	System.out.println("enter (y) key to continue...(y/Y)");
	choice=sn.next();
}while(choice.equalsIgnoreCase("y")); 
	
	
}

}

	



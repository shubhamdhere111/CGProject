package com.app.Dao;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import com.app.dto.UserProfile;
import com.app.dto.loginDto;

import online.QuizProgram;
import com.app.sample.NotesMain;

public class LoginDao {
	Connection con=null;
	PreparedStatement pstmt=null;
	public LoginDao(){
		try {
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hbm","root","");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
public UserProfile login(loginDto user)throws Exception {
	pstmt=con.prepareStatement("select * from User where userName=? and password=?");
	pstmt.setString(1, user.getUserName());
	pstmt.setString(2, user.getPassword());
	ResultSet rs=pstmt.executeQuery();
	UserProfile userProfile=new UserProfile();
	if(rs.next()) {
		userProfile.setName(rs.getString("userName"));
		userProfile.setEmail(rs.getString("email"));
		userProfile.setMobile(rs.getLong("mobile"));
		userProfile.setMsg("Welcome to your profile ."+rs.getString("userName")+" login Successfully.");
		userProfile.setFlag(true);
		QuizProgram quiz=new QuizProgram();
		System.out.println("--------------------------------------"+"\n"+"Enter Following option to chose your Course"+"\n"+"press 1 for Cplus Course"+"\n"
				+ "press 2 for C course"+"\n"+ "press 3 for java Course"+"\n"+" press 4 for Python"+"\n"+"press 5 for take test");
		
		//System.out.println("1");
		Scanner in=new Scanner(System.in);
		int number=10;
		number =in.nextInt();
		NotesMain obj = new NotesMain();
		QuizProgram q=new QuizProgram();
		switch(number) {
		case 1:
			obj.C();
			q.run();
			break;
		case 2:
			obj.Cplus();
			q.run();
			break;
		case 3:
			obj.java();
			q.run();
			break;
		case 4:
			obj.Python();
			q.run();
			break;
		case 5:
		q.run();
		break;
		}

	
	
	}
	else {
		userProfile.setMsg("Sorry your not Register user need to register first");
		userProfile.setFlag(false);
	}
	return userProfile;
}
}

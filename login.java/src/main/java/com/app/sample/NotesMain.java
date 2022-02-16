package com.app.sample;
//import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class NotesMain {

	public void java() throws FileNotFoundException {
		System.out.println("Iam in java Course");
		File file = new File("E:\\project\\java.txt");
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
	}

	public void Cplus() throws FileNotFoundException {
		System.out.println("I am in C++ Course");

		System.out.println("Iam in C Course");
		File file2 = new File("E:\\project\\C++.txt");
		Scanner scan = new Scanner(file2);
		while (scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}

	}

	public void C() throws FileNotFoundException {
		System.out.println("Iam in C Course");
		File file2 = new File("E:\\project\\c.txt");
		Scanner scan = new Scanner(file2);
		while (scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}

	}

	public void Python() throws FileNotFoundException {
		System.out.println("Iam in Python Course");
		File file3 = new File("E:\\project\\python.txt");
		Scanner scan = new Scanner(file3);
		StringBuffer sb=new StringBuffer();
		
		while (scan.hasNextLine()) {
			System.out.println(scan.nextLine());
			
		}

	}
	

}

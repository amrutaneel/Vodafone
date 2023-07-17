package com;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
	Scanner sc  = new Scanner(System.in);
	String con;
	StudentService ss = new StudentService();
	int key;
	int choice;
	do {
		System.out.print("1:Add Student 2: Number of Student 3:Display Student 4: Display Student One by one 5 : Key and Value separate display");
		System.out.println("6 : Search Data 7: Remove Data");
		System.out.println("Plz enter your choice");
		choice = sc.nextInt();
		switch (choice) {
		
		case 1:ss.addStudent();
			   break;
		case 2:ss.numberOfStudent();
		       break;
		case 3:ss.displayStudentInfo();
		       break;
		case 4:ss.displayStudentOneByOne();
		       break;
		case 5 :ss.getOnlyKeys();
			    break;
		case 6:System.out.println("Enter the key");
		       key = sc.nextInt();
		       ss.searchDataUsingKey(key);
		       break;
		case 7: System.out.println("Enter the key to remove the data");
		       key = sc.nextInt();
		       ss.removeData(key);
		       break;
		default:System.out.println("Wrong choice");
		 	   break;
		}
		System.out.println("do you want to continue(y/n)?");
		con = sc.next();
	} while (con.equalsIgnoreCase("y"));
	
	ss.close();
	sc.close();
	System.out.println("Finish Visit Again!");
	
	}

}

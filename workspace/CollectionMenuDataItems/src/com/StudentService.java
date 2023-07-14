package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StudentService {

	//Map<Integer, String> stdNames = new HashMap<Integer,String>();
	//Map<Integer, String> stdNames = new LinkedHashMap<Integer,String>();
	Map<Integer, String> stdNames = new TreeMap<Integer,String>();
	Scanner sc = new Scanner(System.in);
	
	public void addStudent() {
		System.out.println("Enter the id");
		int id = sc.nextInt();
		System.out.println("Enter the name");
		String name = sc.next();
		if(stdNames.containsKey(id)) {
			System.out.println("Key must unique, so information didn't store");
		}else {
			stdNames.put(id, name);
			System.out.println("Student information stored");
		}
	}
	public void numberOfStudent() {
		System.out.println("Number of student details "+stdNames.size());
	}
	
}

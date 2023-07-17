package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class StudentService {

	//Map<Integer, String> stdNames = new HashMap<Integer,String>();
	//Map<Integer, String> stdNames = new LinkedHashMap<Integer,String>();
	Map<Integer, String> stdNames = new TreeMap<Integer,String>();
	Scanner sc = new Scanner(System.in);
	
	public void addStudent() {
		try {
		System.out.println("Enter the id");
		int id = sc.nextInt();			// number without decimal 	
		if(stdNames.containsKey(id)) {
			System.out.println("Key must unique, so information didn't store");
		}else {
			System.out.println("Enter the name");
			String name = sc.next();		// it will take one word	
			stdNames.put(id, name);
			System.out.println("Student information stored");
		}
		}catch(Exception e) {
			//System.out.println(e);
			System.out.println("Id must be int type only");
			sc.nextLine();   // hold enter key
		}
	}
	public void numberOfStudent() {
		System.out.println("Number of student details "+stdNames.size());
	}
	public void displayStudentInfo() {
		System.out.println(stdNames);
	}
	public void displayStudentOneByOne() {
	Set<?> ss = stdNames.entrySet();		// converting map to set key-value 
	Iterator<?> ii = ss.iterator();		// created iterator reference 
	while(ii.hasNext()) {				// if record is there it become true 
		Object std  = ii.next();		// retrieve record 
		System.out.println(std);		// display the record 
	}
	
	}
	public void getOnlyKeys() {
		Set<?> ss = stdNames.keySet();		// converting map to set only key
		Iterator<?> ii = ss.iterator();		// created iterator reference 
		while(ii.hasNext()) {				// if record is there it become true 
			Object key  = ii.next();		// retrieve record 
			//System.out.println("only key "+key);
			System.out.println(stdNames.get(key));		// display the record map object 
		}						// get pass key and get value 
	}
	public void searchDataUsingKey(int key) {
		if(stdNames.containsKey(key)) {
			System.out.println("Your value is "+stdNames.get(key));
		}else {
			System.out.println("No record present");
		}
	}
	public void removeData(int key) {
		if(stdNames.containsKey(key)) {
			stdNames.remove(key);
			System.out.println("Record removed from map");
		}else {
			System.out.println("No record present");
		}
	}
	public void close() {
		sc.close();
	}
}

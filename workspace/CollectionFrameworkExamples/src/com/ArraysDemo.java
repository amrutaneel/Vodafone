package com;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
//	int num[]= {3,1,6,9,2,5,7};	
//	System.out.println("Display Element before sort");
//	for(int n:num) {
//		System.out.print(n+" ");
//	}
//	Arrays.sort(num); 
//	System.out.println();
//	System.out.println("Display Element after sort");
//	for(int n:num) {
//		System.out.print(n+" ");
//	}
//	System.out.println();
//	String names[]= {"Vijay","Ajay","Ramesh","Leela","Neena"};
//	System.out.println("All names before sort");
//	for(String name:names) {
//		System.out.print(name+" ");
//	}
//	Arrays.sort(names);
//	System.out.println();
//	System.out.println("All names after sort");
//	for(String name:names) {
//		System.out.print(name+" ");
//	}
	
	int num[]= {3,1,6,8,4,3,2};
	Arrays.sort(num);
	// 1,2,3,3,4,6,8
//	System.out.println(Arrays.binarySearch(num, 1));
//	System.out.println(Arrays.binarySearch(num, 4));
//	System.out.println(Arrays.binarySearch(num, 6));
//	System.out.println(Arrays.binarySearch(num, 10));
//	System.out.println(Arrays.binarySearch(num, 9));
	
	if(Arrays.binarySearch(num, 10)<0) {
		System.out.println("Element not present");
	}else {
		System.out.println("Element present");
	
	}

	String names[]= {"Vijay","Ajay","Ramesh","Leela","Neena"};
	Arrays.sort(names);
	if(Arrays.binarySearch(names, "Neena")<0) {
		System.out.println("Not present");
	}else {
		System.out.println("present");
	}
	}

}








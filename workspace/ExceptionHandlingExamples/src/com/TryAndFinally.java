package com;

public class TryAndFinally {

	public static void main(String[] args) {
	System.out.println("Hi");
	int a=10;
	int b=0;
	try {
		int res  = a/b;
		System.out.println("Result is "+res);
		System.out.println("No Exception");
	} finally {
		System.out.println("Finally block");
		// close the resources 
	}
	System.out.println("Finish");
	}

}

package com;

public class RuntimeException {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=0;
		int res[] = {100,200,300,400};
		try {
		int result = a/b;
		System.out.println("Result "+result);
		}catch(Exception e) {
			//System.out.println("I Take Care!");  // custom message 
			//System.out.println(e.getMessage());		// pre defined message
			System.out.println(e.toString());// name of the exception and message 
		}
		try {
			int result1 = 100/res[0];
			System.out.println("REsult "+result1);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Bye....");
		System.out.println("Bye....");
		System.out.println("Bye....");
	}

}

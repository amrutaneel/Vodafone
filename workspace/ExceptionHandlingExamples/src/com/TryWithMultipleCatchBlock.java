package com;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=0;
		int abc[]= {100,200,300,400};
		String info = "abc10";   // value is 10 but is string consider. 
		try {
			int result1 = a/b;
			System.out.println("result "+result1);
			int result2 = 100/abc[0];
			System.out.println("result "+result2);
			System.out.println(info+10);  		//1010
			System.out.println(Integer.parseInt(info)+10);  // Integer is type of class which contains parseInt method 
															// which help to convert string to number 
			System.out.println("No Exception");
		} catch (ArithmeticException e) {
			System.out.println("Divided by Zero "+e.toString());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index "+e.toString());
		} catch(Exception e) {
			System.out.println("Generic "+e.toString());
		}
		System.out.println("Normal Statement");
	}

}

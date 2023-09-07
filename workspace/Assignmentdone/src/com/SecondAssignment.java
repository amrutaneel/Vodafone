package com;

import java.util.Scanner;

public class SecondAssignment {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter the value of a");
	a = sc.nextInt();
	System.out.println("Enter the value of b");
	b = sc.nextInt();
	System.out.println("Enter the value of c");
	c = sc.nextInt();
		if(a>b) {
				if(a>c) {
					System.out.println("a is largest");
				}else {
					System.out.println("c is largest");
				}
		}else {
				if(b>c) {
					System.out.println("b is largest");
				}else {
					System.out.println("c is largest");
				}
		}
	}

}

package com;
import java.util.Scanner;
public class ThirdAssignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sub1,sub2,sub3,total;
		float avg;
		System.out.println("Enter sub1 mark");
		sub1  = sc.nextInt();
		System.out.println("Enter sub2 mark");
		sub2  = sc.nextInt();
		System.out.println("Enter sub3 mark");
		sub3  = sc.nextInt();
		total = sub1+sub2+sub3;
		avg = (float)total/3;
		System.out.println(avg);
		if(avg>=90) {
			System.out.println("A+");
		}else if(avg>=75) {
			System.out.println("A");
		}else if(avg>=60) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		sc.close();
	}

}

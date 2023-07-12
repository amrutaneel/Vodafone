package com;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack ss = new Stack();
		ss.push(10);		// Added 1st data in container 
		ss.push(20);		// Added 2nd data in container 
		ss.push(30);
		ss.push(40);
		System.out.println(ss);
		System.out.println("Pop "+ss.pop());  // it remove top most element 
		System.out.println(ss);
		System.out.println("Peek "+ss.peek());  //it check top most element 
		System.out.println(ss);
		System.out.println("search "+ss.search(10)); // it give position of that element 
						// start from top 
		System.out.println("search "+ss.search(100));
	}

}

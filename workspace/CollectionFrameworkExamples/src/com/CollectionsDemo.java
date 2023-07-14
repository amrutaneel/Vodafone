package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
//	List<Integer> ll = new ArrayList<Integer>();	
//	ll.add(2); ll.add(3); ll.add(1); ll.add(7); ll.add(4);
//	System.out.println("Before sort integer from list");
//	for(int n:ll) {
//		System.out.print(n+" ");
//	}
//	Collections.sort(ll);		// Asc
//	System.out.println();
//	System.out.println("After sort integer from list ascending ");
//	for(int n:ll) {
//		System.out.print(n+" ");
//	}
//	Collections.reverse(ll);		//reverse as desc 
//	System.out.println();
//	System.out.println("After sort integer from list descending");
//	for(int n:ll) {
//		System.out.print(n+" ");
//	}
	List<String> names = new ArrayList<String>();
	names.add("Lex"); names.add("Akash"); names.add("Vijay"); names.add("Ramesh");
	System.out.println("Before sort string from list");
	for(String name:names) {
		System.out.print(name+" ");
	}
	Collections.sort(names);
	System.out.println();
	System.out.println("After sort string from list Asc ");
	for(String name:names) {
		System.out.print(name+" ");
	}
	Collections.reverse(names);
	System.out.println();
	System.out.println("After sort string from list Desc");
	for(String name:names) {
		System.out.print(name+" ");
	}
	}

}

package com;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		System.out.println("Size "+hs.size());
		System.out.println("Empty or not: "+hs.isEmpty());
		System.out.println("Add"+hs.add(10)); 
		System.out.println("Add"+hs.add(10));
		System.out.println("Add"+hs.add(10.20));
		System.out.println("Add"+hs.add("Lex"));
		System.out.println("Add"+hs.add(true));
		System.out.println(hs);
		hs.remove(10);
		System.out.println(hs);
		System.out.println("Size "+hs.size());
		System.out.println("Empty or not: "+hs.isEmpty());
		System.out.println(hs);
		hs.remove("Lex"); // it remove using value 
		System.out.println(hs);
		System.out.println("Search "+hs.contains(10));
		System.out.println("Search "+hs.contains(100));
		System.out.println(hs);
		hs.clear();    // remove all elements 
		System.out.println(hs);
		System.out.println("size "+hs.size());
	}

}

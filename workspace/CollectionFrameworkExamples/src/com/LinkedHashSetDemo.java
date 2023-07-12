package com;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
	//HashSet hs = new HashSet();
	LinkedHashSet hs = new LinkedHashSet();
	hs.add(4);
	hs.add(1);
	hs.add(5);
	hs.add("Abc");
	hs.add(9);
	hs.add(6);
	hs.add(3);
	System.out.println(hs);
	}

}

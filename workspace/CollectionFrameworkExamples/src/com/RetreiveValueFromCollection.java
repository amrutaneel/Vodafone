package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RetreiveValueFromCollection {
	public static void main(String[] args) {
//		// array value retrieve using for each or enhanced loop 
//		int abc[]= {10,20,30,40};
//		System.out.println(abc);
//		for(int n:abc) {
//			System.out.println(n);
//		}
//		Set ss= new HashSet();
//		ss.add(10); ss.add(20);ss.add("Ravi");ss.add(40.50);
//		System.out.println(ss);
//		System.out.println("retrieve value from set");
//		for(Object s:ss) {
//			System.out.println(s);
//		}
//		List ll = new ArrayList();
//		ll.add(1); ll.add(5); ll.add(8); ll.add(3);
//		System.out.println("retreive value from list");
//		for(Object n:ll) {
//			System.out.println(n);
//		}
		
		// Set value retreive using iterator 
		Set ss= new HashSet();
		ss.add(10); ss.add(20);ss.add("Ravi");ss.add(40.50);
		Iterator ii = ss.iterator();	// iterator is method and Iterator is interface. 
		while(ii.hasNext()) {			// it check element present or not 
			Object obj = ii.next();		// it retrieve that element and point to next 
			if(obj.equals("Ravi") ) {
				ii.remove();
			}
			System.out.println(obj);
		}
		System.out.println(ss);
		Map mm = new HashMap();
		mm.put("A","X");
		mm.put("B", "Y");
		mm.put("C", "Z");
		Set ss1 = mm.entrySet(); // converting map to set 
		Iterator ii1 = ss1.iterator();
		while(ii1.hasNext()) {
			Object obj = ii1.next();
			System.out.println(obj);
		}
	}
}

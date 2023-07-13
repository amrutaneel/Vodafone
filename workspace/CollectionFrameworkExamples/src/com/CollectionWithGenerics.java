package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionWithGenerics {

	public static void main(String[] args) {
	// Collection without generics 
//	List ll = new ArrayList();
//	ll.add(10);			// auto-boxing : converting primitive to object automatically. 
//	ll.add(20.20);
//	ll.add("Ravi");
//	ll.add(true);
//	Object obj = ll.get(2);		// generic object 
//	Integer i = (Integer)obj;	// converting object to integer object 
//	int n = i.intValue();      // converting integer object to int 
//	System.out.println(n);
		
	// Collection framework with generics 
	//List<Type> ll = new ArrayList<Type>();
	//Type is Integer, Float, Character, Double, String or user defined object. 
	
	List<Integer> ll = new ArrayList<Integer>();
	ll.add(10); 		// auto-boxing ---> converting primitive to object. 
	ll.add(20);
	ll.add(30);
	ll.add(40);
	//ll.add(10.20);
	//ll.add("Ravi");
	Map<Integer, String> mm = new HashMap<Integer,String>();
	mm.put(1, "Ravi");
	int n = ll.get(0);  // auto-unboxing : converting object to primitive 
	System.out.println(n);
	
	}

}

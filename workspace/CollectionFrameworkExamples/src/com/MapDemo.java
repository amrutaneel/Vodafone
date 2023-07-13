package com;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
	Map mm1 = new HashMap();
	mm1.put(2,"Lex");
	mm1.put(1, "Steven");
	mm1.put(3, "Raju");
	System.out.println(mm1);
	mm1.put(1, "Neena");	// if key is present it replace by new value. 
	mm1.put(5, "Lex");
	System.out.println(mm1);
	System.out.println("search using key "+mm1.containsKey(1));
	System.out.println("search using key "+mm1.containsKey(10));
	System.out.println("search using value "+mm1.containsValue("Lex"));
	System.out.println("search using value "+mm1.containsValue("Ajay"));
	System.out.println(" usign key we can get the value "+mm1.get(1));
	System.out.println("using key we can get the value "+mm1.get(10));
	mm1.remove(1);		// usign key we can remove key-value pairs 
	System.out.println(mm1);
	}

}

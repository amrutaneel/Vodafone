package com.main;

import com.bean.Product;

//import com.bean.Product;
//import java.util.*; 
//import java.util.Scanner;
public class DemoTest {

	public static void main(String[] args) {
	Product p = new Product();		// empty constructor we created the memory 
	p.setPid(100);					/// then we set all information one by one 
	p.setPname("TV");
	p.setPrice(45000);
	
	Product p1 = new Product(101, "Computer", 95000);	// while creating memory we set all information 
	
	System.out.println("PId is "+p.getPid());
	System.out.println("PName is "+p.getPname());
	System.out.println("Price is "+p.getPrice());
	
	
	System.out.println("PId is "+p1.getPid());
	System.out.println("PName is "+p1.getPname());
	System.out.println("Price is "+p1.getPrice());
	
	System.out.println(p);// when we display reference in println
	}

}

package pms.main;

import java.util.Scanner;

import pms.bean.Product;
import pms.service.ProductService;

public class App {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ProductService ps =new ProductService();
	int pid;
	String pname;
	float price;
	String con;
	int choice;
	String result;
	do {
		
		System.out.println("1:Add Product 2:Number Of Product");
		System.out.println("Plz enter your choice");
		choice = sc.nextInt();
		switch(choice) {
		case 1:System.out.println("Add Product");
		       System.out.println("Enter the product id");
		       pid = sc.nextInt();
		       System.out.println("Enter the product name");
		       pname = sc.next();
		       System.out.println("Enter the product price");
		       price = sc.nextFloat();
		       Product p = new Product(pid, pname, price); // store in product object. 
		       result = ps.storeProduct(p);
		       System.out.println(result);
		       break;
		case 2:System.out.println("Number of product");
		       break;
		 default:System.out.println("Wrong choice");
		       break;
		}
		
		System.out.println("do you want to continue?");
		con = sc.next();
	} while (con.equalsIgnoreCase("y"));
	System.out.println("Thank you!");
	
	}

}

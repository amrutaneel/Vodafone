package com;

import java.io.DataInputStream;
import java.io.PrintStream;

public class ByteWiseOperation {

	public static void main(String[] args) throws Exception {
	// type : bytewise 
	// source : keyboard 
	// destination : console 
	DataInputStream dis = new DataInputStream(System.in);
	PrintStream ps = System.out;
	ps.println("Enter the name");
	String name =dis.readLine();
	ps.println("Name is "+name);
	}

}

package com;

public class CheckedException {

	public static void main(String[] args) throws Exception{
	System.out.println("Hello");
	try {
	Thread.sleep(5000);
	}catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("Take tea break....");
	}

}

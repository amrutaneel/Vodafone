package com.service;

public class LoginService {

	public boolean checkUser(String emailid,String password) {
		// we can write the code to check emailid and password 
		// from file or database. 
		// JDBC : is use to connect to database. 
		// select * from login where emailid = "akash@gmail.com" and password ="123";
		if(emailid.equals("akash@gmail.com") && password.equals("123")) {
			return true;
		}else {
			return false;
		}
		
	}
}

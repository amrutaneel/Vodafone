package com;
class VoteException extends Exception {
	public VoteException() {
		
	}
	public VoteException(String msg) {
		super(msg);  // super() is use to call parameter constructor of exception to set the message  
	}
}
public class ThrowsExample {
	public static void main(String[] args) {
		int age = 18;
		try {
		if(age<21) {
			//throw new Exception(); //Generic exception without message 
			//throw new Exception("You can't vote age must be >21");
			//throw new ArithmeticException();// specific exception 
			//throw new ArithmeticException("you can't vote age must be >21");
			//throw new VoteException();
			throw new VoteException("You can't vote age must be >21");
			//int res = 10/0; // throw new ArithmeticException();
		}else {
			System.out.println("You can vote!");
		}
		}catch(Exception e) {
			System.out.println(e);// it will call toString() 
		}
		System.out.println("finish");
	}

}

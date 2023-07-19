package typecasting;
class A {
	void dis1() {
		System.out.println("A class dis1 method");
	}
}
class B extends A {
	void dis1() {
		System.out.println("B class override dis1 method of A class");
	}
	void dis2() {
		System.out.println("B class dis2 method");
	}
}
public class DemoTest2 {
	public static void main(String[] args) {
		A obj1 = new A();		// creating super class object. 
	obj1.dis1();
		B obj2 = new B();		// creating sub class object 
	obj2.dis1();       // method overriding 
	obj2.dis2();
	//B obj3 =new A();	// creating super class object and sub class reference not possible.
		A obj4 = new B();	// sub class object and super class reference possible : implicit type casting. 
		obj4.dis1(); // with help of obj4 we can call only those method which belong to super class
		//obj4.dis2();
		B obj5 = (B) obj4;  // down level type casting 
		obj5.dis1();
		obj5.dis2();
	}

}

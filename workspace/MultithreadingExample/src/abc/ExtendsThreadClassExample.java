package abc;

class A extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=20;i++) {
			System.out.println("i "+i);
		}
	}
}
class B extends Thread{
	@Override
	public void run() {
		for(int j=0;j<=20;j++) {
			System.out.println("j "+j);
		}
	}
}
public class ExtendsThreadClassExample {
	public static void main(String[] args) {
	A obj1 = new A();		// obj1 and obj2 are thread class reference. 
	B obj2 = new B();		// thread class reference are ready.
	
	obj1.start();		// ready to run ie Runnable state 
	obj2.start();		// this method internally call run method 
	}
}

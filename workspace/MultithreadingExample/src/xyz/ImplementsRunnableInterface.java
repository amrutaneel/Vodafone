package xyz;

class A implements Runnable{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
		for(int i=0;i<=10;i++) {
			System.out.println("i "+i);
		}
	}
}
class B implements Runnable{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
		for(int j=0;j<=10;j++) {
			System.out.println("j "+j);
		}
	}
}
public class ImplementsRunnableInterface {
	public static void main(String[] args) {
	Thread t = Thread.currentThread();
	System.out.println(t);
	A obj1 = new A();
	B obj2 = new B();		// obj1 and obj2 is normal class object not a thread class object. 
	
	Thread t1 = new Thread(obj1);
	Thread t2 = new Thread(obj2);
	t1.start();			
	t2.start();
	
	}
}

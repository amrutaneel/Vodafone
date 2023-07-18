package staticfactory;
class Employee {
	private Employee() {
		
	}
	public void display() {
		System.out.println("this is employee class method");
	}
	public static Employee getInstance() {	// static factory method
		// we can write some code base upon code we give the object. 
		Employee emp = new Employee();
//		int code=2;
//		if(code==1) {
//			return emp;
//		}else {
//			return null;
//		}
		return emp;
	}
}

public class DemoTest {
	public static void main(String[] args) {
		//Employee emp = new Employee();
		//emp.display();
		Employee e = Employee.getInstance();
		e.display();
	}
}

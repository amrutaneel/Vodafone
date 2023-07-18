package singleton;
class Employee {
	int id;
	private static Employee emp = new Employee();// emp is static reference becuase we want to access inside 
	// getInstance static method
	private Employee() {
		System.out.println("object created...");
	}
	public static Employee getInstance() {
		
		return emp;
	}
	public void display() {
		System.out.println("Display method and id is "+id);
	}
}
public class DemoTest {
	public static void main(String[] args) {
	Employee emp1 = Employee.getInstance();
	emp1.id=10;
	Employee emp2 = Employee.getInstance();
	emp2.id=20;
	emp1.display();
	emp2.display();
	//Employee emp3 = Employee.emp;
	}
}

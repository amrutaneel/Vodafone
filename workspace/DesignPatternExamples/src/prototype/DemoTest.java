package prototype;
class Employee implements Cloneable{
	double salary;
	public void display() {
		System.out.println("Salary is "+salary);
	}
	public Employee getClone() {
				try {
				Object obj = clone(); // this method return type Object class reference. 
				Employee e = (Employee)obj;		//down level type casting 
				return e;
				}catch(Exception e ) {
					System.out.println(e);
					return null;
				}
	}
}
public class DemoTest {
	public static void main(String[] args) {
	Employee emp1 = new Employee();	//1st object 
	Employee emp2 = new Employee(); //2nd object 
	Employee emp3 = emp1;		    // emp1 and emp3 refer to same memory
		emp1.salary=12000;
	emp2.salary=14000;
		emp3.salary=16000;
	emp1.display();	// 16000
	emp2.display(); // 14000
	emp3.display(); // 16000
	Employee emp4 = emp2.getClone();   // we created clone of emp4 object 
	System.out.println("after created clone");
	emp4.display();
	emp2.display();
	emp2.salary=18000; // after done changes on emp2 emp4 will doesn't effect and vice-versa
	emp2.display();
	emp4.display();
	}

}

package assign5;
import java.util.Scanner;

public class Employee {
private int id;
private String name;
private float salary;
private String designation;
Scanner sc  = new Scanner(System.in);

public void read() {
	System.out.println("Enter the id");
	id = sc.nextInt();
	System.out.println("Enter the name");
	name = sc.next();
	System.out.println("Enter the salary");
	salary = sc.nextFloat();
	System.out.println("Enter the designation");
	designation= sc.next();
}
public void calSalary() {
	if(designation.equalsIgnoreCase("manager")) {
		salary = salary+5000;
	}else if(designation.equalsIgnoreCase("developer")) {
		salary = salary+3000;
	}else {
		salary= salary+1000;
	}
}
public void display() {
	System.out.println("id is "+id);
	System.out.println("name is "+name);
	System.out.println("salary is "+salary);
	System.out.println("desgination is "+designation);
}

}

package factory;
class Loan {
	public void calculate() {
		System.out.println("Rate of interest 0.5%");
	}
}
class CarLoan extends Loan {
	public void calculate() {
		System.out.println("Rate of interest 1.2%");
	}
}
class HomeLoan extends Loan {
	public void calculate() {
		System.out.println("Rate of interest 0.8%");
	}
}
class LoanFactory {
	public static Loan getTypeOfLoan(String type) {
		if(type.equalsIgnoreCase("home")) {
			return new HomeLoan();
		}else if(type.equalsIgnoreCase("car")) {
			return new CarLoan();
		}else {
			return null;
		}
	}
}
public class DemoTest {
	public static void main(String[] args) {
		Loan ll = LoanFactory.getTypeOfLoan("car");
		ll.calculate();
	}

}

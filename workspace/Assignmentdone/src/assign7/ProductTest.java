package assign7;

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setPid(1);
		p1.setPname("TV");
		p1.setPrice(68000);
		System.out.println("PId is "+p1.getPid());
		System.out.println("PName is "+p1.getPname());
		System.out.println("Price is "+p1.getPrice());

		Product p2 = new Product(2, "Computer", 56000);
		System.out.println(p2);   // it will call toString method 
	}

}

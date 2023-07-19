package typecasting;

public class DemoTest {

	public static void main(String[] args) {
		// int family 
		long phonenumber = 8765678765l;
		byte a=10;
		short b=a;	// implicit type casting 
		System.out.println("a "+a);
		System.out.println("b "+b);
		short c=129;
		//byte d=c;
		byte d = (byte)c;	// // explicit type casting 
		System.out.println("c "+c);
		System.out.println("d "+d);
		// int to float or double 
		int m=10;
		float n=m;		//implicit type casting 
		System.out.println("m "+m);
		System.out.println("n "+n);
		//float o =10;
		//float o=10.0;	//error because 10.0 double consider 
		//float o=(float)10.0; // explicit type casting 
		float o= 10.1f;			// explicit type casting with post-fix f
		int p =(int)o;		// explicit type casting 
		System.out.println("o "+o);
		System.out.println("p "+p);
	}

}

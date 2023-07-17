package com.bean;

public class Product {	// by default in java every class extends super class ie Object. 

private int pid;
private String pname;
private float price;

public Product() {
	//super();			// by default every sub class constructor contains super() to call super class constructor 
	// TODO Auto-generated constructor stub
}
public Product(int pid, String pname, float price) {
	//super();
	this.pid = pid;
	this.pname = pname;
	this.price = price;
}

public Product(int pid, String pname) {
	//super();
	this.pid = pid;
	this.pname = pname;
}

public Product(int pid) {
	//super();
	this.pid = pid;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
}



//@Override
//public String toString() {
//	return "This is product class object";
//}

}

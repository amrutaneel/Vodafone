package pms.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import pms.bean.Product;
import pms.exception.ProductPriceException;

public class ProductService {

private List<Product> listOfProducts = new ArrayList<Product>();

public String storeProduct(Product product) {
	int flag=0;
	try {
	if(listOfProducts.size()==0) {	
		if(product.getPrice()<1000) {
			throw new ProductPriceException("Price must be > 1000");
		}else {
			listOfProducts.add(product);
			return "Product details stored succcessfully";
		}
		
	}else {
		Iterator<Product> li = listOfProducts.iterator();
		while(li.hasNext()) {
			Product p = li.next();
			if(p.getPid()==product.getPid() ) {
				flag++;
				break;
			}
		}
	}
	if(flag!=0) {
		return "product id must be unique";
	}else if(product.getPrice()<1000) {
		throw new ProductPriceException("Price must be > 1000");
	}else {
		listOfProducts.add(product);
		//flag=0;
		return "Product details stored succcessfully";
	}
	}catch(Exception e) {
		//System.out.println(e);
		return e.getMessage();
	}
	
}

public int numberOfProduct() {
	return listOfProducts.size();
}

}

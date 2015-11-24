package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Environment extends Product {

	private List <Product> products = new ArrayList <Product>();
	
	public Environment(String name, double value, String description, Date manufacturingDate) {
		super(name, value, description, manufacturingDate);
	}
	
	public void addProduct(Product product){
		this.products.add(product);
	}
	
	public void removeProduct(Product product){
		this.products.remove(product);
	}
	
	public void printProduct(){
		System.out.println("Ambiente Criado!!!");
		for(Product product : this.products){
			product.printProduct();
		}
	}

}

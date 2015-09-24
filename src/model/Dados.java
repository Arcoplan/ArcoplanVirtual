package model;

import java.util.ArrayList;
import java.util.List;

public class Dados {

	private static List<Product> products = new ArrayList<Product>();
	
	public static void cadastrarProduct(Product product){
		products.add(product);
	}
	
	public static List<Product> ListProducts() {
		return products;
	}
}

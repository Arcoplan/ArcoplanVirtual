package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ProductDao extends ConnectionFactory{

	Product product = new Product();
	
	public void createProduct(Product product){
		
		try
		{
			java.util.Date utilDate = product.getManufacturingDate();
			java.sql.Date manufacturingDate = new java.sql.Date(utilDate.getTime());
			Connection connection = getConnection();
			PreparedStatement pstm = connection
				.prepareStatement("INSERT INTO product (name, value, description, manufacturingDate) VALUES(?,?,?,?);");
			pstm.setString(1, product.getName());
			pstm.setDouble(2, product.getValue());
			pstm.setString(3, product.getDescription());
			pstm.setDate(4, manufacturingDate);
		
			pstm.execute();
			pstm.close();
		
			connection.close();
		}catch (Exception e){
			e.printStackTrace();
		}
			
	}
	
	public List<Product> listProducts(){
		List<Product> list = new ArrayList<Product>();
		try
		{
			Connection connection = getConnection();
			Statement stm = connection.createStatement();
			ResultSet rs = stm.executeQuery("Select * from product");
			while(rs.next())
			{
				Product product = new Product();
				product.setID(rs.getString("idproduto"));
				product.setName(rs.getString("name"));
				product.setValue(rs.getDouble("value"));
				product.setDescription(rs.getString("description"));
				product.setManufacturingDate(rs.getDate("manufacturingDate"));
				list.add(product);
			}
			stm.close();
			connection.close();
		}catch (Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	public void delete(String id){
		try
		{
			Connection connection = getConnection();
			PreparedStatement pstm = connection.prepareStatement("Delete from product where idproduto = "+id);
			
			pstm.execute();
			pstm.close();
			connection.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public void updateProduct(Product product, String id){
		try{
			java.util.Date utilDate = product.getManufacturingDate();
			java.sql.Date manufacturingDate = new java.sql.Date(utilDate.getTime());
			Connection connection = getConnection();
			PreparedStatement pstm = connection
					.prepareStatement("update product set name=?, value=?, description=?, manufacturingDate=? where idproduto= "+id);
			
			pstm.setString(1, product.getName());
			pstm.setDouble(2, product.getValue());
			pstm.setString(3, product.getDescription());
			pstm.setDate(4, manufacturingDate);	
			
			pstm.execute();
			pstm.close();
			connection.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public Product searchProduct(String id){
		Product product = new Product();
		try{
			Connection connection = getConnection();
			Statement stm = connection.createStatement();
			ResultSet rs = stm.executeQuery("select * from product where idproduto= "+id);
			
			while(rs.next()){
			product.setID(rs.getString("idproduto"));
			product.setName(rs.getString("name"));
			product.setValue(rs.getDouble("value"));
			product.setDescription(rs.getString("description"));
			product.setManufacturingDate(rs.getDate("manufacturingDate"));
			}
			stm.close();
			connection.close();
		}catch (Exception e){
			e.printStackTrace();
		}
		return product;
	}
}

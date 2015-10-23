package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Environment;

public class EnvironmentDao extends ConnectionFactory {
	
	Environment environment = new Environment();
	
	public void createEnvironment(Environment environment){
	
		try{
			Connection connection = getConnection();
			PreparedStatement pstm = connection.prepareStatement("INSERT INTO environment(name, descriptionEnvironment) VALUES(?,?)");
			pstm.setString(1, environment.getName());
			pstm.setString(2, environment.getDescriptionEnvironment());
			
			pstm.execute();
			pstm.close();
			
			connection.close();
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public List<Environment> listEnvironments(){
		List<Environment> list = new ArrayList<>();
		try{
			Connection connection = getConnection();
			Statement stm = connection.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM environment");
			while (rs.next()){
				Environment environment = new Environment();
				environment.setName(rs.getString("name"));
				environment.setDescriptionEnvironment(rs.getString("descriptionEnvironment"));
				list.add(environment);				
			}
			stm.close();
			connection.close();
		} catch (Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	public void delete(String id){
		try{
			Connection connection = getConnection();
			PreparedStatement pstm = connection.prepareStatement("Delete from environment where id = "+id);
			
			pstm.execute();
			pstm.close();
			connection.close();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public void updateEnvironment(Environment environment, String id){
		try{
			Connection connection = getConnection();
			PreparedStatement pstm = connection.prepareStatement("UPDATE environment set name=?, descriptionEnvironment=?");
			pstm.setString(1, environment.getName());
			pstm.setString(2, environment.getDescriptionEnvironment());
			
			pstm.execute();
			pstm.close();
			connection.close();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}

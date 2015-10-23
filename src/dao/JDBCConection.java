package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConection {
	
	
	public Connection getConection(){
		Connection con = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Conecting database");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arcoplan","root","ideas");
	
		}
		
		catch(SQLException e)
		{
			System.out.println("Problem database conecting"+e);
		}
		catch(ClassNotFoundException cf)
		{
			cf.printStackTrace();
		}
		
		return con;
	}
}

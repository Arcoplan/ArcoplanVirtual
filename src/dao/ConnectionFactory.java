package dao;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {

	public static void main(String[] args) {
		
		try
		{
			Connection connection = new JDBCConnection().getConnection();
			connection.close();
			System.out.println("desconected database!");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}

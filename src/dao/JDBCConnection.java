package dao;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCConnection {

	public static void main(String[] args) {

		try
		{
			Connection connection = new ConnectionFactory().getConnection();
			connection.close();
			System.out.println("desconected database!");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}

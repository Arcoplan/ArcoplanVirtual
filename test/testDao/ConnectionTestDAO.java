package testDao;

import org.dbunit.PropertiesBasedJdbcDatabaseTester;
import org.dbunit.operation.DatabaseOperation;

public class ConnectionTestDAO {

	private String user = "root";
	private String password = "ideas";
	private String database = "jdbc:mysql://localhost:3306/arcoplan";
	private String url = "com.mysql.jdbc.Driver";
	
	public ConnectionTestDAO(String name){
		super();
		configConnectionDataBase();
	}

	
    protected DatabaseOperation getSetUpOperation() throws Exception {
	return DatabaseOperation.REFRESH;
    }

    private void configConnectionDataBase() {
    	
    	System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_DRIVER_CLASS,
		"com.mysql.jdbc.Driver");
    	System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_CONNECTION_URL, url
			+ database);
    	System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_USERNAME,
		user);
    	System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_PASSWORD,
		password);
    }
}


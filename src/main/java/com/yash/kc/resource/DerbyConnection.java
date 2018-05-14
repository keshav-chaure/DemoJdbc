package com.yash.kc.resource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DerbyConnection {
	private static Connection conn = null;

	public static Connection getDerbyConnection() throws ClassNotFoundException, SQLException{		
		    String driver = "org.apache.derby.jdbc.ClientDriver";
		    String dbName = "AddressBookDB";
		    String connectionURL = "jdbc:derby:testdb1;create=true";	 	 
		    Class.forName(driver);
		    return DriverManager.getConnection(connectionURL);
		
	}

}

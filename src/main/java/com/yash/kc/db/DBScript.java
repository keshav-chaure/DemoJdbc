package com.yash.kc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import com.yash.kc.resource.DerbyConnection;

public class DBScript {
	
	static Connection conn = null;

	public static void createTable(String sql) throws ClassNotFoundException, SQLException {
		conn = DerbyConnection.getDerbyConnection();
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(sql);
	}
	
	public static void addData(String sql, Map<String, String> keyValue) throws SQLException{
		PreparedStatement psInsert = conn.prepareStatement(sql);
	 	keyValue.forEach( (k,v) -> {
			try {
				psInsert.setString(1, k);
				psInsert.setString(2, v);

			} catch (SQLException e) {
			 
				e.printStackTrace();
			}
		});
	 	psInsert.executeUpdate();
	}
	
	
}

package com.yash.kc.jdbc_demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.yash.kc.daoimpl.AddressDaoImpl;
import com.yash.kc.db.DBScript;
import com.yash.kc.domain.Address;
import com.yash.kc.resource.DerbyConnection;

public class App  {

 
	private static Connection conn = null;

	public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		

		 
		    if (args.length != 2) {
		      System.out.println("Usage: java JavaDBDemo <Name> <Address>");
		     // System.exit(1);
		    }
		//    String driver = "org.apache.derby.jdbc.EmbeddedDriver";
	//	    String driver = "org.apache.derby.jdbc.ClientDriver";
	//	    String dbName = "AddressBookDB";
	//	    String connectionURL = "jdbc:derby:testdb1;create=true";
	//	    String createString = "CREATE TABLE ADDRESSBOOKTbl (NAME VARCHAR(32) NOT NULL, ADDRESS VARCHAR(50) NOT NULL)";
	//	    Class.forName(driver);

	//	    conn = DriverManager.getConnection(connectionURL);
		    
	/*	    Statement stmt = conn.createStatement();
		    stmt.executeUpdate(createString);
*/
	  /*
		    PreparedStatement psInsert = conn
		        .prepareStatement("insert into ADDRESSBOOKTbl values (?,?)");

		    psInsert.setString(1, "some");
		    psInsert.setString(2, "Pune");

		    psInsert.executeUpdate();
   */
		    
		    /*
		    conn=DerbyConnection.getDerbyConnection();
		    Statement stmt2 = conn.createStatement();
		    ResultSet rs = stmt2.executeQuery("select * from ADDRESSBOOKTbl");
		    System.out.println("Addressed present in your Address Book\n\n");
		    int num = 0;

		    while (rs.next()) {
		      System.out.println(++num + ": Name: " + rs.getString(1) + "\n Address"
		          + rs.getString(2));
		    }
		   
		    rs.close();
		      */
		    
		    
		    conn=DerbyConnection.getDerbyConnection();
		    AddressDaoImpl address=new AddressDaoImpl();
		    List<Address> listAddresses=address.getAllAddresses();
		    listAddresses.stream().forEach(s->System.out.println(s.getCity() +"  "+s.getName()));
		    System.out.print("list of address "+ listAddresses);
		    
		  }
}

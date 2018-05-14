package com.yash.kc.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.yash.kc.daoimpl.AddressDaoImpl;
import com.yash.kc.domain.Address;
import com.yash.kc.resource.DerbyConnection;

public class DBBuilder {
 
	private static String createADDRESSBOOKTbl = "CREATE TABLE ADDRESSBOOKTbl (NAME VARCHAR(32) NOT NULL, ADDRESS VARCHAR(50) NOT NULL)";
	private static String inserSQL="insert into ADDRESSBOOKTbl values (?,?)";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
	//	DBScript.createTable(createADDRESSBOOKTbl);	   
	    HashMap<String, String> keyValue =new HashMap<String, String>();
	    keyValue.put("ravi", "p");	     
	    keyValue.put("raju", "u");	
	    keyValue.put("rana", "s"); 
	    DBScript.addData(inserSQL, keyValue);
		
	}

}

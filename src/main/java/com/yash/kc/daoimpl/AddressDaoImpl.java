package com.yash.kc.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yash.kc.dao.AddressDao;
import com.yash.kc.daoexception.MethodNotImplemntedException;
import com.yash.kc.domain.Address;
import com.yash.kc.resource.DerbyConnection;

public class AddressDaoImpl implements AddressDao {
	Connection conn = null;

	public List<Address> getAllAddresses() throws ClassNotFoundException, SQLException   {
		
		conn = DerbyConnection.getDerbyConnection();
		Statement stmt2 = conn.createStatement();
		ResultSet rs = stmt2.executeQuery("select * from ADDRESSBOOKTbl");
		System.out.println("Addressed present in your Address Book\n\n");
		int num = 0;

		
		List<Address> list = new ArrayList();

		while (rs.next()) {
			Address address = new Address();
			address.setName(rs.getString(1));
			address.setCity(rs.getString(2));
			list.add(address);

		  System.out.println(++num + ": Name: " + rs.getString(1) + "\n Address" + rs.getString(2));

		}
		rs.close();
		return list;
	}

	public Address getAddress(int isbn) throws MethodNotImplemntedException {
		throw new MethodNotImplemntedException("not implemented");
	}

	public void saveAddress(Address address) throws MethodNotImplemntedException {
		throw new MethodNotImplemntedException("not implemented");

	}

	public void deleteAddress(Address address) throws MethodNotImplemntedException {
		throw new MethodNotImplemntedException("not implemented");

	}

}

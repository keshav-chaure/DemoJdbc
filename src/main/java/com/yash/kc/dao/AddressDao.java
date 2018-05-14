package com.yash.kc.dao;

import java.sql.SQLException;
import java.util.List;

import com.yash.kc.daoexception.MethodNotImplemntedException;
import com.yash.kc.domain.Address;

public interface AddressDao  {

	List<Address> getAllAddresses() throws ClassNotFoundException, SQLException;

	Address getAddress(int isbn) throws MethodNotImplemntedException;

	void saveAddress(Address address) throws MethodNotImplemntedException;

	void deleteAddress(Address address) throws MethodNotImplemntedException;

}

package com.java.CachedRowSet;

import javax.sql.rowset.CachedRowSet;

import com.sun.rowset.CachedRowSetImpl;

public class CreateCachedRowsetObjectDefaultConstructor {
public static void main(String[] args)throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	
	CachedRowSet csr=new CachedRowSetImpl();
	csr.setUrl("jdbc:mysql://localhost:3306/Test");
	csr.setUsername("root");
	csr.setPassword("root");
	csr.setCommand("update customerName from Test.customer where customerId=1 ");
	csr.execute();
}
}

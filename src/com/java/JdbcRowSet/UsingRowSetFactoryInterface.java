package com.java.JdbcRowSet;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class UsingRowSetFactoryInterface {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		RowSetFactory rsf=null;
		String url="jdbc:mysql://localhost:3306/Test";
		 String userName=  "root";
		 String password= "root"; 
		 rsf=RowSetProvider.newFactory();
		JdbcRowSet jdbcRs=rsf.createJdbcRowSet();
		 jdbcRs.setCommand("select * from Test.customer");
		    jdbcRs.setUrl(url);
		    jdbcRs.setUsername(userName);
		    jdbcRs.setPassword(password);
		    jdbcRs.execute();
		    while(jdbcRs.next())
		    	System.out.println(jdbcRs.getInt(1)+" "+jdbcRs.getString(4)+"  "+jdbcRs.getString(2)+"  "+jdbcRs.getString(3)+"  "+jdbcRs.getDate(5));

	}

	}



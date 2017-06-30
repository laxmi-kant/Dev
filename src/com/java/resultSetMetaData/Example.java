package com.java.resultSetMetaData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Example {
	public static void main(String [] args)throws Throwable{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?user=root&password=root");

//		Statement stmt=con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY); we cant update for concurRead only
		Statement stmt=con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs =stmt.executeQuery("select * from Test.customer");
		
		while(rs.next()){
			String f = rs.getString("customerName");
			rs.updateString( "customerName", "laxmi kant yadav");
			System.out.println("row updated ");
			rs.updateRow();
			System.out.println(rs.getString("customerName"));
		}

	}
}

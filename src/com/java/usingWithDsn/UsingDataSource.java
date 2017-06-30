package com.java.usingWithDsn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsingDataSource {
public static void main(String [] args) {
Connection con=null;
Statement stmt=null;
String dbName="Test";
String createString =
"create table " + dbName +
".SUPPLIERS " +
"(SUP_ID integer NOT NULL, " +
"SUP_NAME varchar(40) NOT NULL, " +
"STREET varchar(40) NOT NULL, " +
"CITY varchar(20) NOT NULL, " +
"STATE char(2) NOT NULL, " +
"ZIP char(5), " +
"PRIMARY KEY (SUP_ID))";
	try {   
		Class.forName("com.mysql.jdbc.Driver");
		
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "root");
			stmt=con.createStatement();
			Boolean rs=stmt.execute(createString);
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

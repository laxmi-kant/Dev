package com.java.Stattement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
       
public class CreateTable {
public static void main(String []args) throws ClassNotFoundException, SQLException {
	 String createString =
		        "create table " +" Test" +
		        ".COFFEES " +
		        "(COF_NAME varchar(32) NOT NULL, " +
		        "SUP_ID int NOT NULL, " +
		        "PRICE float NOT NULL, " +
		        "SALES integer NOT NULL, " +
		        "TOTAL integer NOT NULL, " +
		        "PRIMARY KEY (COF_NAME), " +
		        "FOREIGN KEY (SUP_ID) REFERENCES " +
		        "Test" + ".SUPPLIERS (SUP_ID))";
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test","root","root");
	Statement stmt=con.createStatement();
System.out.println(	stmt.execute(createString));
}
}

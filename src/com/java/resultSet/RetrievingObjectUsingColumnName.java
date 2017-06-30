package com.java.resultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrievingObjectUsingColumnName {
 public static void main(String[] args) throws Exception{
	 String url="jdbc:mysql://localhost:3306/Test?user=root&password=root";
	 Class.forName("com.mysql.jdbc.Driver");
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?user=root&password=root");
	 Statement stmt=con.createStatement();
	 ResultSet rs=stmt.executeQuery(" select customerName ,mobileNo,customerId from Test.customer");
	 while(rs.next()){
		 System.out.println("customerId    "+rs.getInt("customerId") +" customerName  "+rs.getString("customerName")+" mobileNo "+rs.getString("mobileNo"));
	 }
 }
}

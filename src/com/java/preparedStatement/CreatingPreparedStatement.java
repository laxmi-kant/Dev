package com.java.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.PreparedStatement;

public class CreatingPreparedStatement {
	public static void main(String [] args)throws Throwable{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?user=root&password=root");
    
		PreparedStatement ps=con.prepareStatement("select * from Test.customer");
		
		ResultSet rs =ps.executeQuery();
		
		while(rs.next()){
			String f = rs.getString("customerName");
			
			
			System.out.println(rs.getString("customerName"));
		}

	}
}

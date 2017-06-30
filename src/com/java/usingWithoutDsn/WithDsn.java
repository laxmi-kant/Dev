package com.java.usingWithoutDsn;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;
public class WithDsn {
    
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		  
		   String url="jdbc:mysql://localhost:3306/Test";
				 String userName=  "root";
				 String password= "root";  
		  String sql="select * from customer ";
		   Class.forName("com.mysql.jdbc.Driver");  
		   Connection con= DriverManager.getConnection(url, userName, password);
		   Statement stmt=con.createStatement();
		   ResultSet rs=stmt.executeQuery(sql);
while(rs.next()){
	System.out.println(rs.getInt(1)+" "+rs.getString(4)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getDate(5));
}
	}

}

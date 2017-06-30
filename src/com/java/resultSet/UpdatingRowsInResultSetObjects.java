package com.java.resultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdatingRowsInResultSetObjects {
public static void main(String [] args)throws Throwable{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?user=root&password=root");

	Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	ResultSet rs =stmt.executeQuery("select * from Test.customer");
	
	while(rs.next()){
		String f = rs.getString("mobileNo");
		rs.updateString( "mobileNo", f);
		System.out.println("row updated ");
		rs.updateRow();
	}

}
}

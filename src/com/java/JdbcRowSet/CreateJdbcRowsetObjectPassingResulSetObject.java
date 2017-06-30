package com.java.JdbcRowSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.sql.rowset.JdbcRowSet;

import com.sun.rowset.JdbcRowSetImpl;

import java.sql.ResultSet;

public class CreateJdbcRowsetObjectPassingResulSetObject {
public static void main(String[] args)throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?user=root&password=root");
	Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery("select * from Test.customer");
	
	//Passing resultSet Object
	
	JdbcRowSet jrs= new JdbcRowSetImpl(rs);
	while(jrs.next()){
		System.out.println(jrs.getCursorName()+" "+jrs.getDataSourceName()+" "+jrs.getString(1));
	}
	
	
}
}

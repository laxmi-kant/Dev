package com.java.Stattement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTableUsingStatement {
public static void main (String [] args) throws ClassNotFoundException, SQLException{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test","root","root");
	Statement stmt=con.createStatement();
System.out.println(	stmt.executeUpdate("insert into " + "Test" +
        ".SUPPLIERS " +
        "values(49, 'Superior Coffee', " +
        "'1 Party Place', " +
        "'Mendocino', 'CA', '95460')"));
System.out.println(stmt.executeUpdate("insert into " + "Test" +
        ".SUPPLIERS " +
        "values(101, 'Acme, Inc.', " +
        "'99 Market Street', " +
        "'Groundsville', 'CA', '95199')"));
System.out.println(stmt.executeUpdate("insert into " + "Test" +
        ".SUPPLIERS " +
        "values(150, " +
        "'The High Ground', " +
        "'100 Coffee Lane', " +
        "'Meadows', 'CA', '93966')"));

}
}

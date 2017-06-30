package com.java.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class UpdatePreparedStatement {
public static void main(String[] args) throws SQLException ,Exception{
	 Class.forName("com.mysql.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?user=root&password=root");
	    HashMap<String, Integer> salesForWeek=new HashMap<>();
	    salesForWeek.put( "A",1);
	    salesForWeek.put("B",2);
	    salesForWeek.put( "C",3);
	    salesForWeek.put( "D",4);
	    salesForWeek.put( "E",5);
	    salesForWeek.put( "F",6);
	    
	    UpdatePreparedStatement ups=new UpdatePreparedStatement();
	    
	    ups.updateCoffeeSales(salesForWeek,con);
}
	public void updateCoffeeSales(HashMap<String, Integer> salesForWeek,Connection con)
		    throws SQLException ,Exception{

		    PreparedStatement updateSales = null;
		    PreparedStatement updateTotal = null;
		   
String dbName="Test";
		    String updateString =
		        "update " + dbName + ".COFFEES " +
		        "set SALES = ? where COF_NAME = ?";

		    String updateStatement =
		        "update " + dbName + ".COFFEES " +
		        "set TOTAL = TOTAL + ? " +
		        "where COF_NAME = ?";

		    try {
		        con.setAutoCommit(false);
		        updateSales = con.prepareStatement(updateString);
		        updateTotal = con.prepareStatement(updateStatement);

		        for (Map.Entry<String, Integer> e : salesForWeek.entrySet()) {
		            updateSales.setInt(1, e.getValue().intValue());
		            updateSales.setString(2, e.getKey());
		            updateSales.executeUpdate();
		            updateTotal.setInt(1, e.getValue().intValue());
		            updateTotal.setString(2, e.getKey());
		            updateTotal.executeUpdate();
		            con.commit();
		        }
		    } catch (SQLException e ) {
		        System.out.println(e);
		        if (con != null) {
		            try {
		                System.err.print("Transaction is being rolled back");
		                con.rollback();
		            } catch(SQLException excep) {
		            	System.out.println(excep);
		            }
		        }
		    } finally {
		        if (updateSales != null) {
		            updateSales.close();
		        }
		        if (updateTotal != null) {
		            updateTotal.close();
		        }
		        con.setAutoCommit(true);
		    }
		}
}

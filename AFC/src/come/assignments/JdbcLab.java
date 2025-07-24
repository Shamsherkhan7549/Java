package come.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/*
  
 	1. You are developing a Java application to insert new customer information into a
		database. How would you use JDBC to achieve this? Provide sample code for
		inserting a new customer record.

 	2. You want to update the email address of a specific customer in the database
		using JDBC. How would you do this, and can you provide sample code for it?
			
 */


public class JdbcLab {
	Connection connection;
	PreparedStatement ps;
	Statement s;

	// Establish DB connection
	public JdbcLab() {
		
			try {
				connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/db0717", "root", "Shamsher@mysql");
			}catch(SQLException ex) {
				System.out.println("Error in db connection : " + ex );
			}
	}
	
	
	// Create Table
	public boolean createTable() {
		
		boolean result = false;
		
//		String dropTable = "DROP TABLE customers";
		
		String createTable = "CREATE TABLE customers(id INT PRIMARY KEY AUTO_INCREMENT,"+
													 "name VARCHAR(25) NOT NULL,"+
													"phone VARCHAR(10) NOT NULL," +	
													"email VARCHAR(50) NOT NULL" +	
													")";
		
		try {
			s = connection.createStatement();
			 s.executeUpdate(createTable);
			 System.out.println("customer table created");
			 result = true;
		}catch(SQLException ex) {
			System.out.println("Error in creating table : " + ex);
		}
		
		return result;
	}
	
	//1. Insert Data 
	public int insertStudent(String name, String phone, String email) {
		int insertData = 0;
		
		try {
			ps = connection.prepareStatement("INSERT INTO customers(name, phone, email) VALUES (?,?,?) ");
			ps.setString(1,  name);
			ps.setString(2, phone);
			ps.setString(3, email);
			insertData = ps.executeUpdate();
		}catch(SQLException ex) {
			System.out.println("Error in inserting data : " + ex);
		}
		
		return insertData;
	}
	
	//2. Update Data
	
	public int updateData(int id, String email) {
		int updateData = 0;
		try {
			ps = connection.prepareStatement("UPDATE customers SET email = ? WHERE id = ? ");
			ps.setString(1, email);
			ps.setInt(2, id);
			updateData = ps.executeUpdate();
			
		}catch(SQLException ex) {
			System.out.println("Error in Updating data : " + ex);
		}
		
		return updateData;
	}

	
}


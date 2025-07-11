package com.connection.dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcDemo2 {
	public static void main(String str[]) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db0717", "root", "Shamsher@mysql");
			String dbName = connection.getCatalog();
			if(dbName != null) {
				System.out.println("DB connected " + dbName);
			};
			
			PreparedStatement ps = connection.prepareStatement("INSERT INTO student (name, email) VALUE (?,?)");
			ps.setString(1, "raghu");
			ps.setString(2, "raghu@gmail.com");
			int r = ps.executeUpdate();
			System.out.println(r);
			
			if(r>0)
			 {
				 System.out.println("data inserted in table");
			 }

			
			
			
		}catch(SQLException ex) {
			System.out.println("DB connection error: " + ex);
		}
	}
}

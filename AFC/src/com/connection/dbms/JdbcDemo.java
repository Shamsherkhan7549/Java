package com.connection.dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String str[]) {
		try {
			// register driver
			//Class.forName("jdbc.odbc.cj.mysql.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db0717", "root", "Shamsher@mysql");
			String name = connection.getCatalog();
			System.out.println(name);
			
			if(name != null) {
				System.out.println("DB connected");
			}else {
				System.out.println("DB not connected");
			}
			
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM STUDENT");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) );
			}
			
			
		}catch(SQLException ex){
			System.out.println("DB not connected");
			System.out.println("Error found in db connection : " + ex);
		}
	}
}

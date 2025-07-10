package com.connection.dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
			
		}catch(SQLException ex){
			System.out.println("DB not connected");
			System.out.println("Error found in db connection : " + ex);
		}
	}
}

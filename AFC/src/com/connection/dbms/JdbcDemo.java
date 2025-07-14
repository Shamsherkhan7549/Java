package com.connection.dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String str[]) {
		try {
			// load JDBC driver
			//Class.forName("jdbc.odbc.cj.mysql.Driver");
			
			// connect to the database
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db0717", "root", "Shamsher@mysql");
			String name = connection.getCatalog();
			System.out.println(name);
			
			if(name != null) {
				System.out.println("DB connected");
			}else {
				System.out.println("DB not connected");
			}
			
			// Create statement and run query
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM STUDENT");
			// Process result
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) );
			}
			
			rs.close();
			statement.close();
			connection.close();
			
			
		}catch(SQLException ex){
			System.out.println("DB not connected");
			System.out.println("Error found in db connection : " + ex);
		}
	}
}



			/* JDBC stands for Java Database Connectivity.

				 
				 * It is an API (Application Programming Interface) in Java that allows Java applications
				 	*  to connect and interact with databases like MySQL, Oracle, PostgreSQL, etc.
				 	*  
				 	*  
				 
				 ✅ Main Purpose of JDBC:
						To perform database operations (like CRUD) from Java code:
						
						Create → Insert data
						
						Read → Select data
						
						Update → Update data
						
						Delete → Delete data
						
				🔧 JDBC Architecture:
						There are two main layers:
						
						1. JDBC API (in Java code)(written by Oracle)
								-- A set of classes and interfaces in Java (inside java.sql package)
								-- This is what you write in your Java code:
								-- Classes like Connection, Statement, ResultSet, etc.
								1. Connection
								2. Statement
								3. PreparedStatement
								4. ResultSet
								5. DriverManager
								6. SQLException
						📦 Comes with:
									- JDK (Java Development Kit)
									- No need to download separately
						
						2. JDBC Driver (provided and written by the database vendor to connect Java to that database)
								-- A JAR file (Java library) provided by the database vendor
								-- This is the actual bridge between Java and the database.
								-- Every database (like MySQL, Oracle, PostgreSQL) provides its own driver JAR.
								-- Converts your JDBC API calls into database-specific commands
								
								Database		Driver Class								Driver JAR File
								
								MySQL			com.mysql.cj.jdbc.Driver					mysql-connector-java-x.x.x.jar
								
								Oracle			oracle.jdbc.driver.OracleDriver				ojdbc8.jar
								
								PostgreSQL		org.postgresql.Driver						postgresql-x.x.x.jar
								
								
								📥 Comes from:
									You need to download and add it to your project
									
									example : To connect Java with MySQL, you need:
										➡️ MySQL JDBC driver (mysql-connector-java.jar)
										
									
					🔄 JDBC Working Flow (Step-by-Step)
							Let’s see how it flows when a Java app wants to talk to the database:

											Java Code (JDBC API)
											       ↓
											DriverManager
											       ↓
											JDBC Driver (from vendor)
											       ↓
											Database (e.g., MySQL)
											
													or
													
													[ JDBC API ]
								(Your Java Code — Connection, Statement, etc.)
											       ↓
											[ DriverManager ]
											       ↓
											[ JDBC Driver ]
									(Database-specific translator)
											       ↓
											[ Database ]
										(MySQL, Oracle, etc.)

						
				🛠️ Key JDBC Classes/Interfaces:
				
						Component				Description
						
						DriverManager			Loads the JDBC driver and manages DB connections
						
						Connection				Represents the connection to the database
						
						Statement				Used to execute SQL queries
						
						PreparedStatement		Used to execute parameterized SQL queries
						
						ResultSet				Stores the result returned by a query
						
						
				💡 Advantages of JDBC:
				
						Platform-independent database access
						
						Easy to use with many types of databases
						
						Built-in support in Java SE


				 	
			*/
				




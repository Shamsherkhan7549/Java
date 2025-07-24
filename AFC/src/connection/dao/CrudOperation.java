package connection.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudOperation {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	Statement st;
	
	
	 
	 public CrudOperation() throws SQLException {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db0717", "root", "Shamsher@mysql");
		}catch(SQLException ex) {
			System.out.println("Error found while connecting DB : " + ex);
		}
		
	}


	 public int insertUser(String name, String email, String password) {
		 try {
			 
			 if(con != null) {
				 ps = con.prepareStatement("INSERT INTO users(name, email, password) value(?,?,?)");
				 ps.setString(1, name);
				 ps.setString(2, email);
				 ps.setString(3, password);
				 int result = ps.executeUpdate();
				 ps.close();
				 return result;
				 
			 }
			 System.out.println("Database not connected");

		 }catch(SQLException ex) {
			 System.out.println(ex);
		 }
		 
		 return 0;
	 }
	 
	 
	 public ResultSet viewUser(String email) {
		 try {
			 
			 if(con != null) {
				 ps = con.prepareStatement("SELECT * FROM users WHERE email = ?");
				 ps.setString(1, email);
				    rs = ps.executeQuery();
				 
				 
			 }else {

			 }

		 }catch(SQLException ex) {
			 System.out.println(ex);
		 }
		 
		 return rs;

	 }
	 
	 public ResultSet viewAllUser() {
		 try {

			 if(con != null) {
				 ps = con.prepareStatement("SELECT * FROM users");
				    rs = ps.executeQuery();
				  
			 }
			 
			 System.out.println("Database not connected");

		 }catch(SQLException ex) {
			 
			 System.out.println(ex);
		 }
		 

		 return rs;
	 }
	 
	 public int updateUser(int id, String password) {
		 try {

			 if(con != null) {
				 ps = con.prepareStatement("UPDATE users SET password = ? WHERE id = ?");
				 ps.setString(1, password);
				 ps.setInt(2, id);
				
				 int result = ps.executeUpdate();
				 return result;
				 
			 }
			 System.out.println("Database not connected");

		 }catch(SQLException ex) {
			 System.out.println(ex);
		 }
		 
		 return 0;
	 }
	 
	 
	 public int deleteUser(int id, String password) {
		 try {

			 if(con != null) {
				 ps = con.prepareStatement("DELETE  FROM users WHERE id = ? AND password = ?");
				 ps.setInt(1, id);
				 ps.setString(2, password);
				
				 int result = ps.executeUpdate();
				 return result;
				 
			 }
			 System.out.println("Database not connected");

		 }catch(SQLException ex) {
			 System.out.println(ex);
		 }
		 
		 return 0;
	 }
	 
	 public void  tableInfo() {
		 
		 try {
			 System.out.println("table info");
			 ResultSetMetaData rsmd=rs.getMetaData();
				String data = rsmd.getTableName(1);
				System.out.println(rsmd.getSchemaName(1));
				System.out.println(data);
				int col=rsmd.getColumnCount();
				System.out.println("No of Columns"+" "+col);
				for(int i=1;i<=col;i++)
				System.out.print(rsmd.getColumnName(i)+"\t");
				

			 
		 }catch(SQLException ex) {
			 System.out.println();
		 }
		 
	 }
	 
	 public void createTable()
		{
			 String sql = "CREATE TABLE users (" +
	                 "id INT PRIMARY KEY AUTO_INCREMENT," +
	                 "name VARCHAR(50) NOT NULL," +
	                 "email VARCHAR(50)," +
	                 "password VARCHAR(50)"+
	                 ")";
			try
			{
			 st = con.createStatement();
			st.executeUpdate(sql);
			System.out.println("users table created");
			}
			catch(SQLException e)
			{
				System.out.println(e);
			}
			
		}

	 
	 
	 
	
	 
}



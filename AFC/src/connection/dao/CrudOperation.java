package connection.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrudOperation {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	
	 
	 public CrudOperation() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db0717", "root", "Shamsher@mysql");
		}catch(SQLException ex) {
			System.out.println("Error found while connecting DB : " + ex);
		}
		
	}


	 public int insertUser(String name, String email, String password) {
		 try {
			 
			 if(con != null) {
				 ps = con.prepareStatement("INSERT INTO student(name, email, password) value(?,?,?)");
				 ps.setString(1, name);
				 ps.setString(2, email);
				 ps.setString(3, password);
				 int result = ps.executeUpdate();
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
				 ps = con.prepareStatement("SELECT * FROM student WHERE email = ?");
				 ps.setString(1, email);
				    rs = ps.executeQuery();
				    
				 return rs;
				 
			 }
			 System.out.println("Database not connected");

		 }catch(SQLException ex) {
			 System.out.println(ex);
		 }
		 
		 return null;
	 }
	 
	 public ResultSet viewAllUser() {
		 try {

			 if(con != null) {
				 ps = con.prepareStatement("SELECT * FROM student");
				    rs = ps.executeQuery();
				 return rs; 
			 }
			 
			 System.out.println("Database not connected");

		 }catch(SQLException ex) {
			 
			 System.out.println(ex);
		 }
		 
		 return null;
	 }
	 
	 public int updateUser(int id, String password) {
		 try {

			 if(con != null) {
				 ps = con.prepareStatement("UPDATE student SET password = ? WHERE id = ?");
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
				 ps = con.prepareStatement("DELETE  FROM student WHERE id = ? AND password = ?");
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
	 
}



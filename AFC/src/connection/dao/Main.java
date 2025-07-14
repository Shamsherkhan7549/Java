package connection.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
 public static void main(String str[]) {
	 
	 CrudOperation co = new CrudOperation();
	 
	 System.out.println("Enter 1 to create user");
	 System.out.println("Enter 2 to view user");
	 System.out.println("Enter 3 to list all user");
	 System.out.println("Enter 4 to update user");
	 System.out.println("Enter 5 to delete user");
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter no to select operation");
	 int input = sc.nextInt();
	 
	 switch(input) {
	 case 1: 
		 System.out.println("Enter user name : ");
		 String name = sc.next();
		 
		 System.out.println("Enter user email : ");
		 String email = sc.next();
		 
		 System.out.println("Enter user password : ");
		 String password = sc.next();
		 int result = co.insertUser(name, email, password);
		 if(result>0) {
			 System.out.println("User inserted");
		 }
		 break;
		 
	 case 2: 
		 System.out.println("Enter email to view user : ");
		 String email2 = sc.next();
		 try {
			 ResultSet rs = co.viewUser(email2);
			 System.out.println("rs : " + rs);
			 while(rs.next()) {
				 System.out.println("id : " + rs.getInt(1) + " name : " + rs.getString(2) + " email : " + rs.getString(3) + " password : " + rs.getString(4));
			 }
			 
			 
		 }
		 catch(SQLException ex) {
			 System.out.println(ex);
		 }
		 break;
		 
	 case 3: 
		 System.out.println("Enter email to view user : ");
		 try {
			 ResultSet rs = co.viewAllUser();
			 // available user :- rs : com.mysql.cj.jdbc.result.ResultSetImpl@3eb738bb
			// id : 1 name : raghu email : raghu@gmail.com password : raghu123
			 
			 // user not found: com.mysql.cj.jdbc.result.ResultSetImpl@3eb738bb
			 
			 while(rs.next()) {
				 System.out.println("id : " + rs.getInt(1) + "\t" + " name : " + rs.getString(2) + "\t" + " email : " + rs.getString(3) + "\t" + " password : " + rs.getString(4));
			 }
		 }
		 catch(SQLException ex) {
			 System.out.println(ex);
		 }
		 break;
		 
	 case 4: 
		 System.out.println("Enter user id : ");
		 int id = sc.nextInt();
		 
		 System.out.println("Enter user password : ");
		 String password2 = sc.next();
		 
		 int result2 = co.updateUser(id, password2);
		 if(result2>0) {
			 System.out.println("User Updated");
		 }else {
			 System.out.println("Id or password is wrong");
		 }
		 break;
		 
	 case 5: 
		 System.out.println("Enter user id : ");
		 int id2 = sc.nextInt();
		 
		 System.out.println("Enter user password : ");
		 String password3 = sc.next();
		 
		 int result3 = co.deleteUser(id2, password3);
		 System.out.println("result3 : " + result3);
		 if(result3>0) {
			 System.out.println("User deleted");
		 }else {
			 System.out.println("Id or password is wrong");
		 }
		 break;
	 }
 }
}

package come.assignments;

import java.util.Scanner;

public class JdbcMain {
public static void main(String str[]) {
	// creating object
	JdbcLab jl = new JdbcLab();
	System.out.println("Enter 1 to create table table");
	System.out.println("Enter 2 to create customer info");
	System.out.println("Enter 3 to update email info");
	
	System.out.println("Enter number to work");
	Scanner sc = new Scanner(System.in);
	
	int choice = sc.nextInt();
	
	switch(choice) {
	
	case 1:
		boolean result =  jl.createTable();
		System.out.println("table created : " + result);
		break;
		
	case 2:
		
			System.out.println("Enter Name");
			String name = sc.next();
			System.out.println("Enter Phone");
			String phone = sc.next();
			System.out.println("Enter email");
			String email = sc.next();
			int insertData = jl.insertStudent(name, phone,email);
			System.out.println( insertData + " data inserted");
			
			break;
			
	case 3: 
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter new email");
		String newEmail = sc.next();
		int updateData = jl.updateData(id, newEmail);
		System.out.println( updateData + " data updated");
		break;
		
		
	}
	
	
	
		
	
	

	sc.close();
	
}
}

package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
	int roll_no;
	String name;
	long phone;
	int fee;
	public Student(int roll_no, String name, long phone, int fee) {

		this.roll_no = roll_no;
		this.name = name;
		this.phone = phone;
		this.fee = fee;
	}

	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", phone=" + phone + ", fee=" + fee + "]";
	}	
	
}
public class StudentInfoArrayList {
 public static void main(String str[]) {
	 
	 
	 List <Student> student = new ArrayList();
	 
	 Scanner sc = new Scanner(System.in);
	 
	while(true) {
		 
		 System.out.println("Enter id: ");
		 int roll_no  = sc.nextInt();
		 
		 System.out.println("Enter name: ");
		 String name  = sc.nextLine();
		 sc.nextLine();
		 
		 System.out.println("Enter phone: ");
		 long phone  = sc.nextLong();
		 
		 System.out.println("Enter fee: ");
		 int fee  = sc.nextInt();
		 
		 student.add(new Student(roll_no, name , phone, fee));
		 
		 System.out.println("Do you want to exit y/n: ");
		 char permission  = sc.next().charAt(0);
		 if(permission == 'y') {
			 break ;
		 }
		
	}
	
	System.out.println("You are exit");
	
	
	
//	 
//	 student.add(new Student(1, "sam", 919191910, 300));
//	 student.add(new Student(2, "sam2", 919191911, 400));
//	 student.add(new Student(3, "sam3", 919191912, 500));
//	 student.add(new Student(4, "sam4", 919191913, 600));
//	 student.add(new Student(5, "sam5", 919191914, 700));
	 
	 System.out.println(student);
	 
	 
 }
}

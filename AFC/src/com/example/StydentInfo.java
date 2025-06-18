package com.example;

public class StydentInfo {
	
	public void validateMarks(int marks) {
		try {
			if(marks <30 || marks >100) {
				throw new ValidateMarks("Error: Student failed or Invalid marks!");
			}else {
				System.out.print("Result: Student passed.");
			}
		}catch(ValidateMarks ex) {
			System.err.print(ex.getMessage());
		}
		
		System.out.println("Task completed");
	}
	public static void main(String[] str) {
		StydentInfo student = new StydentInfo();
		
		student.validateMarks(10);
	}
}

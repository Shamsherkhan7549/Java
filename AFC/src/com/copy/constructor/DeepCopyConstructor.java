package com.copy.constructor;

class Student_2{
	String name;
	int marks[];
	
	
	public Student_2(String name, int[] marks) {
		super();
		this.name = name;
		this.marks = marks;
	}


	// Deep copy constructor
	public Student_2(Student_2 s) {
		this.name = s.name;
		this.marks = new int[s.marks.length];
		
		for(int i = 0; i < s.marks.length; i++) {
			this.marks[i] = s.marks[i]; // copy value
		} 
	}
	
	public void display(String label) {
		System.out.println(label + " Name " + name);
		System.out.print( label + " marks : ");
		
		for(int mark: marks) {
			System.out.print(mark + "\t");
		}
		
		System.out.println("\n");
	}
	
	
	
	
}

public class DeepCopyConstructor {

	public static void main(String[] args) {
		int[] marks = {90,96,99};
		
		// Original copy
		Student_2 student = new Student_2("shamsher khan", marks);
		student.display("Original:");
		
		
		//Deep copy
		Student_2 student2 = new Student_2(student);
		student2.marks[0] = 100;
		student2.name = "samar khan";
		
		student2.display(" Deep copy ");
		
		student.display("Original:");
	}

}

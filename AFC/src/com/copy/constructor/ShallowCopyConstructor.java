package com.copy.constructor;

class Student{
	String name;
	int marks[];
	
	// Parameterized constructor
	public Student(String name, int[] marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	// Shallow copy constructor
	Student(Student s) {
        this.name = s.name;
        this.marks = s.marks; // same reference
    }
	
	void display(String label) {
		System.out.println(label + " Name : " + name);
		System.out.print(label + " marks ");
		
		for(int mark : marks) {
			System.out.print(mark + " \t");
		}
		
		System.out.println("\n");
	}
	
}

public class ShallowCopyConstructor {

	public static void main(String[] args) {
		int[]marks = {90,95,85};
		//Original object
		Student student = new Student("Shamsher", marks);
		student.display(" Original ");
		
		//Shallow copy object
		Student student2  = new Student(student);
		 student2.name = "samar";
		student2.marks[0] = 100 ;
		student2.display(" Shallow_copy ");
		
		student.display(" Original ");
		
	}

}

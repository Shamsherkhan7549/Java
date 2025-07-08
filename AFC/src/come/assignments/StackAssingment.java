package come.assignments;

import java.util.Stack;

public class StackAssingment {
	/*
	 * 1. Write a program to declare stack.Store 10 elements
	 * into it.Remove 4 elements from stack and display it.
	 */
	
	public static void addBooks(Stack<String> books) {
		books.add("DSA");
		 books.add("DBMS");
		 books.add("C");
		 books.add("C++");
		 books.add("JAVA");
		 books.add("JAVASCRIPT");
		 books.add("PYTHON");
		 books.add("RUST");
		 books.add("GOLANG");
		 books.add("KOTLIN");
		 
		 System.out.println("List of books ");
		 System.out.println(books);
	}
	
	public static void deleteBooks(Stack<String> books) {
		for(int i = 0; i < 4; i++) {
			System.out.print(books.pop() + "\t");;
		}
		
	}
	
 public static void main(String str[]) {
	 Stack <String> books = new Stack<>();
	 addBooks(books);
	 deleteBooks(books);
	 
 }
}

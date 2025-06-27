package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
  	1. Create a Book class with bookId, bookName and authorName.Create parameterized
		constructor to initialize the object. Create an ArrayList of type Book and store all book
		objects into collections and display all book details.
		[Hint:Use advanced for loop to display all Books details]
*/

class Book{
	int bookId;
	String bookName;
	String authorName;
	
	public Book(int bookId, String bookName, String authorName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + "]";
	}	
	
}





public class ArrayListLinkedListAssingment {	
	
	public static void listBooks() {
		/*1*/
		Scanner sc = new Scanner(System.in);
		
		List<Book> al = new ArrayList<>();
	
		boolean condition = true;
		
		System.out.println("Enter Book's Details: ");
		
		while(condition) {
			System.out.print("Enter Book_Id : ");
			int id  = sc.nextInt();
			
			System.out.print("Enter Book_Name : ");
			String name  = sc.next();
			
			
			System.out.print("Enter Author_Name : ");
			String author  = sc.next();
			
			Book book = new Book(id, name, author);
			al.add(book);
			
			
			System.out.print("Do you want to exit y/n : ");
			char res  = sc.next().charAt(0);
			if(res == 'y') {
				condition =  false ;
			}
			
		}
		
		for(Book b: al) {
			System.out.println(b);
		}
	}



	/*
		2.Write a program to reverse a given List of strings
	*/	


	public static void createProductList(){
			LinkedList<String> products = new LinkedList<>();
			Scanner sc = new Scanner(System.in);

			boolean condition = true;
			while(condition){
				System.out.print("Enter Product Name : ");
				String product = sc.next();

				products.add(product);
				System.out.print("Do you want to exit y/n : ");
				char res  = sc.next().charAt(0);
				if(res == 'y') {
					condition =  false ;
				}
			}

			System.out.println(products);

				System.out.print("Do you want to reverse LinkedList y/n : ");
				char res  = sc.next().charAt(0);
				if(res == 'y') {
					reverseLinkedList(products);
				}

			System.out.println(products);


			

			
	}

	public static void reverseLinkedList( LinkedList<String> products){
		Collections.reverse(products);
		for(String product: products){
			System.out.println(product);
		}
	}
	
	
	
	
	public static void main(String str[]) {
		/*1*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Do you want to list books y/n : ");
		char res = sc.next().charAt(0);
		if(res == 'y') {
			listBooks();
		}

		/*2 */

		System.out.print("Do you want to add product in linked-list  y/n : ");
		char res2 = sc.next().charAt(0);
		if(res2 == 'y') {
			createProductList();
		}
	
		
	}
}

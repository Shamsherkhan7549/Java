package com.string.string_buffer.srting_builder;

public class StringNonPrimitiveDataType {
	public static void main(String Str[]){
		
		String name = "Shamsher "; // String literal
		
		System.out.println(name);		
		name = name.concat("Khan");
		System.out.println(name);
		
	
		String name2 = "Samar"; // Stored in String Pool
		String name3 = "Samar"; // name3 pointing to name2 because both string value is same
		System.out.println(name2 == name3);
		
		String name4 = new String("Samar"); //Using new keyword and stored in heap
		String name5 = new String("Samar");
		System.out.println(name4 == name5);
		
	}
}


/*
 * A String is a sequence of characters used to represent text. It is one of the
 *  most commonly used class types in Java and is part of the java.lang package.
 *  
 *  Java String objects are immutable, meaning once a string object is created,
 *   its content cannot be changed.
 */
import java.util.*; //Inbult package;
public class MyPackage {
    public static void main(String[] args){
        System.out.println("My Package");
        // Packages:- Package is a group of similar types of classes, interfaces and sub-packages;It provides a way to organize the code, manage namespaces, and prevent naming conflicts. A package acts as a container for classes, interfaces, and sub-packages. Java has a rich set of pre-defined packages, and you can also create your own custom packages.
        // Packages:- 1> Inbuilt Packages  2> Use-defined Packages

        // Inbuilt Packages:- java.util.*; java.util.Arrays; java.util.
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
    }
}

// Packages:- Package is a group of similar types of classes, interfaces and sub-packages;It provides a way to organize the code, manage namespaces, and prevent naming conflicts. A package acts as a container for classes, interfaces, and sub-packages. Java has a rich set of pre-defined packages, and you can also create your own custom packages.
// Packages:- 1> Inbuilt Packages  2> Use-defined Packages

//Why Use Packages?
//Organization: It helps in organizing classes logically.
//Access control: Packages provide a level of access control. You can specify which classes are accessible to other classes or packages.
//Avoid naming conflicts: Different classes with the same name can exist in different packages.
//Easier maintenance: Large projects are easier to manage with packages as they provide a clear structure.

// Types of Packages
//There are two types of packages in Java:

//1. Built-in (Predefined) Packages
//Java provides a set of predefined packages that contain a collection of classes, interfaces, and methods that are readily available for use. Some of the most commonly used predefined packages are:

//java.lang: Contains fundamental classes, such as String, Math, Object, Thread, etc. This package is automatically imported by default.
//java.util: Contains utility classes such as ArrayList, HashMap, Date, etc.
//java.io: Contains classes for input and output (I/O) functionality, like File, BufferedReader, PrintWriter, etc.
//java.net: Provides classes for networking functionalities, like Socket, URL, etc.
//java.sql: Contains classes for database-related functionalities, such as Connection, Statement, ResultSet, etc.

// 2. User-defined Packages
//You can create your own custom packages to organize your classes and interfaces. This is particularly useful for large applications to maintain clean code and prevent naming conflicts.


package MyJavaProject;

import java.sql.*;

public class Main {


    public static void main(String[] args) throws ClassNotFoundException {
        // if class not in same package
         Class.forName("MyJavaProject.App");
        System.out.println("Welcome...");

        // Database credentials
//        String url = "jdbc:mysql://localhost:3306/your_database_name"; // Change database_name
//        String user = "your_username"; // Change username
//        String password = "your_password"; // Change password
//
//        try {
//            // Load MySQL JDBC Driver
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            // Establish Connection
//            Connection conn = DriverManager.getConnection(url, user, password);
//            System.out.println("Connected to MySQL successfully!");
//
//            // Close Connection
//            conn.close();
//        } catch (Exception e) {
//            System.out.println(e);;
//        }

    }
}

// Here, object is required to call the methods. We don't need to write the code to create object using new keyword here.  Methods will be called by our program to create a return these objects.

// code to connect with database:-

// Following method of the Driver Interface should be called to create a connection with database ->

// Public Connection connect(String url , Properties p)

//Implementation of this method is available in class defined by Database vendors. This class is known as Driver class

//*************************************************************************************************************************

// Name of this class is MySQL is "com.mysql.cj.jdbc.Driver".
// Name of this class in Oracle is "oracle.jdbc.driver.OracleDriver".

// Implementation of these Interfaces are provided by Database vendors. JAR file of these implementaion (classes) must be added  into our project. These implementation is called JDBC Driver.

// There are four types of JDBC drivers:-
// 1>  Type 1 driver (JDBC-ODBC bridge driver)
// 2> Type 2 driver (Native API java driver)
// 3> Type 3 driver (Network Protocol driver)
// 4> Type 4 driver (Thin driver)(in use)

// First three drivers are deprecated/removed. Only thin driver is available. This driver is built by the Database vendors

// These two operations will be performed using JDBC:-

// a> Connection with Database
// b> Execute queries

//  We need object of Driver class in order to call connect() method of Driver Interface, We don't need to write the code to call connect method. Code to call this is predefined inn getConnection() method DriverManager class . getConnection()  is a static method og DriverManager class. We will just write code to call getConnection() method of Driver manager class.

// DriverManager.getConnection("url of the database", "username of the database" , "password of the database" ) ;

// if our  database is MySQL :-
// DriverManager.getConnection("jdbc:mysql://localhost:3306/myjava","root","mysql")

// if our  database is Oracle :-
// DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle")

 // DriverManager class must have the reference of (object og) respective Driver class.
//Every Driver class, on loading , creates an object of itself and gives thath obhect to the DriverManager class.

//Remember that , all classes that our program is using directly will ber loaded by JVM, but our program is not using Drive class directly , so, it will not be loaded automatically.

//Code to load a class:-

//Class.forName("packagename.classname");


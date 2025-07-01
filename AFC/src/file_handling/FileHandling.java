package file_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandling {
 public static void main(String Str[]) {
	 Scanner sc = new Scanner(System.in);
	 
	 //Create file
	 File file = new File("d:\\student.txt");
	 
	 try {
		 boolean createFile = file.createNewFile();
		 if(createFile)System.out.println("File created");
		 else System.out.println("File not created");
			 
	 }catch(IOException ex) {
		 System.out.print("Error found while creation of file");
		 System.out.print("Error : " + ex);
	 }
	 
	 if(file.exists()) {
		 System.out.println("File already created.");
	 }
	 
	 try {
		 FileWriter fw = new FileWriter(file);
		 BufferedWriter bw = new BufferedWriter(fw);
		 PrintWriter pw = new PrintWriter(bw);
		 
		 System.out.print("Enter Id : ");
		 		int id = sc.nextInt();
		 		
		 System.out.print("Enter Name : ");
		 		String name = sc.next();
		 		
		 pw.println("Id : " + id);
		 pw.println("Name : " + name);
		 
	 }catch(IOException ex) {
		 System.out.println("Errro " + ex);
	 }
	 
 }
}

import java.util.Scanner;

	/*
		create an abstract class Shape and create two implementation class Circle
		and Rectangle and override abstract method calculateArea()
	*/


	abstract class Shape{
		abstract double calculateArea();
	}

	class Circle extends Shape{
		public double calculateArea(){
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter redius: ");
			int radius = sc.nextInt();
			double area = 3.14*radius*radius; 
			
			return area;
		};
	}


	class Rectangle extends Shape{
		public double calculateArea(){
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.print("Enter length: ");
			int length = sc.nextInt();

			System.out.print("Enter breadth: ");
			int breadth = sc.nextInt();

			double area =  length*breadth;
	
			return area;
		}
	}

public class DyanamicPolymorphism{

	public static void main(String str []){
		
	Shape shape = new Circle();
	System.out.print(shape.calculateArea());

	shape = new Rectangle();
	System.out.print(shape.calculateArea());

}
}
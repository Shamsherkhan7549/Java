import java.util.Scanner;

class Student{
		int roll_no;
		String name;
		double fees;
		
		void setInfo(){
			Scanner sc  = new Scanner(System.in);

			System.out.println("Enter roll number: ");
			roll_no=sc.nextInt();


			System.out.println("Enter Name: ");
			name=sc.next();


			System.out.print("Enter Fees: ");
			fees=sc.nextDouble();
			 
		}

		public void getInfo(){
			System.out.println("Roll-No: "+ roll_no);
			System.out.println("Name: "+ name);
			System.out.print("Fees: "+ fees);
		}
		
	}

public class StudentClass{

	public static void main(String[] str){

	Student student = new Student();

	student.setInfo();
	student.get‌Info();

}
}
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exception :-> an event occur during the execution of a program
                        // that disrupts the normal flow of instruction.

       try {
           Scanner sc = new Scanner(System.in);

           System.out.println("Enter Whole Number to Devide ");
           int a = sc.nextInt();

           System.out.println("Enter Whole Number to Devide by ");
           int b = sc.nextInt();

           int  c = a/b;
           System.out.println(c);

       }catch (ArithmeticException e){
           System.out.println("It is an Arithmetic Error, " + e);
       }catch (InputMismatchException e) {
           System.out.println("Enter valid input, "+ e);
       }catch (Exception e) {
           System.out.println("Enter valid input, "+ e);

       }finally {
           System.out.println("Printed Always");
       }
    }
}
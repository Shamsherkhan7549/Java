import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 

    //    double input = sc.nextDouble();

    //    System.out.println(input);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println("product of a & b = " + a*b);
    }
}
import java.util.Scanner;

public class Function {

    //Method:- A method is a block of code that performs a specific task and can be called whenever needed. It helps in code reusability, modularity, and maintainability.
    //Methods have two type:- inbuilt method(sort, max, min, sqrt, pow, sc.nextIn()), useDefined Method(sum of two number, product of numbers etc)
   
    public static void print(int a){
        if(a%2==0){
            System.out.println("Its an even number");
        }else{
            System.out.println("Its an odd number");
        }

    };

    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        print(a);
    }
}

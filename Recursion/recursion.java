package Recursion;

public class recursion {

    // Recursion:-> Recursion is defined as a process which calls itself directly or
    // indirectly and the corresponding function is called a recursive function.


    public static void main(String[] args){
        System.out.println(sumOfNumber(5));
        System.out.println(factorialOfNumber(4));
    }

    private static int factorialOfNumber(int n) {
        if(n==1)
            return 1;

        int factorial = n*factorialOfNumber(n-1);
        return factorial;
    }

    private static int sumOfNumber(int n) {
        if(n==0){
            return 0;
        }
        return n+sumOfNumber(n-1);
    }
}

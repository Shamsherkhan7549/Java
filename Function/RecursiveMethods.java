
class Factorial{

            // 9. Recursive Methods
           // ✅ These methods call themselves until a base condition is met.
          // ✅ Used for problems like factorial, Fibonacci, etc.


    int a;
    Factorial(int a){
        this.a = a;
    }

    int factorial(int a){
        if(a==0) return 1; //base case
        return  a * factorial(a-1);
    }

    int add(){
        return  a+5;
    }
}

public class RecursiveMethods {
    public static void main(String[] args){
        System.out.println("It is a Recursive Function");

        Factorial f = new Factorial(5);
        System.out.println(f.factorial(5));
        System.out.println(f.add());
    }
}

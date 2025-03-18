import Arrays.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

class Add{
    int add(int a, int b){//user defined method
            return  a+b;
    }
}


public class Function extends Thread {


    //Method:- A method is a block of code that performs a specific task and can be called whenever needed. It helps in code reusability, modularity, and maintainability.
    //Methods have two type:- inbuilt method(sort, max, min, sqrt, pow, sc.nextIn()), useDefined Method(sum of two number, product of numbers etc)

    public void run(){
        System.out.println("Thread is running.");
    }

    public static void print(int a){ //user defined method
        if(a%2==0){
            System.out.println("Its an even number");
        }else{
            System.out.println("Its an odd number");
        }
    };

    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
       // print(a);


        //user defined method
        Add num = new Add();
        int add = num.add( + 2,4);
        System.out.println("add = " + add);

        //Inbuild methods
        //Using Math Class Methods
        double x = Math.sqrt(25);
        System.out.println("square root = " + x);
        System.out.println("Power = " + Math.pow(2,3));
        System.out.println("Abs = " + Math.abs(-4));
        System.out.println("Max = " + Math.max(2,5));
        System.out.println("Min = " + Math.min(2,5));

        //Using String Class Methods
        String name = "shamsher";
        String NAME = name.toUpperCase();
        System.out.println(name + ", " + NAME);
        System.out.println("Name Length = " + name.length());
        System.out.println("NAME = " + NAME.toLowerCase());
        System.out.println("Char At 3 = " + name.charAt(3));

        //3. Arrays Class Methods
        int nums[] = new int[5];
        nums[0] = 4;
        nums[1] = 5;
        nums[2] = 2;
        nums[3] = 1;
        nums[4] = 3;

        System.out.print("nums = ");
         for(int i  = 0; i < nums.length; i++){
            System.out.print(nums[i]+ ", ");
        }
        System.out.println();

         Arrays.sort(nums);
        System.out.print("nums = ");
        System.out.println(Arrays.toString((nums)));

        // 4. Collections Class Methods

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 1, 8, 3));
        Collections.sort(list);
        System.out.println("list = " + list);
        Collections.reverse(list);
        System.out.println("reverse list = " + list);

        // 5. System Class Methods
        // Used for input/output and system-related operations.
        System.out.println("Hi");

        long time = System.currentTimeMillis();
        System.out.println("Current Time in Milliseconds: " + time);


        //6. Thread Class Methods:- Used for multithreading operations.

        Function t1 = new Function();
        t1.start();


        //7. Character Class Methods ;- Used for character manipulations.
        System.out.println("is digit = " + Character.isDigit('5'));
        System.out.println("is digit 2 = " + Character.isDigit((500)));
        System.out.println("is letter = " + Character.isLetter('A'));
        System.out.println("is letter 2 = " + Character.isLetter('5'));
        System.out.println("to uppercase = " + Character.toUpperCase('a'));

                    System.out.println("conclusion");

            // Inbuilt methods in Java are categorized into various classes, including:
            //✅ String Methods (length(), toUpperCase(), etc.)
            //✅ Math Methods (sqrt(), pow(), abs(), etc.)
            //✅ Arrays Methods (sort(), binarySearch(), etc.)
            //✅ Collections Methods (sort(), reverse(), etc.)
            //✅ System Methods (println(), currentTimeMillis(), etc.)
            //✅ Thread Methods (start(), sleep(), etc.)
            //✅ Character Methods (isDigit(), isLetter(), etc.)

    }
}

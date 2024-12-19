
class AritmaticOprtators {

    public static void main(String[] args) {
        //Binary Operator (+, -, *, /, %)

        // Additon
        int a = 21;
        int b = 4;
        int c = a+b;  // a,b are operands and + is operator.
        System.out.println("c"); // this will print c not the value of c because "" changed bahavior of c , variable to string.
        System.out.println("Additon: " + c); //this will print value of c

        // Subtraction
        int d = a-b;
        System.out.println("Subtraction: " + d);

        //Multiplication
        int e = a*b;
        System.out.println("Multiplication: " + e);

        //Devide :- This will give Quotient.

        int f = a/b;
        System.out.println("Devide: " + f);

        //Modulo :- This will give remainder.
        int g = a%b;
        System.out.println("Modulo: " + g);

        // Uniary operators (++, --) :- ++ is increment operator, -- is decrement operator

        // Increment operator:- Pre ncrement ++x, Post increment x++

        int x = 10;
        int y = x++; //first use old value and changed to new value
        System.out.println(x);
        System.out.println("Post increment: " + y);
        
        int z= ++x; //first changed new value and use new value
        System.out.println("Pre increment: " + z);

        // Decrement operator:- Pre decrement --l , Post decrement l--

        int l = 5;
        int m = l--;
        System.out.println(l); // first use old value and changed to new value
        System.out.println("Post decrement: " + m);

        int n = --l; //first changed new value and use new value
        System.out.println("Pre decrement: " + n);


    }
    
};

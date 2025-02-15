
class SquareMethod{

            // 5. Return Type Methods
            // ✅ These methods return a value after execution.
           //  ✅ The return type can be int, String, boolean, etc.
    int b;

    SquareMethod(int b){
        this.b = b;
    }

    int square(int a){
        return a*a;
    }

    int addSquare(int a, int b){
        return (a*a + b*b);
    }

    int abs(){
        return Math.abs(b);
    }
}

class Printer {
            // 6. Void Methods
           // ✅ These methods do not return any value.
           // ✅ Used when a method performs an action instead of returning a result.

    void greet(String name){
        System.out.println("Hello India " + name);
        return; //can not write return name means it doesnot return anything
    }
}

public class ReturnTypeMethod {

    public static void main (String[] args){
        System.out.println("It is Retutrn type method");

        //Return Type Method
        SquareMethod sm = new SquareMethod(-25);
        System.out.println("square of a = " + sm.square(4));
        System.out.println("square root of b = " + sm.abs());
        System.out.println("add square a and b = " + sm.addSquare(2,3));

        //void method
        Printer p = new Printer();
        p.greet("shamsher");
    }
}

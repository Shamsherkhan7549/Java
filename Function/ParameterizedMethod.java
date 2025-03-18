
 class Calculator{ //a class is a blueprint for creating objects. It defines the properties (fields/variables) and behaviors (methods) that the objects of that class will have.

    //  1.  Parameterized function
    // ✅ These methods accept parameters (arguments) for dynamic input.
    // ✅ They allow flexibility by passing different values at runtime.

    int sum(int a, int b){
        return a+b;
    }

     void greetWorld(){
         System.out.println("Hello world");
     }
 };

 class Message{

        //    2. Non-Parameterized Methods
        //✅ These methods do not accept parameters.
        //✅ They perform a fixed operation and do not depend on input.

     void greet(){
         System.out.println("Hello India");
     }
 }

public class ParameterizedMethod {
    public  static void main(String [] args){
        System.out.println("User Defined Function");

        //  1.  Parameterized function
        Calculator sum = new Calculator();
        System.out.println("sum = " + sum.sum(2,3));

        // 2. Non-Parameterized Methods
        Message msg = new Message();
        msg.greet();

        sum.greetWorld();

    }
}

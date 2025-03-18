public class Polymorphism {
    public static void main(String[] args){
        System.out.println("Its Polymorphism");

        //Polymorphism means "many forms." In object-oriented programming (OOP), it allows us to use the same method or function in different ways based on the type of object we are working with. This can happen because of inheritance (when one class is based on another) or through interfaces (a contract that classes agree to follow).
        //Types of Polymorphism in Java:
        //1. Compile-time Polymorphism (also known as Method Overloading)
        //2. Run-time Polymorphism (also known as Method Overriding)

        //1. Compile-time Polymorphism (also known as Method Overloading)
            Sum sum1 = new Sum();
            int add1= sum1.sum(2,3);  //  this time (compile time) it chosen which function should call
            int add2 = sum1.sum(1,2,3);
        System.out.println("add1 = " + add1);
        System.out.println("add2 = " + add2);

        // 2. Run-time Polymorphism Dynamic Polymorphism (also known as Method Overriding)
          Animal2 cat = new Animal2("tom");
          cat.walk();

          Fish2 tuna = new Fish2("tune");
        System.out.println(tuna.name);
        tuna.walk(); // this time (compile time) it did not choosen that which class function should run but it choose the Fish class function at run time
    }
}

//1. Compile-time Polymorphism or Static Polymorphism (also known as Method Overloading)
//   :- In method overloading, you create multiple methods with the same name, but they have different parameters (number or type of arguments). The right method is chosen at compile time.

//Compile-time :-  refers to the period during which a program is being compiled, before it is actually run. It is the stage when the source code (written by the programmer) is converted into machine code or bytecode that the computer can execute. In other words, compile-time is when the compiler checks the code for syntax errors, performs optimizations, and translates it into a form that can be executed later.
//Key Points About Compile-time:
// 1. Occurs Before Execution: Compile-time happens before a program is run (i.e., when it's being converted from source code to executable code).
// 2. Syntax and Type Checking: During this time, the compiler checks for errors, such as syntax errors, type mismatches, missing variables, or incorrect function calls.
// 3. Static Behavior: Anything that can be determined by the compiler at this stage is considered to be static (unchanging at runtime). For example, method overloading and variable initialization happen during compile-time.

class Sum{

    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    float sum(float a, float b){
        return a+b;
    }

    double sum(double a, double b , double c, double d){
        return a+b+c+d;
    }

}

//2. Run-time Polymorphism Dynamic Polymorphism (also known as Method Overriding)
// Run-time Polymorphism (also known as Dynamic Polymorphism) refers to the ability of a program to determine at runtime which method to call, even though the method's signature (name and parameters) is already known at compile-time. This is achieved through method overriding in object-oriented programming.

//Key Points About Run-time Polymorphism:
//Method Overriding: In run-time polymorphism, a method in a subclass overrides a method in its superclass. This allows a method to have a different implementation in the subclass.
//Dynamic Binding: The decision of which method to call is made at runtime, based on the actual object type(sub class or super class) that is being referred to, not the reference type.
//Virtual Methods: In languages like Java, all non-static, non-private methods are virtual by default, meaning they can be overridden.

//How Run-time Polymorphism Works:
//Inheritance: The subclass inherits methods from the superclass.
//Method Overriding: The subclass provides its own implementation of a method that is already defined in the superclass.
//Upcasting: The reference type in the parent class can refer to an object of the child class. The actual method that gets executed is based on the type of the object (child class) at runtime.

class Animal2{
    String name;

    //Constructor
    Animal2(String name){
        this.name = name;
    }

    void walk(){
        System.out.println(name + " can run");
    }
}

class Fish2 extends Animal2{

    Fish2(String name){
        super(name); //calling construcor of Animal2
    }

    //Overriding walk method
    void walk(){
        System.out.println(name + " can not walk but swim");
    }
}

//Run time
// Runtime (or Execution time) refers to the period when a program is actually running, after it has been compiled and is being executed by the computer. It is the phase where the program performs its tasks, and the instructions written in the source code are executed by the system.

// Key Points About Runtime:
// 1. Occurs After Compilation: Runtime happens after the program has been compiled into machine code or bytecode, and the program is actively executing on a computer or device.
// 2. Dynamic Behavior: It is during runtime that the program interacts with real-world data (e.g., user input, files, network) and behaves dynamically.
// 3. Memory Allocation: Memory is allocated and deallocated during runtime, and variables are assigned actual values.
// 4. Errors: Runtime errors occur while the program is running, often due to unexpected conditions, such as dividing by zero or accessing a non-existent file.

// What Happens During Runtime:
// 1. Execution of Instructions: The CPU starts executing the compiled program's instructions.
// 2. Input/Output: The program might read input from users or external devices, process it, and then display output.
// 3. Dynamic Memory Allocation: Memory is dynamically allocated and managed (e.g., when you create objects, arrays, etc.).
// 4. Method Dispatch (in Polymorphism): In the case of polymorphism (especially run-time polymorphism), method calls are resolved at runtime. This means the program determines which method to call based on the actual object type.
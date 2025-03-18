
class StaticFunction{
//  3. Static Methods
// ✅ These methods belong to the class rather than an instance.
// ✅ They do not require an object for calling.
// ✅ Used for utility functions like Math.sqrt().

    static int product(int a, int b){ //belong to the class
        return a*b;
    }

    int subtract(int a, int b){  // instances of class
        return  a-b;
    }

}

public class StaticMethod {
    public static void main (String args[]){
        System.out.println("User Defined Method");

        // Calling static method using class name
        int prod = StaticFunction.product(2,4); //No need to create object for static method
        System.out.println("Static Method = " + prod);

        // Calling instance method (requires an object)
        StaticFunction sf = new StaticFunction();
        int sub = sf.subtract(4,1); //Need to create object //instances of class
        System.out.println("none static method = " + sub);

    }
}

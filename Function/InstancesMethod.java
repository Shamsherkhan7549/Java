
class Person{

            //  4. Instance Methods
           // ✅ These methods are called on objects (instances) of a class.
           // ✅ They can access instance variables.

    String name;

    // Constructor (to initialize instance variables)
    Person(String name){
        this.name = name;
    }

    // Instance method  11
    void printName(){
        System.out.println("Name = " + name);
    }

    //static method
//    static void print(){ //static function can not access name of instace or object  of class
//        System.out.println("Static method name = " + name);
//    }
}

public class InstancesMethod {

    //An instance method is a method that operates on an instance (object) of a class. These methods are not static and require an object of the class to be called.
    //Declaration
        public void functionName(){
            System.out.println("This is an Instances Function.");
        };

    public static void main(String args[]){
       InstancesMethod func = new InstancesMethod();
       func.functionName();

       Person person = new Person("shamsher");
        person.printName();



    }
}

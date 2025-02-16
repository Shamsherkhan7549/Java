public class Constructor {

    public  static void main(String [] args){
        System.out.println("Constructor");

        Employee employee1 = new Employee("shamsher"); //initialize object(employee)
        employee1.name = "samar"; //override name
        employee1.phone = 7549;
//        System.out.println(employee1.name);

        //copy constructor
        Employee employee2 = new Employee(employee1);  //shallow copy
        System.out.println(employee2.name);
        employee2.phone = 7658;
        System.out.println(employee2.phone);

    }
}

class Employee{

    //Constructor:- Constructor is a special method which is invoked automatically at time of Object creation.
    // - Constructors have the same name as class or structure.
    // - Constructors don't have a return type ( not even a void ).
    // - Constructors are only called once, at object creation.
    // - Memory allocation happens when constructor is called.

    // Types of constructor
    // 1> Parameterized constructor
    // 2> Non-Parameterized constructor
    // 3> Copy constructor

    String name;
    int phone;
    int rating;
    //Constructor
    // 1> Parameterized Constructor
    Employee(String name){

        this.name = name;
        System.out.println("constructor called");
    }

    // 2>Non-Parameterized Constructor
    Employee(){
        System.out.println("constructor called");
    }

    // 3> Copy constructor or shallow copy constructor
    Employee(Employee employee1){
        this.name = employee1.name;
    }

    //Destructor or garbage collector
    //A destructor is a special method in object-oriented programming that is automatically invoked when an object is about to be destroyed. It is primarily used to free resources such as memory, file handles, or database connections that were allocated during the object's lifetime.
}

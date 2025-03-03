public class Abstraction {
    public static void main(String[]args){
       Deer deer = new Deer();
       deer.walk();
       deer.eat();
        System.out.println(deer.color);
        deer.changeColor();
        System.out.println(deer.color);

       Chicken chicken = new Chicken();
       chicken.walk();
       chicken.eat();

      // Mammal mammal = new Mammal(); // We cannot create object of an abstract class

    }

}

// Hiding all the unnecessary Details and showing only the important part to the user
//-> Abstraction classes
//-> Interfaces

// Abstract Class
// -> Cannot create an instance of abstract class
// -> Can have abstraction/non-abstract methods
// -> Can have constructors

abstract class Mammal{
    String color;
    Mammal(){
        color = "Brown";
    }
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
}

class Deer extends Mammal{
    void changeColor(){
        color = "red";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Chicken extends Mammal{
    void changeColor(){
        color = "white";
    }

    void walk(){
        System.out.println("walk on 2 legs");
    }
}

// Interfaces:- Interface is a blueprint of a class




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

        Queens queen = new Queens();
        queen.moves();

        Bear bear = new Bear();
        bear.eatMeat();
        bear.eatPlant();
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
// -> All methods are public, abstract & without implementation
// -> Used to achieve total abstraction
// -> Variables in the interface are final, public and static

interface ChessPlayer{
    void moves();
}

class Queens implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal - (in all direction)");
    }

}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal - (one step)");
    }
}

//Multiple inheritance

interface  Carnivore{
    void eatMeat();
}

interface  Herbivore{
    void eatPlant();
}

class Bear implements Carnivore, Herbivore{
    public void eatMeat(){
        System.out.println("Bear eats fish");
    }

    public void eatPlant(){
        System.out.println("Beer eats plants");
    }
}


public class Inheritence {

    public  static void main(String[] args){
        //OOPS
        System.out.println("Inheritance");
        // Inheritance
        // Inheritance is a fundamental concept in Object-Oriented Programming (OOP) that allows a class (child class) to derive properties and behaviors from another class (parent class). It helps in code reusability and establishes a relationship between classes.
        // Types of Inheritance 1> Sigle level inheritance  2> Multiple Inheritance 3> Multilevel Inheritance 4> Hierarchical Inheritance 5> Hybrid Inheritance

        // 1> Single Level Inheritance
        Fish fish = new Fish();
        fish.name = "fish";
        fish.eat();
        fish.breath();
        fish.swim();

        Animal cat = new Animal();
        cat.name = "cat";
        cat.breath();
        cat.eat();

        //2> Multilevel Inheritance
        Monkey monkey = new Monkey();
        monkey.name = "hero";
        monkey.legsCount(2);
        monkey.handsCount(2);
        System.out.println("Monkeys have " + monkey.legs + " legs  and " + monkey.hands + " hands");
        monkey.jump();

        // 3> Multiple Inheritance
        Child child = new Child();
//        child.name = "rocky"; // cannot assign value  finale variable name is name
        child.show();
        child.display();

    }
}

//Base class or Parent class
class Animal{
    String name;

    void eat(){
        System.out.println(name + " can eat");
    }

    void breath(){
        System.out.println(name + " can breath");
    }

}

//Derived class or Child class
class Fish extends  Animal{
    // Single Level Inheritance :- One class inherits from another.
    // Base class -----> Derived class
    void swim(){
        System.out.println(name + " can swim");
    }
}

class Men extends Animal{
    int legs;
    int hands;
    void legsCount(int legs){
        this.legs = legs;
    }

    void handsCount(int hands){
        this.hands = hands;
    }
}

class Monkey extends Men{
    //2> Multilevel Inheritance :- A child class inherits from a parent class, which itself is inherited from another class.
    // Base class ----> Derived class ----> derived class
    void jump(){
        System.out.println( name +  " can jump");
    }
}

//Multiple Inheritance : - Java does not allow multiple class inheritance so  we use interface at class place
interface Parent1{
//    String name; //Interface can not  have uninitialized variables and methods
//    void show(){
//        System.out.println("Parent1 class");
//    }

    String name = "tommy"; // Interface variable must be initialized and variable is  public , static and final by default
    void show(); //Abstract method
};

interface Parent2{
//    String breed;  // interface cannot have instance variable and method
//    void dishplay(){
//        System.out.println("Parent2 class");
//    }

    String breed = "labrador";
    void display(); //Abstract mehtod
}

class Child implements Parent1, Parent2{
    public void show(){
        System.out.println("Parent 1 " + name);

    }

    public void display(){
        System.out.println("Parent 2 " + breed);
    }
}

// 4. Hierarchical Inheritance – Multiple child classes inherit from a single parent class.
    // :- Base class ---> Derived class, Base class ---> Derived class

// 5. Hybrid Inheritance – A mix of two or more types of inheritance.
     // :- Its  is combination of tow or more inheritance
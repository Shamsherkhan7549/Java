public class ClassObject {

        // class :- group of the the real world entities
        // Class :– A blueprint for creating objects (e.g., Car class). It defined attributes or varables or properties and method or behaviours or funtion

        // objects :- entities in the real world
        //Object :– An instance of a class (e.g., myCar is an object of the Car class).It represents a real-world entity with properties and behaviors.

    public static void main (String[] args){
        //OOPS
        System.out.println("Class and Object");

        Pen pen = new Pen(); //creating an object is pen
        pen.pen("green",6);

        System.out.println(pen.penTip(3));
        System.out.println(pen.penColor("yellow"));

        // float f = 3.23; // compile time error
       
    }
};

//defining a class
class Pen{

//    properties or attributes
    String color = "red";
    int tip = 5;

    //constructor
//    Pen(String color, int tip){
//        this.color = color;
//        this.tip = tip;
//
//    }

    //methods or function or behaviours
    void pen(String color, int tip){
        System.out.println("Pen color is " + color + " tip size is " + tip + ".") ;
    }

    String penColor(String color){
        return  ("Pen color is " + color);
    }

    int penTip(int tip){
        return tip;
    }
}

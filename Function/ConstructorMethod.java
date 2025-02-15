import java.sql.SQLOutput;

class Car{
    String name;

    Car(String name){
        this.name = name;
    }

    String showBrand(){
        return ("Car Brand : " + name);
    }
}

public class ConstructorMethod {
    public  static  void main (String[] args){
        System.out.println("It is a Constructor Method");

        Car car = new Car("TATA MOTORS"); //Car is class but car is an object;
        System.out.println(car.showBrand());
    }
}

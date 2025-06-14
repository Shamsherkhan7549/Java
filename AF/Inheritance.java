
class Vehicle{

	String model;

	Vehicle(String model){

		this.model = model;
		System.out.println("Vehicle model is " + model);
	}

	void startEngine(){
		System.out.println("Vehicle engine started.");
	}
}

class Car extends Vehicle{
	
	Car(){
		super("Tata");
		System.out.println("This is Mahindra car");
	}

	public void startEngine(){
		super.startEngine();
		System.out.println("Car engine started.");
	}

	void playMusic(){
		System.out.println("Playing music in the car.");
	}

}


public class Inheritance{
	public static void main(String[] str){
	
	Car car = new Car();
	
	car.startEngine();
	car.playMusic();
	
}
}
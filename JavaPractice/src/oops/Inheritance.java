package oops;

class Vehicle{
	private String brand;
	
	
	public Vehicle(String brand) {
		this.brand=brand;
	}
	
	public void start() {
		System.out.println("Start the Vehicle");
	}
	public String getBrand() {
		return brand;
	}
	public void stop() {
		System.out.println("Stop the Vehicle");
	}
	public void abc() {
		System.out.println("This is Method overriding example");
	}

}
class Car extends Vehicle{
	
	private int numOfdoor;
	public Car(String brand, int numOfdoor) {
		super(brand);
		this.numOfdoor=numOfdoor;
	
	}

	public void driver() {
		
		System.out.println("This is car class" + getBrand());
	}
	public void abc() {
		super.abc();
		System.out.println("This is overriden method");;;;;;
	}
	
}
class Bycycle extends Vehicle{
	
	public Bycycle(String brand) {
		super(brand);
		
		
	}

	public void pidal() {
		System.out.println("this is Bycycle class" + getBrand());
	}
}
public class Inheritance {

	public static void main(String args[]) {
		
		Car car=new Car("BMW", 4);
		car.start();
		car.driver();
		System.out.println(car.getBrand());
		car.stop();
		
		Bycycle b=new Bycycle("Mercedes");
		
	    b.pidal();
	    b.start();
	    b.stop();
	    car.abc();
		
	    
	    
	}

}

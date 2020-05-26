package OOP_Inheritance;

public class Car extends Vehicle{

	public void start() {
		System.out.println("car -- start");
	}

	public void stop() {
		System.out.println("car -- stop");

	}

	public void refuel() {
		System.out.println("car -- refuel");

	}
	
	private String carName(String name){
		System.out.println("car name "+ name);
		return  "Car Name";
	}

}

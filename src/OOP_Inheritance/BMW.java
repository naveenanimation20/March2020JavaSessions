package OOP_Inheritance;

public class BMW extends Car {

	//Method Overriding --> when we have a method in parent class and the same method in child class with the same name and
	//same number of args....
	//run time poly+morphism
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}

	public void autoParking() {
		System.out.println("BMW -- autoParking");

	}
	
	private String carName(String name){
		return "car name: "+ name;
	}
	
	public String getCarName(String name){
		return carName(name);
	}

}

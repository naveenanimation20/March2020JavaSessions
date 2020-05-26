package AccessModifiers1;

public class Car {

	public String name = "BMW";
	private int price = 30;
	protected String engine = "petrol";
	int wheels = 4;

	public void getName() {
		System.out.println("get name car");
	}

	private void getprice() {
		System.out.println("get price car");
	}

	protected void getEngine() {
		System.out.println("get engine car");
	}

	void getWheels() {
		System.out.println("get wheels car");
	}
	
	public static void main(String ar[]){
		Car c = new Car();
		System.out.println(c.engine);
		c.getEngine();
	}

}

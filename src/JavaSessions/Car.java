package JavaSessions;

public class Car {

	String name;
	String color;
	int price;
	String model;

	static final int wheels = 4;

	public static void main(String ar[]) {

		Car c1 = new Car();
		c1.name = "Audi";
		c1.color = "Red";
		c1.price = 75;
		c1.model = "Q5";

		Car c2 = new Car();
		c2.name = "BMW";
		c2.color = "Blue";
		c2.price = 80;
		c2.model = "520d";

		System.out.println(c1.name + " " + c1.color);
		System.out.println(Car.wheels);

	}

}

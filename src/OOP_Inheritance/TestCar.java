package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.autoParking();
		b.engine();
		System.out.println(b.getCarName("520d"));
		
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		Audi au = new Audi();
		au.start();
		au.stop();
		au.refuel();
		
		//top casting:
		Car c1 = new BMW();//child class object can be referred by parent class ref variable
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		
		
		//down casting: is not allowed in java at the run time
		BMW b1 = (BMW) new Car();//ClassCastException - Car cannot be cast to BMW
		
		
	}

}

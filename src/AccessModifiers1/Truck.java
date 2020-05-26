package AccessModifiers1;

public class Truck {
	
	public Truck(){
		System.out.println("default");
		new Truck(10);
	}
	
	private Truck(int a){
		System.out.println(" 1 param" + a);
	}

	public static void main(String[] args) {

		Truck  t1 = new Truck(1);
	}

}

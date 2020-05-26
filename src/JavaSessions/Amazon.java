package JavaSessions;

public class Amazon {

	// Method Overloading (compile Time Poly+Morphism):
	// with in the same class:
	// 1. same method name
	// 2. different types of params / different numbers of params
	// 3. sequence of params
	
	//main method can be overloaded but main() signature should not be changed for JVM
	//static methods can be overloaded

	public void search() { // 0 param
		System.out.println("0 param search");
	}

	public void search(String name) { // 1 param
		System.out.println("1 param search " + name);

	}

	public void search(int price) { // 1 param
		System.out.println("1 param search " + price);

	}

	public void search(String name, int price) { // 2 params
		System.out.println("2 params search " + name + " " + price);

	}

	public void search(int price, String name) { // 2 params
		System.out.println("2 params search " + name + " " + price);

	}

	public static void main(String[] args) {

		Amazon am = new Amazon();
		am.search();
		am.search(1000);
		am.search("Nike");
		am.search("Macbook", 1000);

	}

}

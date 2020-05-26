package JavaSessions;

public class MainMethodOverloading {

	public static void main(String a[]) {
		System.out.println("hii");
		main(10);
		main("naveen");
	}

	public static void main(int i) {
		System.out.println("hello" + i);

	}

	public static void main(String name) {
		System.out.println("bye" + name);

	}

}

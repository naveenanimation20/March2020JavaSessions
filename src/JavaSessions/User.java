package JavaSessions;

import java.util.ArrayList;

public class User {

	String name;
	int age;
	String email;
	boolean isActive;
	char gender;
	long phone;
	ArrayList<String> paymentOptions;

	// 1. not a function
	// 2. same name as the class name
	// 3. no void and no return type
	// 4. Const... overloading is possible

	public User() { // 0 param
		System.out.println("default const....");
	}

	public User(int i) { // 1 param
		System.out.println("1 param " + i);
	}

	public User(int i, String p) { // 2 params
		System.out.println("2 params " + i + p);
	}

	// user class const.. with limited class vars:
	public User(String name, int age, String email, boolean isActive) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.isActive = isActive;
	}

	public User(String name, String email, long phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	// user class const... with all class vars:
	public User(String name, int age, String email, boolean isActive, char gender, long phone,
			ArrayList<String> paymentOptions) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.isActive = isActive;
		this.gender = gender;
		this.phone = phone;
		this.paymentOptions = paymentOptions;
	}

	public static void main(String[] args) {

		User u1 = new User("Tom", 25, "tom@gmail.com", true);
		User u2 = new User("Ali", 24, "ali@gmail.com", false);

		ArrayList<String> WalletList = new ArrayList<String>();
		WalletList.add("GPay");
		WalletList.add("PhonePe");
		
		User u3 = new User("Deep", 26, "deep@gmail.com", true, 'm', 99999, WalletList);

		System.out.println(u3.name + " " + u3.email + " " + u3.age + " " + u3.paymentOptions);

		User u4 = new User("naveen", "naveen@gmail.com", 98989);

	}

}

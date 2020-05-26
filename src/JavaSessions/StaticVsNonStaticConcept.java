package JavaSessions;

public class StaticVsNonStaticConcept {

	String name;
	static int age;

	public void getName() {
		System.out.println("get name");
	}

	public static void getEmail() {
		System.out.println("get email");
	}

	public static void main(String[] args) {
		
		//1. how to access non static stuff: create the object
		StaticVsNonStaticConcept obj = new StaticVsNonStaticConcept();
		obj.name = "Tom";
		System.out.println(obj.name);
		obj.getName();
		obj.age = 45;
		obj.getEmail();
		
		//2. how to access static stuff:
		//a. call them directly
		getEmail();
		age = 20;
		System.out.println(age);
		
		//b. call them by class name:
		StaticVsNonStaticConcept.age = 30;
		System.out.println(age);
		StaticVsNonStaticConcept.getEmail();
		

	}

}

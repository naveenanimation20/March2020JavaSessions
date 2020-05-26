package OOP_Abstract;

public abstract class Page {

	public Page() {
		System.out.println("Page -- default const....");
	}

	// can not create the object of abstract class but can create the
	// constructor
	// page abstract class const.. will be called when you create the object of
	// child class

	// can have abstract methods and non abstract methods also

	public abstract void header();

	public abstract void title();

	public static void getPageInfo() {
		System.out.println("Page -- getPage Info");
	}

	public final void logo() {
		System.out.println("Page -- logo");

	}

}

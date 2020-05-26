package OOP_Interface;

public interface USMedical {

	static final int min_fee = 10;
	// vars are static and final by default

	// only method declaration
	// no method body -- only method prototype
	// abstract methods -- but can not be static
	// can not create the object of Interface

	public void orthoServices();

	public void cardioServices();

	public void neuroServices();

	public void Services911();

	// after jdk1.8:

	// 1. can define static methods with method body:
	public static void medicine() {
		System.out.println("USMedical -- medicine");
	}

	// 2. default method in Interface:
	default void nursing() {
		System.out.println("USMedical -- nursing");

	}

}

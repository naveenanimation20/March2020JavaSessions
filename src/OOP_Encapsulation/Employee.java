package OOP_Encapsulation;

public class Employee {

	public String name;
	public int age;
	private int salary;

	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public void getAddress() {
		System.out.println("employee address");
	}

	private void getBankAccount() {
		System.out.println("employee bank detais....");
	}
	
	public void getEmployeeBankData(){
		getBankAccount();
	}
	
	public int getSalary(){
		return salary;
	}
	
	public static void main(String[] args) {

		Employee e1 = new Employee("Tom", 25, 1000);
		
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.salary);
		
		
		
	}

}

package OOP_Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e1 = new Employee("Tom", 25, 1000);
		
		System.out.println(e1.name);
		System.out.println(e1.age);
		
		System.out.println(e1.getSalary());
		
		e1.getAddress();
		
		e1.getEmployeeBankData();
		
	}

}

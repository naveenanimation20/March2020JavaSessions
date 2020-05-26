package JavaSessions;

import java.util.ArrayList;

public class Employee {
	
	String name;
	int age;
	String deptName;
	boolean isPermanent;
	String laptop[];
	ArrayList<String> devicesList;
	double exp;

	public static void main(String[] args) {
		
		int age = 30;

		Employee emp = new Employee();
		emp.name = "Tom";
		emp.age = 25;
		emp.deptName = "admin";
		emp.isPermanent = true;
		emp.laptop = new String[3];
		emp.laptop[0]="Apple";
		emp.laptop[0]="windows";
		
		emp.devicesList = new ArrayList<String>();
		
		emp.devicesList.add("Apple iPhone");
		emp.devicesList.add("Samsung s8");
		emp.devicesList.add("Windows 10");

		System.out.println(emp.devicesList);
		System.out.println(emp.laptop.length);
		
		Employee emp1 = new Employee();
		emp1.name = "Arif";
		emp1.age = 26;
		emp1.deptName = "QA";
		emp1.isPermanent = false;
		
		System.out.println(emp.name + " " + emp.age + " " + emp.deptName + " " + emp.isPermanent);
		System.out.println(emp1.name + " " + emp1.age + " " + emp1.deptName + " " + emp1.isPermanent);

//		new Employee().name = "Puja";
//		
//		System.gc();
		
		Employee emp3 = new Employee();
		System.out.println(emp3.name);
		System.out.println(emp3.age);
		System.out.println(emp3.isPermanent);
		System.out.println(emp3.devicesList);
		System.out.println(emp3.exp);
		
		
	}

}

package JavaSessions;

import java.util.ArrayList;

public class FunctionsInJava {
	String name;

	// data members of a class:
	// 1. class vars
	// 2. class methods

	// can not create a method inside a method
	// methods are independent with each other
	// methods are parallel to each other
	// u can give any method name

	public static void main(String[] args) {

		FunctionsInJava obj = new FunctionsInJava();
		obj.test();

		String n1 = obj.getTrainerName();
		System.out.println(n1);

		int n2 = obj.getScore();
		System.out.println(n2);

		int n3 = obj.add(10, 20);
		System.out.println(n3 + 100);

		int n4 = obj.add(40, 50);
		System.out.println(n4);

		int m1 = obj.getMarks("Tom");
		System.out.println(m1);

		String c1 = obj.getCapitalName("Germany");
		System.out.println(c1);

		String d1 = obj.launchBrowser("Opera");
		System.out.println(d1);
		
		ArrayList<String> ar1 = obj.getPageLinks("Reg");
		System.out.println("total links on page : " + ar1.size());
		System.out.println(ar1);
		
	}

	// 1. simple -> no input and no output
	// void -- does not return anything
	public void test() {
		System.out.println("test method");
	}

	// 2. return type --> no input but some return
	public String getTrainerName() {
		System.out.println("getTrainerName");
		String name = "Naveen";
		return name;
	}

	public int getScore() {
		System.out.println("get score");
		int p1 = 20;
		int p2 = 30;
		int total = p1 + p2;
		return total;
	}

	// 3. return type--> some input and some output
	public int add(int a, int b) {
		System.out.println("add method");
		int z = a + b;
		return z;
	}

	public int getMarks(String studentName) {

		System.out.println("getMarks for " + studentName);
		int marks = -1;

		if (studentName.equals("Anu")) {
			marks = 90;
		} else if (studentName.equals("Virendra")) {
			marks = 98;

		} else if (studentName.equals("Naveen")) {
			marks = 10;

		} else if (studentName.equals("Puja")) {
			marks = 0;
		} else {
			System.out.println(studentName + " is not found....");
		}

		return marks;

	}

	public String getCapitalName(String country) {

		System.out.println("Capital name for : " + country);
		String capital = null;

		if (country.equals("India")) {
			capital = "New Delhi";
		} else if (country.equals("USA")) {
			capital = "DC";
		} else if (country.equals("Russia")) {
			capital = "Moscow";
		} else if (country.equals("France")) {
			capital = "Paris";
		} else {
			System.out.println(country + " is not found....");
		}

		return capital;

	}

	public String launchBrowser(String browserName) {

		System.out.println("browser name is : " + browserName);
		String driver = null;

		switch (browserName) {
		case "Chrome":
			driver = "launch Chrome";
			break;
		case "Firefox":
			driver = "launch Firefox";
			break;
		case "Safari":
			driver = "launch Safari";
			break;
		case "IE":
			driver = "launch IE";
			break;

		default:
			break;
		}

		return driver;

	}

	// one param -- String --> page name
	// return --> a list of all the links on the page

	public ArrayList<String> getPageLinks(String pageName) {

		System.out.println("links on this page : " + pageName);
		ArrayList<String> linksList = new ArrayList<String>();

		if (pageName.equals("Login")) {
			linksList.add("Forgot pwd");
			linksList.add("sign up");
			linksList.add("reset pwd");
		}

		else if (pageName.equals("Home")) {
			linksList.add("cart");
			linksList.add("search");
			linksList.add("profile");
		}

		else if (pageName.equals("Account")) {
			linksList.add("order");
			linksList.add("profile");
			linksList.add("card details");
		}

		else {
			System.out.println(pageName + " is not found.....");
		}

		return linksList;

	}

}

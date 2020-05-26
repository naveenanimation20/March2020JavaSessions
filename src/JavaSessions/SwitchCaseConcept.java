package JavaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		String browser = "chrome";

		switch (browser) {
		
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "ie":
			System.out.println("launch ie");
			break;

		default:
			System.out.println("you are passing browser:" + browser +" Please pass the correct browser name");
			break;
		}
		
		
		int marks = 50;
		
		switch (marks) {
		case 100:
			System.out.println("Excellent");
			break;
		case 90:
			System.out.println("GRADE A");
			break;

		default:
			System.out.println("FAILURE");
			break;
		}

	}

}

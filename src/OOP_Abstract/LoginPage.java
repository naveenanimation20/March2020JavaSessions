package OOP_Abstract;

public class LoginPage extends Page {
	
	public LoginPage(){
		System.out.println("LP -- default const....");
	}

	@Override
	public void header() {
		System.out.println("Amazon Login page Header");
	}

	@Override
	public void title() {
		System.out.println("Amazon Login Page title");
	}

	public void doLogin(String un, String pwd) {
		System.out.println("login with : " + un + " " + pwd);
	}
	
	
	public static void getPageInfo() {
		System.out.println("Login Page -- getPage Info");
	}

}

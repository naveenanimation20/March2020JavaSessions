package JavaSessions;

public class Credentials {

	String username;
	String password;

	//set the values
	public Credentials(String username, String password) {
		this.username = username;
		this.password = password;
	}

	//getters:
	public String getUserName() {
		return this.username;
	}

	public String getPassword() {
		return this.password;
	}
	
	public void doLogin(String un, String pwd){
		System.out.println("logged in with : " + un + " " + pwd);
	}

}

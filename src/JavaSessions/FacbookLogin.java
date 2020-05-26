package JavaSessions;

public class FacbookLogin {

	public static void main(String[] args) {

		Credentials cred = new Credentials("naveen@gmail.com", "naveen123");
		Credentials seller = new Credentials("ali@gmail.com", "ali123");
		Credentials vendor = new Credentials("rahul@gmail.com", "rahul123");

		
//		System.out.println(cred.getUserName());
//		System.out.println(cred.getPassword());
		
		cred.doLogin(cred.getUserName(), cred.getPassword());
		seller.doLogin(seller.getUserName(), seller.getPassword());
		vendor.doLogin(vendor.getUserName(), vendor.getPassword());

	}

}

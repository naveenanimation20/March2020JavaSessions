package ExceptionHandling;

public class Throw {

	public static void main(String[] args) {

		String browser = "chrome";

		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		} 
		else if (browser.equals("firefox")) {
			System.out.println("launch firefox");

		} else if (browser.equals("safari")) {
			System.out.println("launch safari");

		} else {
			try {
				throw new Exception("Please pass the correct browser");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		String userName = null;
		if(userName!=null){
			System.out.println("please login with this user: "+ userName);
		}
		else{
			try {
				throw new Exception("DATANOTFOUNDEXCEPTION");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

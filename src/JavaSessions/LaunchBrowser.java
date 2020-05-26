package JavaSessions;

/**
 * 
 * @author NaveenKhunteta
 *
 */
public class LaunchBrowser {

	public static void main(String[] args) {

		String browser = "ie";
		
		if(browser.equals("chrome")){
			System.out.println("launch chrome");
		}
		else if(browser.equals("firefox")){
			System.out.println("launch firefox");
		}
		else if(browser.equals("safari")){
			System.out.println("launch safari");
		}
		else if(browser.equals("ie")){
			System.out.println("launch IE");
		}
		else{
			System.out.println("you are passing browser:" + browser +" Please pass the correct browser name");
		}
		
		//case2:only IFs
		if(browser.equals("chrome")){
			System.out.println("launch chrome");
		}
		 if(browser.equals("firefox")){
			System.out.println("launch firefox");
		}
		 if(browser.equals("safari")){
			System.out.println("launch safari");
		}
		 if(browser.equals("ie")){
			System.out.println("launch IE");
		}
		
		
		
		
	}

}

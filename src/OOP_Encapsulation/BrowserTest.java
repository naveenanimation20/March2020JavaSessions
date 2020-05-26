package OOP_Encapsulation;

public class BrowserTest {

	public static void main(String[] args) {

		
		Browser br = new Browser();
		
		br.launchBrowser();
		
		br.setPlugin("IDE");
		System.out.println(br.getPlugin());
		
		
	}

}

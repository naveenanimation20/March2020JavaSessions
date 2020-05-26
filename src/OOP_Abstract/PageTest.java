package OOP_Abstract;

public class PageTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		lp.header();
		lp.title();
		lp.getPageInfo();
		lp.doLogin("admin", "admin");
		
		//top casting:
		Page p = new LoginPage();
		p.header();
		p.title();
		p.getPageInfo();
		
		
		
		
		
		
	}

}

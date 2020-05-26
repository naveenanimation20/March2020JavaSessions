package JavaSessions;

import java.util.ArrayList;

public class PageTest {

	public static void main(String[] args) {

		Page loginPage = new Page();
		
		loginPage.url = "http://amazon.com/login";
		loginPage.title = "Amazon Login";
		loginPage.logo = "Amazon Logo";
		loginPage.header = "Login Header";
		loginPage.footerLinksList = new ArrayList<String>();
		loginPage.footerLinksList.add("privacy policy");
		loginPage.footerLinksList.add("contact us");
		loginPage.footerLinksList.add("terms");
		
		
		Page HomePage = new Page();
		
		HomePage.url = "http://amazon.com/home";
		HomePage.title = "Amazon home page";
		HomePage.logo = "Amazon Logo";
		//HomePage.header = "home Header";
//		HomePage.footerLinksList = new ArrayList<String>();
//		HomePage.footerLinksList.add("privacy policy");
//		HomePage.footerLinksList.add("contact us");
//		HomePage.footerLinksList.add("terms");
		
		System.out.println(loginPage.url);
		System.out.println(loginPage.title);
		System.out.println(loginPage.footerLinksList);
		
		System.out.println(HomePage.url);
		System.out.println(HomePage.header);
		System.out.println(HomePage.footerLinksList);
		
	}

}

package JavaSessions;

import java.util.ArrayList;

public class WebPageTesting {

	public static void main(String[] args) {

		ArrayList<String> linksList = new ArrayList<String>();
		linksList.add("forgot pwd");
		linksList.add("reset pwd");
		linksList.add("signup");

		ArrayList<String> homeLinksList = new ArrayList<String>();

		WebPage loginPage = new WebPage("login", "http://www.amazon.com/login", linksList);
		WebPage homePage = new WebPage("home", "http://www.amazon.com/home", homeLinksList);

		System.out.println(loginPage.title + " " + loginPage.url + " " + loginPage.linksList + " " + WebPage.logo);
		System.out.println(homePage.title + " " + homePage.url + " " + homePage.linksList + " " + WebPage.logo);

	}

}

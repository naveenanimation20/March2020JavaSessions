package AbstractVsInterface;

public class FirefoxDriver implements WebDriver {
	
	public FirefoxDriver() {
		System.out.println("Launching firefox");
	}

	@Override
	public void get(String url) {
		System.out.println("launch " + url);
	}

	@Override
	public void close() {
		System.out.println("close the browser");
	}

	@Override
	public void getTitle() {
		System.out.println("get the Title");

	}

	@Override
	public void getCurrentUrl() {
		System.out.println("getCurrentUrl");

	}

	@Override
	public void findElement(String element) {
		System.out.println("find the element " + element);
	}

}

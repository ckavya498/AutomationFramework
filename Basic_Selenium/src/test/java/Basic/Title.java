package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//Title
		String title = driver.getTitle();
		System.out.println("Title is=" + title);
		//current URL
		String url = driver.getCurrentUrl();
		System.out.println("Current URL is=" + url);
		driver.close();
	}

}

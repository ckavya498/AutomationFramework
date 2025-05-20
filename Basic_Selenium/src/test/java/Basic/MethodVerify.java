package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class MethodVerify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println("Title is" + title);
		//if(title.contains("Face")) {
		if(title.equals("Facebook - log in or sign up")) {
		//if(title.equalsIgnoreCase("Facebook - log in or sign up")) {
			System.out.println("Facebook application is displayed");
		}
		else {
			System.out.println("Facebook application is not displayed");
		}
		driver.close();
	}

}

package POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		facebook_class facebook = new facebook_class(driver);
		facebook.enteremail("admin");
		facebook.enterPassword("abcd@123");
		facebook.clickOnLoginButton();
	}

}

package POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_HiddenFindByTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		POM_HiddenFindBy p = new POM_HiddenFindBy(driver);
		p.enteremail("admin");
		p.enterPassword("abcd@123");
		p.clickOnLoginButton();
		p.error();
	}

}

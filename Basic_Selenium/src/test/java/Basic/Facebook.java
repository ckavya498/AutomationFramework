package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	//WATS to enter email and password in facebook app 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//username
		By m = By.id("email");
		driver.findElement(m).sendKeys("admin");
		//pwd
		By p = By.id("pass");
		driver.findElement(p).sendKeys("admin@123");

	}
}

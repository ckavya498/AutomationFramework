package XpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathAttribute {

	//WATS to enter Email & Password in facebook app using xpathByAttribute
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//email
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz");
		//pwd
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("admin");

	}

}

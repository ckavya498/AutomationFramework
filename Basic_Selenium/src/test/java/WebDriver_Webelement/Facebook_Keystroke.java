package WebDriver_Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Keystroke {
	
	//WATS to click on login button in facebook app without using click method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("xyz@1");
		driver.findElement(By.xpath("//button[@name='login']")).sendKeys(Keys.ENTER);

	}

}

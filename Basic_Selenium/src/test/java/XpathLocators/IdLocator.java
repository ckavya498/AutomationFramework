package XpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("xyz@123");
		driver.findElement(By.xpath("//button[@id='u_0_5_4U']")).click();

	}

}

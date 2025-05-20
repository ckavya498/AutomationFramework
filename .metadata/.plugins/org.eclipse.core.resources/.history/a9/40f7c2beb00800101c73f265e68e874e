package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91812/Desktop/HTML/JavaSelenium/Webpage_2.html");
		driver.findElement(By.id("user")).sendKeys("admin");
		//driver.switchTo().frame(0);
		WebElement frame = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("pass")).sendKeys("abc");
		driver.findElement(By.id("email")).sendKeys("xyz@123");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("number")).sendKeys("64685458");
	}

}

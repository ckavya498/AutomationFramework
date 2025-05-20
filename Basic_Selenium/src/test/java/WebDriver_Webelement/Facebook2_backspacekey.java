package WebDriver_Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2_backspacekey {
	
	//WATS to enter text in FIRSTNAME field and remove the text using inly BACKSPACE 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).sendKeys(Keys.ENTER);
		WebElement e = driver.findElement(By.xpath("//input[@name='firstname']"));
		e.sendKeys("admin");
		e.sendKeys(Keys.CONTROL+"a");
		e.sendKeys(Keys.BACK_SPACE);
	

	}

}

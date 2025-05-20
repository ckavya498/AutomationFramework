package WebDriver_Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Tab {
	
	/*WATS to perform following action in facebook app:
1: Enter text in email field
2: Copy that text and paste it in pwd field(without inspecting pwd)*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement e1= driver.findElement(By.xpath("//input[@id='email']"));
		e1.sendKeys("admin");
		e1.sendKeys(Keys.CONTROL+"a");
		e1.sendKeys(Keys.CONTROL+"c");
		//e1.sendKeys(Keys.TAB, Keys.CONTROL+"v");
		
		e1.sendKeys(Keys.TAB+""+Keys.CONTROL+"v");

	}

}

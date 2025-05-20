package WebDriver_Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_Dependent {

//WATS to identify one plus mobile price in amazon.in 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 13r");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text(),'OnePlus 13R | Smarter with OnePlus AI (12GB RAM, 256GB Storage Astral Trail)']/../../../..//span[@class='a-price'] "));
        System.out.println(ele.getText());
	}

}

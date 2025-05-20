package WebDriver_Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathIndependent {

//WATS to display REDMI 9 Activ (Coral Green, 128 GB) Mobile Rating as an output in flipkart App 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.flipkart.com"); 
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("REDMI 9 Activ (Coral Green, 128 GB)"); 
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click(); 
		WebElement ele = driver.findElement(By.xpath("//div[@class='KzDlHZ']/..//span[contains(text(),'Ratings')]")); 
		System.out.println(ele.getText());
	}

}

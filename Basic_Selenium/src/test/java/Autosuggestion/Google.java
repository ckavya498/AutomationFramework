package Autosuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {
	
//WATS to select any one of the autosuggestion option in google Webpage

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='G43f7e']/li[2]")).click();
	}

}

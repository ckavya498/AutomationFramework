package Assignment_Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Puma_class {

// WATS to enter PUMA in search field and click on "puma jacket" Autosuggestion in http://Amazon.in application
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Puma J");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='sac-suggestion-row-2']/div[1]")).click();
		}
		
	}



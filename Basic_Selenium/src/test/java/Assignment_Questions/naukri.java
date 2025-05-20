package Assignment_Questions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class naukri {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.naukri.com");
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		driver.findElement(By.className("acceptance-btn-text")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='social-media']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement emailField = driver.findElement(By.id("identifierId"));
        emailField.sendKeys("your-email@gmail.com");
            emailField.submit();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
            nextButton.click();
             driver.close();

	}

}

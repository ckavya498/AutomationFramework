package JavaScript_Executor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_loginfB {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//button[contains(@id,'u_0_5')]"));
		File src = ele.getScreenshotAs(OutputType.FILE);
		File dest = new File("../Basic_Selenium/Screenshot/Login.png");
		FileUtils.copyFile(src, dest); 
	}

}

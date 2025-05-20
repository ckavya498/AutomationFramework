package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextLocator {

	
	//WATS to display https://www.actitime.com/free-online-trial "start 30 day trial" text as an output
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/free-online-trial ");
		
	WebElement text = driver.findElement(By.className("start-trial__title"));
	String str = text.getText();
	System.out.println(str);
		}
}

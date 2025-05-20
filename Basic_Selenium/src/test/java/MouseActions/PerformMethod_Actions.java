package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformMethod_Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www2.fatcow.com/");
		Actions a = new Actions(driver);
		WebElement ele = driver.findElement(By.linkText("Around the Farm"));
		a.moveToElement(ele).perform();
		driver.findElement(By.linkText("About FatCow")).click();
	}

}

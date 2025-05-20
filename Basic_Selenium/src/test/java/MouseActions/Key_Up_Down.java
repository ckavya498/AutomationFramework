package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key_Up_Down {
	
//WATS to display firstname using keyup and keydown in facebook app 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
        Actions a = new Actions(driver);
        driver.findElement(By.linkText("Create new account")).click();
        WebElement ele = driver.findElement(By.name("firstname"));
        a.keyDown(Keys.SHIFT).perform();
        a.sendKeys(ele,"K").perform();
        a.keyUp(Keys.SHIFT).perform();
        a.sendKeys(ele,"a").perform();
        a.keyDown(Keys.SHIFT).perform();
        a.sendKeys(ele,"v").perform();
        a.keyUp(Keys.SHIFT).perform();
        a.sendKeys(ele,"y").perform();
        a.keyDown(Keys.SHIFT).perform();
        a.sendKeys(ele,"a").perform();
	}

}

package MouseActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick_Actions {

	public static void main(String[] args) throws AWTException{
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www2.fatcow.com/");
		Actions a = new Actions(driver);
		WebElement ele = driver.findElement(By.linkText("MarketPlace"));
        a.moveToElement(ele).perform();
        a.contextClick().perform();
        //select option in context menu
        Robot r = new Robot();
        r.keyPress(KeyEvent. VK_DOWN);
        r.keyPress(KeyEvent. VK_DOWN);
        r.keyPress(KeyEvent. VK_ENTER);
	}

}

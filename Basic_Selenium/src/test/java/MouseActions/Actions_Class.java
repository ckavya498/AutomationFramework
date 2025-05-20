package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {
	
/*AssignQues: WATS to perform foll. actions:
	1: Open Irctc App
	2: Move mouse cursor to More option
	3: select any one option (adhar link...*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().fullscreen();
		Actions a = new Actions(driver);
		WebElement ele =driver.findElement(By.xpath("//div[@class='h_menu_drop_button hidden-xs']"));
	    a.moveToElement(ele).perform(); 
		driver.findElement(By.xpath("//div[@class='h_menu_drop_button hidden-xs']")).click();
		driver.findElement(By.id("disha-banner-close")).click();
		driver.findElement(By.xpath("//label[contains(text(),'MORE')]")).click();
	    driver.findElement(By.linkText("ChatBot as a Service (CaaS)")).click();
		
	}

}

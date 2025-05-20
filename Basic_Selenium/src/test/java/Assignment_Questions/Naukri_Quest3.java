package Assignment_Questions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri_Quest3 {
	
//WATS to login http://Naukri.com using google(enter email and then click on NEXT and close)

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--start-maximized");
        opt.addArguments("--disable-notifications"); 
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		driver.findElement(By.className("acceptance-btn-text")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='social-media']")).click();
//      //switching from parent to child window
//      		Set<String> windows = driver.getWindowHandles();//[parentid,childid]
//      		Iterator<String>it=windows.iterator();
//      		String parentId = it.next();
//      		String childId = it.next();
//      		driver.switchTo().window(childId);
        String mainWindowHandle = driver.getWindowHandle();
        Thread.sleep(3000);
        Set<String> s = driver.getWindowHandles();
        Iterator<String> iterator = s.iterator();
     //   Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                Thread.sleep(3000);
			driver.findElement(By.id("identifierId")).sendKeys("abc@gmail.com");
            driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
        driver.close();		
}
}
}




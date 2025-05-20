package Popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {
	
//WATS to login in http://yatra.com by click on SignIn with facebook  

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.yatra.com/");
        driver.findElement(By.xpath("//span[text()='Login / Signup']")).click();
        driver.findElement(By.xpath("//p[text()='Login or Create Account']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("fb-login-btn")).click();
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();
        Iterator<String> itr = s.iterator();
        while(itr.hasNext()) {
        	String windows = itr.next();
            if (!mainWindowHandle.equalsIgnoreCase(windows)) {
        driver.switchTo().window(windows); 
    	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();	
        }
            
        }
	}
}



package WebDriver_Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Is_EnableMethod {

	//WATS to verify whether http://amazon.in search field is enabled or disbaled 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		boolean search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).isEnabled();
		if(search) {
			System.out.println("Search field is enabled");
		} else {
			System.out.println("Search field is displayed");
		}
		driver.close();

	}

}

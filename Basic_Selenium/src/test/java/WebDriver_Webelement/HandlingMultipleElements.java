package WebDriver_Webelement;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {
	
//WATS to display all the images source Attribute property value as an output in flipkart app

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement list = driver.findElement(By.tagName("img"));
		String str = list.getAttribute("src");
		System.out.println("Attribute property =" +str);
        driver.close(); */
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> ele = driver.findElements(By.tagName("img"));
		for(WebElement img: ele){
            System.out.println(img.getAttribute("src"));
		}
		driver.close();
	}
}


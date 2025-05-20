package Autosuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Is_Multiple {
	
//WATS to verify listbox is Multiselectable or not in FB Date Field

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        WebElement w = driver.findElement(By.id("day"));
        Select s = new Select(w);
        boolean d = s.isMultiple();
        if(d) {
        	System.out.println("Dropdown for day is multiselectable");
        } else {
        	System.out.println("Dropdown for day is not multiselectable");
        }
        driver.close();
	}

}

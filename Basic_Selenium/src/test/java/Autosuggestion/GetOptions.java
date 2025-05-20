package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;


public class GetOptions {
	
//WATS to display total no. of options present in listbox as an output in YEAR field

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        WebElement ref = driver.findElement(By.id("year"));
        Select s = new Select(ref);
        List<WebElement> list = s.getOptions();
        System.out.println(list.size());
	}

}

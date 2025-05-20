package Autosuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Approach3 {
	
//WATS to select DOB field in FB application using Approach 3 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        WebElement day = driver.findElement(By.id("day"));
        Select s = new Select(day);
        s.selectByIndex(16);
        WebElement month = driver.findElement(By.id("month"));
        Select s1 = new Select(month);
        s1.selectByValue("10");
        WebElement year = driver.findElement(By.id("year"));
        Select s2 = new Select(year);
        s2.selectByVisibleText("1996");
	}

}

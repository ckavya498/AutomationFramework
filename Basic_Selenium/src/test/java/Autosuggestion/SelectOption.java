package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOption {
	
//WATS to display default selected option as an output in singleselectable listbox in FB Month field 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        WebElement ref = driver.findElement(By.id("month"));
        Select s = new Select(ref);
        List<WebElement> list = s.getOptions();
        for(int i=0; i<list.size();i++) {
        s.selectByIndex(i);
       }
        WebElement r = s.getFirstSelectedOption();
        System.out.println(r.getText());
	}

}


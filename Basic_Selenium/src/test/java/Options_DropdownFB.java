import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Options_DropdownFB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        WebElement monthDropdown = driver.findElement(By.id("month"));
        Select s = new Select(monthDropdown);
        List<WebElement> monthOptions = s.getOptions();
     //   List<String> monthNames = new ArrayList<String>();
        for(int i=0; i<monthOptions.size();i++) {
            s.selectByIndex(i);
	}   
        List<WebElement> monthOptions1 = s.getOptions();
        List<String> monthNames = new ArrayList<String>();
        for(int i=0; i<monthOptions.size();i++) {
        	WebElement r = monthOptions1.get(i);
        	monthNames.add(r.getText());
        }
             Collections.sort(monthNames);
             for(String month : monthNames) {
             	System.out.println(month);

}
}
}

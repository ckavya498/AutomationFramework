package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Optimization {
	
	/*AssignQues: WATS to perform following actions in facebook app
	1: Enter email
	2: Clear Email Text
	3: Enter New Email
	4: Enter Password */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//optimization type 1
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abc@gmail.com");
		email.clear();
		email.sendKeys("xyz@gmail.com");
		
		//optimization type 2
		driver.findElement(By.id("pass")).sendKeys("manager");
		

	}

}

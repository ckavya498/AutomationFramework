package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonOpt2 {

	//WATS to create account on http://amazon.in using OPT 2 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		
	    driver.findElement(By.id("nav-link-accountList")).click();
	    driver.findElement(By.id("createAccountSubmit")).click();
	    driver.findElement(By.id("ap_customer_name")).sendKeys("abc");
	    driver.findElement(By.id("ap_phone_number")).sendKeys("45678001243");
	    driver.findElement(By.name("password")).sendKeys("xyz@123");
	    driver.findElement(By.id("auth-continue")).click();
		
	    

	}

}

package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class CssSelectorExample {
	/*
	AssignQues: WATS to create account in http://Amazon.in using cssSelector
		Syntax: By.cssSelector("expression");
		    Expression means htmltag[PropertyName='PropertyValue'];*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		
	    driver.findElement(By.cssSelector("a[id='nav-link-accountList']")).click();
	    driver.findElement(By.cssSelector("a[id='createAccountSubmit']")).click();
	    driver.findElement(By.cssSelector("input[id='ap_customer_name']")).sendKeys("abc");
	    driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("45678001243");
	    driver.findElement(By.cssSelector("input[type='password']")).sendKeys("xyz@123");
	    driver.findElement(By.cssSelector("input[id='continue']")).click();

	}

}

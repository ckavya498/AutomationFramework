package WebDriver_Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_SizeMethod {
	
	//WATS to verify Email and Pwd field length is same or not in facebook app

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement e = driver.findElement(By.id("email"));
		Dimension d1 = e.getSize();
		int height = d1.getHeight();
		int width = d1.getWidth();
		System.out.println("Username Heigth = " + height);
		System.out.println("Username Width = " + width);
		WebElement e1 = driver.findElement(By.id("pass"));
		Dimension d2 = e1.getSize();
		int height1 = d2.getHeight();
		int width1 = d2.getWidth();
		System.out.println("Password Heigth = " + height1);
		System.out.println("Password Width =" + width1);
		if(d1.equals(d2)) {
			System.out.println("Username and password field dimension are equal");		
		} else {
			System.out.println("Username and password field dimension are not equal");
		}
        driver.close();
	}

}

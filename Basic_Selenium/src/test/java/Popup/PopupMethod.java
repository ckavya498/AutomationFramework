package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts ");
        //Click for JS Alert
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();  
        //Click for JS Confirm
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        alert1.accept();       
        //Click for JS Prompt
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert2.sendKeys("Hello I am JS");
        alert2.accept();
	}

}

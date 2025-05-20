package WebDriver_Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	//WATS to verify Firstname and Surname fields are align in same position or not in FB app 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        //firstname
        WebElement e = driver.findElement(By.xpath("//input[@name='firstname']"));
        Point p = e.getLocation();
        int x = p.getX();
        int y = p.getY();
        System.out.println("X position =" + x);
        System.out.println("y position =" + y);
      //surname
        WebElement e1 = driver.findElement(By.xpath("//input[@name='lastname']"));
        Point p1 = e1.getLocation();
        int x1 = p1.getX();
        int y1 = p1.getY();
        System.out.println("X1 position =" + x1);
        System.out.println("y1 position =" + y1);
        
        //verification
        if(p.equals(p1)) {
            System.out.println("Firstname and Surname fields are aligned in same position");
        } else {
            System.out.println("Firstname and Surname fields are not aligned in same position");
        }
        driver.close();
	}

}

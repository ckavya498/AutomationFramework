package Basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		/*driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().fullscreen();*/
		
		driver.get("https://www.facebook.com/");
		//Before maximizing
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		System.out.println("Browser Height = "+size.getHeight());
		System.out.println("Browser Width = "+size.getWidth());
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//after maximizing
		System.out.println(size);
		System.out.println("Browser Height = "+size.getHeight());
		System.out.println("Browser Width = "+size.getWidth());
		
		//setting the size
		driver.manage().window().setSize(new Dimension(300, 300));
		
		//another way of setting the size
		//Dimension s = new Dimension(300, 300);
		//driver.manage().window().setSize(s);
		
		//get position
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		System.out.println("X coordinate = "+position.getX());
		System.out.println("Y coordinate = "+position.getY());
		
		//set position
		driver.manage().window().setPosition(new Point(300, 300));		
        driver.close();
	}

}

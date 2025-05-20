package Basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	
	/*
	 Ques: WATS to perform foll actions:
1: Open Browser
2: Open Google App
3: Open Facebook App
4: Navigate back to google
5: Navaigate back to facebook
6: Refresh the browser
7: Change Browser size to 400*600
8: Change Browser Position to 150*300
9: maximize the browser
10: set browser fullscreen
11: Minimize the browser
12: Close the browser
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		
		System.out.println(driver.manage().window().getSize());
		//changing the browser size
		Dimension s = new Dimension(400, 600);
		driver.manage().window().setSize(s);
		System.out.println("After changing the size" +s);
		
		//changing the browser position
		Point p = driver.manage().window().getPosition();
		System.out.println(p);
		
		driver.manage().window().setPosition(new Point(150, 300));
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//fullscreen
		driver.manage().window().fullscreen();
		
		//minimize screen
		driver.manage().window().minimize();
		
		driver.close();

		
		

	}

}

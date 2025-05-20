package Basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeNavigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
/*
 1: Open browser
2: Open Google App
3: Open facebook app
4: Navigate back to google and verify whether google webpage is displayed or not
5: Change browser size to 400*500
6: Change position of browser to 300*450
7: Maximize the browser
8: Move forward to facebook & verify whether facebook webpage is displayed or not
9: wait for 2 sec and refresh the browser
10: Close browser
 */
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.google.com/");
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("gooGle")) {
			System.out.println("Google webpage is displayed");
		}
		else {
			System.out.println("Google webpage is not displayed");		
		}
		Dimension s = new Dimension(400, 500);
		driver.manage().window().setSize(s);
		System.out.println("After changing the size" +s);
		
		//changing the browser position
		driver.manage().window().setPosition(new Point(300, 450));
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().forward();
		String t = driver.getTitle();
		if(t.contains("ace")) {
			System.out.println("Facebook webpage is displayed");
		}
		else {
			System.out.println("Facebook webpage is not displayed");		
		}
		Thread.sleep(2000);
		driver.close();
	}

}

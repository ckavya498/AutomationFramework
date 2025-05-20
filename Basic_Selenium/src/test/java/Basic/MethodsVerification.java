package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title = driver.getTitle();
		//if(title.contains("rang")) {
		//if(title.equals("OrangeHRM")) {
		if(title.equalsIgnoreCase("orangehrm")) {
			System.out.println("OrangeHRM is displayed");
		}
		else {
			System.out.println("OrangeHRM is not displayed");
		}
		driver.close();
		}

}

package DataDrivenTesting_DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Text_Data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("../Basic_Selenium/data.properties");
		Properties p = new Properties();
		p.load(file);
		String str = p.getProperty("email");
		String str1 = p.getProperty("password");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(str);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(str1);
	}

}

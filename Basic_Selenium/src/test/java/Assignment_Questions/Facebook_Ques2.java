package Assignment_Questions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_Ques2 {
	
//WATS to login facebook by fetching data from data provider

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		String path = "C://Users//91812//Desktop//excel.xlsx";
        FileInputStream file = new FileInputStream(path);
        Workbook book = WorkbookFactory.create(file);
        Row s = book.getSheet("Sheet3").getRow(1);
        String email = s.getCell(0).toString();
        String pwd = s.getCell(1).toString();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@name='login']")).click();  
	}

}

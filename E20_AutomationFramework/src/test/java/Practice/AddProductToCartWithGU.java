package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import GenericUtlities.ExcelFile;
import GenericUtlities.FileUtility;
import GenericUtlities.JavaUtlility;
import GenericUtlities.SeleniumUtility;
import objectRepository.LoginPage;

public class AddProductToCartWithGU {

	public static void main(String[] args) throws IOException {
		
		//Create Object of all Utilities
				FileUtility fUtil = new FileUtility();
				ExcelFile eUtil = new ExcelFile();
				JavaUtlility jUtil = new JavaUtlility();
				SeleniumUtility sUtil = new SeleniumUtility();

				// Read common Data
				String URL = fUtil.readDataFromPropertyfile("url");
				String USERNAME = fUtil.readDataFromPropertyfile("username");
				String PASSWORD = fUtil.readDataFromPropertyfile("password");

				// Read Data from excel file
				String PRODUCTNAME = eUtil.readDataFromExcel("Products", 1, 2); // Run time data

				// Launch the browser
				WebDriver driver = new EdgeDriver();
				sUtil.maximizeWindow(driver);
				sUtil.addImplicitWait(driver);

				// Load the URL
				driver.get(URL);

				// Login to Application
//				driver.findElement(By.id("user-name")).sendKeys(USERNAME);
//				driver.findElement(By.id("password")).sendKeys(PASSWORD);
//				driver.findElement(By.id("login-button")).click();
				
				LoginPage lp = new LoginPage(driver);
//				lp.getUsernameText().sendKeys(USERNAME);
//				lp.getPasswordText().sendKeys(PASSWORD);
//				lp.getLoginBtn().click();
				lp.loginToApp(USERNAME, PASSWORD);

				//click on a product - dynamic data
		        WebElement ele = driver.findElement(By.xpath("//div[text()='"+PRODUCTNAME+"']")); //appending operator
		        String productname = ele.getText();
		        ele.click();
		        //click on add to cart
		        driver.findElement(By.id("add-to-cart")).click();
		        //navigate to cart
		        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		        //validate the product in cart
		        String productIncart = driver.findElement(By.className("inventory_item_name")).getText();
		        if(productIncart.equals(productname)) {
		        	System.out.println("Pass");
		        	System.out.println(productIncart);
		        } else {
		        	System.out.println("Fail");
		        }
		        //logout the application
		        driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		        driver.findElement(By.xpath("//a[text()='Logout']")).click();
		        driver.close();
			}
	}



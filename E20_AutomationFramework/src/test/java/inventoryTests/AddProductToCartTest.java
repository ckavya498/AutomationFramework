package inventoryTests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import GenericUtlities.ExcelFile;
import GenericUtlities.FileUtility;
import GenericUtlities.JavaUtlility;
import GenericUtlities.SeleniumUtility;
import objectRepository.CartPage;
import objectRepository.InventoryPage;
import objectRepository.InvertoryItemPage;
import objectRepository.LoginPage;

public class AddProductToCartTest {
	
	@Test
	public void TC_01_AddProductToCartTest() throws IOException {

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
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(USERNAME, PASSWORD);

		//click on a product
        InventoryPage ip = new InventoryPage(driver);
        ip.ClickOnAProduct(driver, PRODUCTNAME);
        
        //click on add to cart
        InvertoryItemPage iip = new InvertoryItemPage(driver);
        iip.clickOnAddToCartBtn();
        
        //navigate to cart
        ip.clickOnCartContainer();
        
        //validate the product in cart
        CartPage cp = new CartPage(driver);
        String ProductInCart = cp.captureItemName();
        if(ProductInCart.equals(PRODUCTNAME)) {
        	System.out.println("PASS");
        	System.out.println(ProductInCart);
        }else {
        	System.out.println("FAIL");
        }
        
        //logout the application
        ip.logoutOfApp();
	}
	}

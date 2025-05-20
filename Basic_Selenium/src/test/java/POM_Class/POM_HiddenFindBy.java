package POM_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_HiddenFindBy {
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginButton;
	@FindBy(xpath="//div[@class='_9ay7']")
	private WebElement errormsg;
	
	public POM_HiddenFindBy(WebDriver driver) {
		PageFactory.initElements(driver, this);  
	}
	
	public void enteremail(String email_address) {
		email.sendKeys(email_address);
	}
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void clickOnLoginButton() {
		loginButton.click();

}
	public void error() {
		if(errormsg.isDisplayed()) {
			String str = errormsg.getText();
			System.out.println(str);
		} else {
			System.out.println("Error msg not displayed");
		}
	}
}

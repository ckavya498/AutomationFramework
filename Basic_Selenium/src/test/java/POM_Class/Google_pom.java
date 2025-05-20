package POM_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google_pom {
//	private List<WebElement> links;
//	public Google_pom(WebDriver driver) {
//		links = driver.findElements(By.tagName("a"));
//	}
//	public void getlinkstext() {
//		for(int i=0; i<links.size(); i++) {
//			WebElement r = links.get(i);
//			System.out.println(r.getText());
//		}
		@FindBy(tagName = "a")
		private List<WebElement> links;
		public Google_pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void getlinkstext() {
		for(int i=0; i<links.size(); i++) {
			WebElement r = links.get(i);
			System.out.println(r.getText());
		}
	}
	
}

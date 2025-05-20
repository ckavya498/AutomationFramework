package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script_1 {
	@Test
	public void test() {
		//System.out.println("hello"); //display only in console
		//Reporter.log("hello"); //display in emailable report
		Reporter.log("hello", true);//display both in console and emailable report
		}

}

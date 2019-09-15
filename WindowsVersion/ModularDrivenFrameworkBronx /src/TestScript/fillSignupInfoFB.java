package TestScript;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;

import Locators.locators;
import Utilities.ActionMethods;
import Values.values;

public class fillSignupInfoFB extends ActionMethods {

	locators loc=new locators();
	values val=new values();
	
	@Test 
	public void test1() throws Exception {
		typeByXpath(loc.fName, val.fName);
		typeByXpath(loc.lName, val.lname);
		Thread.sleep(1000);
	}
	@Test ()
	public void test2() throws Exception {

		
		driver.findElement(By.xpath("//*[@id='u_0_e']")).clear();
		driver.findElement(By.xpath("//*[@id='u_0_e']")).sendKeys("ashif");
		driver.findElement(By.xpath("//*[@id='u_0_g']")).clear();
		driver.findElement(By.xpath("//*[@id='u_0_g']")).sendKeys("uzzaman");
		Thread.sleep(1000);

	}

}

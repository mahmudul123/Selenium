package Utilities;

import org.openqa.selenium.By;

import Base.SetUpBreakDown;

public class ActionMethods extends SetUpBreakDown {
	
	public void clickByXpath(String Locator) {
		driver.findElement(By.xpath(Locator)).click();
	}
	
	public void typeByXpath(String Locator, String Value) {
		driver.findElement(By.xpath(Locator)).clear();
		driver.findElement(By.xpath(Locator)).sendKeys(Value);
	}
	

}

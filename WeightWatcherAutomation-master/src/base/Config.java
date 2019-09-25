package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utils.Methods;

public class Config extends Methods {

	
	@BeforeClass
	public void setUp(){
	
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
	}

	@AfterClass
	public void tearDown (){
		
	}
}

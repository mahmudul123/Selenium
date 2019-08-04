package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class SetUpBreakDown {
	public WebDriver driver;

	@Parameters ("browser")
	@BeforeTest
	public void beforeSuite(String browser){
		
		if (browser.equalsIgnoreCase("ch")){
		System.out.println("*** TEST SUITE STARTED ");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		//		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashif\\eclipse-workspace\\SelniumBasicClassBronx19\\Drivers\\chromrdriver.exe");


		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("ff")) {
			System.out.println("*** TEST SUITE STARTED ");
			System.setProperty("webdriver.geko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
			//		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashif\\eclipse-workspace\\SelniumBasicClassBronx19\\Drivers\\chromrdriver.exe");


			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
		}
	}
	
	@AfterTest
	public void afterSuite(){
		System.out.println("*** TEST SUITE ENDED ");
		driver.quit();
		// close db
		// suite end time

	}




}

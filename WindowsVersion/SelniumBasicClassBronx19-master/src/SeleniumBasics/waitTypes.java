package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class waitTypes {
	
	WebDriver driver;

	public void initiateBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		//		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashif\\eclipse-workspace\\SelniumBasicClassBronx19\\Drivers\\chromrdriver.exe");


		driver = new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.manage().window().maximize();
	}
	
	@Test
	public void implicitWaitforElement() throws InterruptedException {
		initiateBrowser();
		// Implicit wait - Global wait - wait till everything to load
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
    	driver.findElement(By.linkText("Log in")).click();
//    	All actions are stopped for time put in Milliseconds
    	Thread.sleep(1000);
    	
	}
	
	@Test
	public void explicitWaitfroElements() {
		// Explicit wait - Wait for certain condition to load
        // Explicit wait Implement with 2 classes in selenium. One is WebDriverWait and FluentWait
         // WebDriverWait widely used
		 WebDriverWait wait = new WebDriverWait (driver, 40);
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log In")));
	}

}

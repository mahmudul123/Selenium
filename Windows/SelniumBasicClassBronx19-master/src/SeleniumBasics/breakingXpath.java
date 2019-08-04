package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class breakingXpath {
	WebDriver driver;

	public void initiateBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		//		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashif\\eclipse-workspace\\SelniumBasicClassBronx19\\Drivers\\chromrdriver.exe");


		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	@Test
	public void brekxpth() {
		String xpth1="//*[@id='js_0']/ul/li[";
		int i=1;
		String xpth2="]/a";
		initiateBrowser();
		List<WebElement> listoflinks = driver.findElements(By.xpath("//*[@id='js_0']/ul/li"));
		int linksCount=listoflinks.size();
		for(i=linksCount;i<=linksCount; i--) {
			if(driver.findElement(By.xpath(xpth1+i+xpth2)).isDisplayed()) {
				driver.findElement(By.xpath(xpth1+i+xpth2)).click();
				driver.navigate().back();
			}
			else {
				System.out.println("nothing toi click");
			}
		}
	}
}

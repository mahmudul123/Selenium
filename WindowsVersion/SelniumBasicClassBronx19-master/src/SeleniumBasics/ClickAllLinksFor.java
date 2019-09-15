package SeleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClickAllLinksFor {
	WebDriver driver;

	public void initiateBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		//		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashif\\eclipse-workspace\\SelniumBasicClassBronx19\\Drivers\\chromrdriver.exe");


		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void allLinksClicked() throws InterruptedException {
		initiateBrowser();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement linkSection= driver.findElement(By.xpath("//*[@id='js_0']/ul"));
		List<WebElement> allLinks= linkSection.findElements(By.tagName("a"));
		int count=allLinks.size();
		System.out.println(count);
		for(WebElement link: allLinks) {


				System.out.println(link.getText());
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElement(By.linkText(link.getText())).click();


				
//				driver.get("https://www.facebook.com");
			driver.navigate().back();
			Thread.sleep(2000);
		}
	}

}

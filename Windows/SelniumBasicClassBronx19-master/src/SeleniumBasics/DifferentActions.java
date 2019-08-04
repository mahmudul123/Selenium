package SeleniumBasics;

import static org.testng.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DifferentActions {
	WebDriver driver;

	public void initiateBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		//		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashif\\eclipse-workspace\\SelniumBasicClassBronx19\\Drivers\\chromrdriver.exe");


		driver = new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.manage().window().maximize();
	}

		@Test
		public void clickLinkdynamicly() {
			initiateBrowser();
		/* */
	
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		List<String> txtLinks= new ArrayList<>();
		
		for(int i=0;i<allLinks.size();i++) {
	        txtLinks.add(allLinks.get(i).getText());
//	        System.out.println(txtLinks.add(allLinks.get(i).getText()));
//	        if (txtLinks.get(i) =="Log In") {
//	        	allLinks.get(i).click();
//	        	
//	    
//	        }else {
//	            try {
//	            	assertEquals(allLinks.get(i).getText(), "Log in");
//	            }
//	            catch(Throwable t){
//	            	System.out.println(t.getMessage());
//	            }
//	        	
//	        }
	
	        System.out.println(txtLinks.get(i));
	    }
	    driver.quit();
	
	}
		
//		@Test
//		public void clickLink() {
////			open browser
////			Go to URL
////			already done in previous step
////			Click on 1st link by custom XPath
//			driver.findElement(By.xpath("")).click();
////			Go back to original page
//			driver.navigate().back();
//			
//		}
//		@Test
//		public void clickRadioButton() {
//			initiateBrowser();
//			assertEquals(driver.findElement(By.linkText("Log In")).getText(), "Log In", "the value does not match");
//			driver.findElement(By.id("u_0_a")).click();
//			driver.findElement(By.linkText("Log In")).click();
//			
//		}
//		
//		@Test
//		public void selectDropdown(){
//			initiateBrowser();
//	//		driver = new ChromeDriver();
//		Select month= new Select(driver.findElement(By.id("month")));
//		month.selectByVisibleText("Jan");
//		month.selectByValue("1");
//		
//			
//		}
//		
//		@Test
//		public void typeTextBox() {
//			initiateBrowser();
//			driver.findElement(By.name("firstname")).click();
//			driver.findElement(By.name("firstname")).clear();
//			driver.findElement(By.name("firstname")).sendKeys("Ashif");
//		}
//
//	@Test
//	public void alertTest() throws InterruptedException {
//		initiateBrowser();
//		driver.findElement(By.xpath("//input[@type='button'][@value='Confirmation Alert']")).click();
//		Alert al= driver.switchTo().alert();
//		System.out.println(al.getText());
//		Thread.sleep(1000);
//		al.dismiss();
//		Thread.sleep(1000);
//
//
//	}
//		@Test
//		public void hardAssertPass() {
//			
//			driver.findElement(By.linkText("Continue")).click();
//	//		the below code is to get the URL shown on the page at the moment of its execution
//			String currentURL=driver.getCurrentUrl();
//			String expected="http://www.tizag.com/javascriptT/javascriptconfirm.php";
//						assertEquals(currentURL, expected, "The current URL does not match with expected.");
//		
//	
//			
//	
//	
//	
//		}
//		
//		@Test
//		public void hardAssertFail() {
//			
//	//		the below code is to get the URL shown on the page at the moment of its execution
//			String currentURL=driver.getCurrentUrl();
//			String expected="http://www.tizag.com/javascriptT/javascriptconfirm.php";
//						assertEquals(currentURL, expected, "The current URL does not match with expected.");
//	
//						driver.findElement(By.linkText("Continue")).click();
//	
//	//					the below code is to get the URL shown on the page at the moment of its execution
//			String currentURL2=driver.getCurrentUrl();
//			assertEquals(currentURL2, expected, "The current URL does not match with expected.");
//	
//		}
//		@Test
//		public void softAssert() {
//			String currentURL=driver.getCurrentUrl();
//			String expected="http://www.tizag.com/javascriptT/javascriptconfirm.php";
//			try {
//				assertEquals(currentURL, expected, "The current URL does not match with expected.");
//			}
//			catch(Throwable t) {
//				System.out.println(t.getMessage());
//			}
//	//		the below code is to get the URL shown on the page at the moment of its execution
//			
//			
//	//		assertEquals(currentURL, expected, "The current URL does not match with expected.");
//			driver.findElement(By.linkText("Continue")).click();
//			String currentURL2=driver.getCurrentUrl();
//			assertEquals(currentURL2, expected, "The current URL does not match with expected.");
//	//		assertEquals(driver.findElement(By.linkText("Continue")).isDisplayed(), true, "");
//		}
//
//	@Test
//	public void iframeTest() throws InterruptedException {
//		driver.get("http://hugelearning.com/iframe-practice-page/");
//		driver.switchTo().frame(0);
//		Thread.sleep(10000);
//		driver.findElement(By.linkText("LINK TEST1")).click();
//		driver.switchTo().defaultContent();
//		
//		driver.findElement(By.linkText("Home")).click();
//		
//
//	}


}

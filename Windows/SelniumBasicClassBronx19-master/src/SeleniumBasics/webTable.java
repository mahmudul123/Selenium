package SeleniumBasics;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webTable {
	WebDriver driver;
	String[][] cloumnvalue= {{"Balrampur Chini","A","147.80","162.00","+ 9.61"},{"Quess Corp","A","	440.15","480.95","+ 9.27"}};

	public void initiateBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		//		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashif\\eclipse-workspace\\SelniumBasicClassBronx19\\Drivers\\chromrdriver.exe");


		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();
	}
	

	public void webTable1(String[][] columnvalue) {
//		initiateBrowser();
		String xpath1="//*[@id='leftcontainer']/table/tbody/tr[";
		int tr;
		String xpath2= "]/td[";
		int td;
		String xpath3="]";
//		List<WebElement> rowcount= driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
//		List<WebElement> coloumnCount=  driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td"));
		for(tr=1; tr<2; tr++) { 
			for(td=1; td<6;td++) {
			

				
				System.out.println(driver.findElement(By.xpath(xpath1+tr+xpath2+td+xpath3)).getText());
				assertEquals(driver.findElement(By.xpath(xpath1+tr+xpath2+td+xpath3)).getText(),cloumnvalue[td-1]);
//				assertEquals(driver.findElement(By.xpath(xpath1+tr+xpath2+td+xpath3)).getText() , c1);

			}

			
//			for(int j = 0; j<1; j++) {
//				System.out.println(coloumnCount.get(i).getText());
//			}
//			System.out.println("This will print all the values in the row");	
//			System.out.println(rowcount.get(i).getText());
			
			
		}
	}
	
	@Test
	public void testTable() {
		initiateBrowser();
		webTable1(cloumnvalue);
		webTable1(cloumnvalue);
	}

}

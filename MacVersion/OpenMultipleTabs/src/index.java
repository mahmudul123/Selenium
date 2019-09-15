
import java.util.ArrayList;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class index {
	
	public static void main(String [] args) {
		
	 //Connecting Firefox to open the webpages
		
		System.setProperty("webdriver.gecko.driver", "/Users/mahmudulalam/Desktop/SeleniumAuto/WebDriver/geckodriver");
		WebDriver driver = new FirefoxDriver();

		openNewTab(driver, "https://www.dcma.mil/", 0);
		openNewTab(driver, "https://afreserve.com/", 1);
		openNewTab(driver, "https://www.afciviliancareers.com/", 2);
		openNewTab(driver, "https://www.northropgrumman.com/Pages/default.aspx", 3);
		openNewTab(driver, "https://www.pw.utc.com/", 4);
		openNewTab(driver, "https://www.lockheedmartin.com/en-us/who-we-are/business-areas/rotary-and-mission-systems.html", 5);
		driver.quit();
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mahmudulalam/Desktop/SeleniumAuto/WebDriver/chromedriver");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");	 
	}
	
	public static void openNewTab(WebDriver webDriver, String url, int position) {
        ((JavascriptExecutor) webDriver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<>(webDriver.getWindowHandles());
        System.out.println("tabs : " + tabs.size() + " >position: " + position + " >\t" + url);
        webDriver.switchTo().window(tabs.get(position));
        webDriver.get(url);
    }
}
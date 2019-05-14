import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mahmudulalam/Documents/github/Selenium/WebDriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		
	}

}

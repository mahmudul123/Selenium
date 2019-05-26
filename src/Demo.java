import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//So we can 
		System.setProperty("webdriver.chrome.driver", "/Users/mahmudulalam/Documents/github/Selenium/WebDriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		
		//This line of code is to maximize the browsers window. 
		driver.manage().window().maximize();
		
		
		//Most of the link can be find from the <a> tag. 
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		
		System.out.println();
		
		
		//Now we going to convert the WebElemet to string. 
		List<String> txtLinks= new ArrayList<>();
		
        for(int i=0;i<alllinks.size();i++) {
            txtLinks.add(alllinks.get(i).getText());
            System.out.println(txtLinks.get(i));
        }
		
        driver.quit();
	}

}

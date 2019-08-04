
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Demo {
	
WebDriver driver;
    
    public void initiateBrowser() {
    	System.setProperty("webdriver.chrome.driver", "/Users/mahmudulalam/Documents/github/Selenium/WebDriver/chromedriver");
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\ashif\\eclipse-workspace\\SelniumBasicClassBronx19\\Drivers\\chromrdriver.exe");
        
        
    driver = new ChromeDriver();
    driver.get("https:\\www.facebook.com");
    driver.manage().window().maximize();
    }
    
//    @Test
//    public void clickLink() {
//        initiateBrowser();
//    /* */
//
//    List<WebElement> allLinks= driver.findElements(By.tagName("a"));
//    List<String> txtLinks= new ArrayList<>();
//    
//    for(int i=0;i<allLinks.size();i++) {
//        txtLinks.add(allLinks.get(i).getText());
//        if (txtLinks.get(i) =="Log In") {
//            allLinks.get(i).click();
//            
//
//        }else {
//            try {
//                assertEquals(allLinks.get(i).getText(), "Log in");
//            }
//            catch(Throwable t){
//                System.out.println(t.getMessage());
//            }
//            
//        }
//
//        System.out.println(txtLinks.get(i));
//    }
//    driver.quit();
//
//}
    //@Test
    //public void clickRadioButton() {
    //assertEquals(driver.findElement(By.linkText("Log In")).getText(), "Log In", "the value does not match");
    //driver.findElement(By.id("u_0_a")).click();
        
    //}
    
    //@Test
    //public void selectDropdown(){
        //initiateBrowser();
//        driver = new ChromeDriver();
    //Select month= new Select(driver.findElement(By.id("month")));
    //month.selectByValue("9");
    
    //Select day= new Select(driver.findElement(By.id("day")));
    //day.selectByIndex(14);
    
    //Select year= new Select(driver.findElement(By.id("year")));
    //year.selectByVisibleText("1997");
    
    //} 
    
    //@Test
    //public void typeTextBox() {

     //   driver.findElement(By.name("firstname")).click();
     //   driver.findElement(By.name("firstname")).clear();
     // driver.findElement(By.name("firstname")).sendKeys("Mahmudul");
        
     // driver.findElement(By.name("lastname")).click();
     // driver.findElement(By.name("lastname")).clear();
     // driver.findElement(By.name("lastname")).sendKeys("Alam");
        
        
        

//    @Test
//    public void selectLinks(){
//    	
//        //Open browser
//        //GO to the URL
//        //Click on First Link by custom XPath
//        //Go Back to the First page
//    initiateBrowser();
//    driver.findElement(By.xpath("//a[@title='Sign Up for Facebook']")).click();
//    driver.navigate().back();
//    driver.findElement(By.linkText("Watch")).click();
//    driver.navigate().back();
//    driver.findElement(By.partialLinkText("Account Security")).click();
//    driver.quit();
//    } 
    
    @Test
    public void ClickAllLink() {
    	initiateBrowser();
    	//Open the browser 
    	//Click on link go back then click the next link
    	//Create a loop that finds and runs every link
    	
	List<WebElement> allLinks= driver.findElements(By.tagName("a"));
	for(int i=0;i<=allLinks.size();i++) {
          allLinks.get(i).click();
          driver.navigate().back();
       	
	  }

    } 
}
	
	


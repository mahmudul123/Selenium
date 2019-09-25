package interviewQuestions;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Locators.locator;
import Values.values;
import base.Config;

public class Answer2 extends Config {


		StringBuffer verificationErrors = new StringBuffer();
		locator l = new locator();
		values v = new values();
		
		@BeforeTest
		public void InitiateBrowser() {
		driver = new ChromeDriver();
		
		driver.get("https://www.weightwatchers.com/us/");
		APPLICATION_LOGS.debug("Weight Watcher Website opened");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		@Test
		public void Answer() {
			  	try {
			      assertEquals(driver.getTitle(), "Weight Loss Program, Recipes & Help | Weight Watchers");
			    } 
			  	catch (Error e){
					System.err.println("issue with :"  + e.getMessage());
					APPLICATION_LOGS.error("issue with : " + e.getMessage());
			    }
			  	clickById(l.findMeetingLink);
			  	 try {
			  	      Assert.assertTrue(driver.getTitle().contains("Get Schedules & Times Near You"));
			  	    } 
			  	 catch (Error e) {
			  	      verificationErrors.append(e.toString());
			  	      System.out.println(e);
			  	    }
			  	typeById(l.zipSearchbox,v.zipcode);
			  	clickByClass(l.searchButton);
			  	System.out.println("Name of meeting Place  "+getTextbyXpath(l.firstResultTitle)+" Distance of meeting place is "+getTextbyXpath(l.distance));
			  	clickByXpath(l.firstResult);
			  	WebElement web= driver.findElement(By.xpath("//*[@id='content']/div/div/ui-view/ui-view/div[1]/div/div/div[2]/div[2]/div[1]/hours-list"));
			  	String day =web.findElement(By.xpath("//*[contains(@class,'hours-list-item-wrapper hours-list--currentday')]/div[1]")).getText();
			  	String hours =web.findElement(By.xpath("//*[contains(@class,'hours-list-item-wrapper hours-list--currentday')]/div[2]")).getText();
			  	
			  	System.out.println(day+"'s hours are "+hours+".");
		
	}
		@AfterTest
		public void closeBrowser() {
			driver.quit();
		}
		
		}

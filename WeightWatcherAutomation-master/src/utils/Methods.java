package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Methods {

	protected WebDriver driver;

	//----------------------file Exist-----------------------------
		public void doesfileExist(String p) {
			 
			File file = new File(System.getProperty("user.dir")+"\\"+p);
			
			    if (file.exists() && file.isFile())
			    {
			      System.out.println("File exists in user.dir of the project folder, and it is a file.");
			    }
			    else {
			    	System.out.println("File does not exist in user.dir of the project folder");
			    }
			  
			    }
		
		//----------------------Read File---------------------------
		public void readFile(String path) throws IOException{
				
				try{
					  // Open this file.
			        BufferedReader reader = new BufferedReader(new FileReader(path));

			        // Read lines from file.
			        while (true) {
			            String line = reader.readLine();
			        
			            if (line == null) {
			                break;
			            }
			           
			            // Split line on comma.
			            String[] parts = line.split(",");
			           
			            String[] parts1 = parts[0].split(" ", 2);
			          
			            for (String part1 : parts1) {
			            	System.out.println(part1);
			            	
			            }
			          try {  System.out.println(parts[1]);
			          }
			          catch(Exception e) {
			        	  
			          }
			            System.out.println();
			        }

			        reader.close();
			    
				}catch(Exception e){
				    e.printStackTrace();
				}
		}
		public static int[] generateIncreasingRandoms(int amount, int max) {
		    int[] randomNumbers = new int[amount];
		    Random random = new Random();
		    for (int i = 0; i < randomNumbers.length; i++) {
		        randomNumbers[i] = random.nextInt(max);
		    }
		    Arrays.sort(randomNumbers);
		    return randomNumbers;
		    
		}
	
	public static Logger APPLICATION_LOGS = Logger.getLogger("myLogs");
	
	/// -------------------- to deal with editBox (TYPE)---------------------
	
	public void typeById (String locator, String value){
		driver.findElement (By.id(locator)).sendKeys(value);

	}
	
	/// -------------------- to deal with CLICK---------------------
	public void clickByXpath (String locator){
		driver.findElement (By.xpath(locator)).click();

	}
	public void clickById (String locator){
		driver.findElement (By.id(locator)).click();

	}
	public void clickByClass(String locator) {
		driver.findElement(By.className(locator)).click();
	}
	
	///-------------------------To deal with get text----------------
	public String getTextbyXpath (String locator) {
		return driver.findElement(By.xpath(locator)).getText();
	}
	
}
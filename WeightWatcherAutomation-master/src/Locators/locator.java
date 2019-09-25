package Locators;

import org.testng.util.Strings;

public class locator {
	// Locator By ID
		public String findMeetingLink = "ela-menu-visitor-desktop-supplementa_find-a-meeting";
		public String zipSearchbox = "meetingSearch";
		
		
	// Locator Xpath
		public String searchButton = "input-group-btn";
		public String firstResult = "//*[@id='ml-1180510']/result-location/div/div[1]/a/location-address/div/div/div[1]/div[1]/span";
		public String firstResultTitle ="//div[@id='ml-1180510']/result-location/div/div/a/location-address/div/div/div/div/span";
		public String distance= "//div[@id='ml-1180510']/result-location/div/div/a/location-address/div/div/div/div[2]";								

	

}

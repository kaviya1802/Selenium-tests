package com.ecommerce.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHomePageTest {

	public static void main(String[] args) {
		
		final String siteUrl = "https://www.amazon.in/";
		
		
		// 1. Set selenium properties
		
		System.setProperty("webdriver.gecko.driver", 
				"/home/nallakavi35gmai/eclipse-workspace/Phase1-selenium-test-02-03-2021/driver/geckodriver");
				
		// 2. Instantiating webdriver
		
		WebDriver driver = new FirefoxDriver();
		driver.get(siteUrl);
		
			
		// 3. Perform test
		if(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			System.out.println("Test passed !!");
		}else {
			System.out.println("Test failed");
		}
		driver.close();
	}

}

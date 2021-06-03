package com.ecommerce.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonTitleTestWithAssert {

	@Test
	public void testHomePageTitle() {
		
		final String siteUrl = "https://www.amazon.in/";
		
		System.setProperty("webdriver.gecko.driver", 
				"/home/nallakavi35gmai/eclipse-workspace/Phase1-selenium-test-02-03-2021/driver/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get(siteUrl);
		
		String expectedTitle ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
		driver.close();
		
	}

}

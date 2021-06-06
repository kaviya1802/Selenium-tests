package com.ecommerce.locators;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class AmazonFindElementTest {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		// setup properties
		System.getProperty("webdriver.chrome.driver",
				"/home/nallakavi35gmai/eclipse-workspace/Phase1-selenium-test-02-03-2021/driver/chromedriver");

		// instantiating driver
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void findMultipleElementstest() {
		String siteUrl = "https://www.amazon.in/";
		driver.get(siteUrl);
		
		List<WebElement> element = driver.findElements(By.tagName("input"));
		
		for(WebElement elm : element) {
			System.out.println("Test"+elm.getText());
			System.out.println("Tagname"+elm.getTagName()+ " " +elm.getLocation());
			
			Assert.assertEquals("input", elm.getTagName());
		}
	}

}

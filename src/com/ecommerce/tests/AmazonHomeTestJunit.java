package com.ecommerce.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class AmazonHomeTestJunit {
	
	WebDriver driver;
	@Before
	public void setUpDriver() throws Exception {
		//Steup property
		System.setProperty("webdriver.gecko.driver", 
				"/home/nallakavi35gmai/eclipse-workspace/Phase1-selenium-test-02-03-2021/driver/geckodriver");
		
		//instantiating driver
		driver = new FirefoxDriver();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void verifyTitle() {
		String siteUrl = "https://www.amazon.in/";
		driver.get(siteUrl);
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@Test
	public void verifySourceUrl() {
		String siteUrl = "https://www.amazon.in/";
		driver.get(siteUrl);
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(siteUrl, actualUrl);
	}
	
	@Test
	public void verifyMobileSourcePage() {
		String siteUrl = "https://www.amazon.in/";
		driver.get(siteUrl);
		
		//locate mobile link
		WebElement mobileLink = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]"));
		//click mobile link
		mobileLink.click();
		String expectedUrl = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		String actualUrl = driver.getTitle();
		Assert.assertEquals(expectedUrl, actualUrl);
		
	}
	
	@Test
	public void verifySearch() throws InterruptedException {
		String siteUrl = "https://www.amazon.in/";
		driver.get(siteUrl);
		
		//locate mobile link
		WebElement searchLink = driver.findElement(By.id("twotabsearchtextbox"));
		
		//add input in search box
		searchLink.sendKeys("iPhone pro 11 max");
		Thread.sleep(2000); //to add delay
		
		WebElement submit = driver.findElement(By.id("nav-search-submit-button"));
		
		submit.click();
		
		String expectedTitle = "Amazon.in : iPhone pro 11 max";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);

		
	}
	
}

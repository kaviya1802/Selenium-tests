package com.ecommerce.github.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class githubLoginTest {
	
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
	public void loginvalidCredentialTest() {
		String siteUrl = "https://github.com/login";
		driver.get(siteUrl);
		
		WebElement username = driver.findElement(By.id("login_field"));
		username.sendKeys(Credentials.username);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(Credentials.password);
		
		WebElement sign_in = driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[12]"));
		sign_in.submit();
		
		
		WebElement newRepo = driver.findElement(By.cssSelector("#repos-container > h2 > a"));
	
		
		Assert.assertEquals("New", newRepo.getText());
		
		
	}
	


}

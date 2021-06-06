package com.ecommerce.locators;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AnazonFindElementTest {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		
		//setup properties
		System.getProperty("webdriver.chrome.driver", 
				"/home/nallakavi35gmai/eclipse-workspace/Phase1-selenium-test-02-03-2021/driver/chromedriver");
		
		//instantiating driver
		driver = new ChromeDriver();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void findElement() {
		
		String siteUrl = "https://www.amazon.in/";
		driver.get(siteUrl);
		
		//get the webelement by ID
		WebElement searchbox1 = driver.findElement(By.id("twotabsearchtextbox"));
		System.out.println("Search Tagname" +searchbox1.getTagName());
		Assert.assertEquals("input", searchbox1.getTagName());
		
		//get the webelement by Class
		
		WebElement searchbox2 = driver.findElement(By.className("nav-search-field"));
		System.out.println("Search Tagname:"+searchbox2.getTagName());
		Assert.assertEquals("input", searchbox1.getTagName());
		
		//get the webelement by css selecter
		
		WebElement searchbox3 = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		System.out.println("Search Tagname:"+searchbox2.getTagName());
		System.out.println("Search Location"+searchbox3.getLocation());
		Assert.assertEquals("input", searchbox1.getTagName());
		
		//get the webelement by relative xpath
		
		WebElement searchbox4 = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		System.out.println("Search tagname : "+searchbox4.getTagName());
		System.out.println("Search Location : "+searchbox4.getText());
		Assert.assertEquals("input", searchbox1.getTagName());
		//get the webelement by absolute xpath
		WebElement searchbox5 = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
		System.out.println("Search tagname"+searchbox5.getTagName());
		System.out.println("Search location"+searchbox5.getLocation());
		Assert.assertEquals("input", searchbox1.getTagName());
	}

}

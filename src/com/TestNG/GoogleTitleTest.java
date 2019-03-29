package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	
	
WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	@Test(priority=1,groups = "Title")
	public void googleTitleTest() throws InterruptedException {
		
		Thread.sleep(2000);
		String titleOfThePage = driver.getTitle();
		System.out.println("Title of the Page is: " +titleOfThePage);
		
		Assert.assertEquals(titleOfThePage, "Google", "Title is not matched");
		
	}
	
	@Test(priority=2,groups = "LOGO")
	public void googleLogoTest() {
		
		boolean logo = driver.findElement(By.xpath("//img[@id = \"hplogo\"]")).isDisplayed();
		
		Assert.assertTrue(logo);
		Assert.assertEquals(logo, "True");
	}
	
	
	
	

}

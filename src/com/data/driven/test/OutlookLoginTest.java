package com.data.driven.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.data.excel.utility.TestUtilGetData;

public class OutlookLoginTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//	driver.get("https://outlook.live.com/");
	driver.get("https://www.gmail.com");
	
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = TestUtilGetData.getDataFromExcel();
		return testData.iterator();
		
	}
	

	@Test(dataProvider = "getTestData")
	public void googleTitleTest(String emailId, String password) throws InterruptedException  {
		
//		driver.findElement(By.xpath("//a[@class = \"linkButtonSigninHeader\"]")).click();
//		driver.findElement(By.xpath("//input[@type = \"email\"]")).sendKeys(emailId);
//		driver.findElement(By.xpath("//input[@type = \"submit\" and @id = \"idSIButton9\"]")).click();
//		driver.findElement(By.xpath("//input[@name = \"passwd\" and @type =\"password\"]")).sendKeys(password);
//		driver.findElement(By.xpath("//input[@class = \"btn btn-block btn-primary\" and @type =\"submit\"]")).click();
//		driver.findElement(By.xpath("//input[@class = \"btn btn-block btn-primary\" and @type =\"submit\"]")).click();
//		driver.findElement(By.xpath("//div[contains(text(),'Sign out')]")).click();
//		
		
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys(emailId);
		driver.findElement(By.xpath("//span[text() =\"Next\"]//parent::content")).click();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//span[text() =\"Next\"]//parent::content")).click();
		Thread.sleep(10000);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	
}

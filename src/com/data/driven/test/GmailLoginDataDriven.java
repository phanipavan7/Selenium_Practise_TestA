package com.data.driven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.data.excel.utility.Xls_Reader;

public class GmailLoginDataDriven {
	
	
	public static void main(String[] args) throws InterruptedException {
	
	Xls_Reader reader = new Xls_Reader("E:\\Sele\\Excel\\emaillist.xlsx");
	int rowCount = reader.getRowCount("gmailEmails");
	reader.addColumn("gmailEmails", "Title");
	reader.addColumn("gmailEmails", "LoggedIn");
	

	for(int rowNum = 2; rowNum<=rowCount; rowNum++) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		
		System.out.println("===================================================================");
		
		String email = reader.getCellData("gmailEmails", "emailId", rowNum);
		System.out.println(email);
		
		
		String password = reader.getCellData("gmailEmails", "password", rowNum);
		System.out.println(password);
		
		
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//span[text() =\"Next\"]//parent::content")).click();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//span[text() =\"Next\"]//parent::content")).click();
		
		String title = driver.getTitle();
		reader.setCellData("gmailEmails", "Title", rowNum, title);
		reader.setCellData("gmailEmails", "LoggedIn", rowNum, "Yes");
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	}
}

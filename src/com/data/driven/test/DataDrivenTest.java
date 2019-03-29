package com.data.driven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.data.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {

		
	
		Xls_Reader reader = new Xls_Reader("E:\\Sele\\Excel\\DataDriven.xlsx");
		
		
		String firstName = reader.getCellData("RegPage", "firstname", 2);
		System.out.println(firstName);

		String lastName = reader.getCellData("RegPage", "lastname", 2);
		System.out.println(lastName);
		
		String address1 = reader.getCellData("RegPage", "address1", 2);
		System.out.println(address1);
		
		String address2 = reader.getCellData("RegPage", "address2", 2);
		System.out.println(address2);
		
		String city = reader.getCellData("RegPage", "city", 2);
		System.out.println(city);
		
		String state = reader.getCellData("RegPage", "state", 2);
		System.out.println(state);
		
		String pinCode = reader.getCellData("RegPage", "pincode", 2);
		System.out.println(pinCode);
		
		String emailAddress = reader.getCellData("RegPage", "emailaddress", 2);
		System.out.println(emailAddress);
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("");
		
		
		driver.findElement(By.xpath("//*[@id = 'firstname']")).sendKeys(firstName);	
		
		driver.findElement(By.xpath("//*[@id = 'lastname']")).sendKeys(lastName);	
		
		driver.findElement(By.xpath("//*[@id = 'address1']")).sendKeys(address1);	
		
		driver.findElement(By.xpath("//*[@id = 'address2']")).sendKeys(address2);
		
		driver.findElement(By.xpath("//*[@id = 'city']")).sendKeys(city);
		
		Select select = new Select(driver.findElement(By.xpath("//*[@id = 'state']")));
		select.selectByVisibleText(state);
		
		driver.findElement(By.xpath("//*[@id = 'zip']")).sendKeys(pinCode);
		driver.findElement(By.xpath("//*[@id = 'email']")).sendKeys(emailAddress);
		driver.findElement(By.xpath("//*[@id = 'retype_email']")).sendKeys(emailAddress);
	}

}

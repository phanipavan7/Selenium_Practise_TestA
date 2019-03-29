package com.data.driven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.data.excel.utility.Xls_Reader;

public class ParameterizeTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("");
		
		
		Xls_Reader reader = new Xls_Reader("E:\\Sele\\Excel\\DataDriven.xlsx");
		int rowCount = reader.getRowCount("RegData");
		
		reader.addColumn("RegData", "Status");
		
		for(int rowNum = 2; rowNum<=rowCount; rowNum++) {
			
			System.out.println("===============================================");
			String firstName = reader.getCellData("RegData", "firstname", rowNum);
			System.out.println(firstName);
			
			String lastName = reader.getCellData("RegPage", "lastname", rowNum);
			System.out.println(lastName);
			
			String address1 = reader.getCellData("RegPage", "address1", rowNum);
			System.out.println(address1);
			
			String address2 = reader.getCellData("RegPage", "address2", rowNum);
			System.out.println(address2);
			
			String city = reader.getCellData("RegPage", "city", rowNum);
			System.out.println(city);
			
			String state = reader.getCellData("RegPage", "state", rowNum);
			System.out.println(state);
			
			String pinCode = reader.getCellData("RegPage", "pincode", rowNum);
			System.out.println(pinCode);
			
			String emailAddress = reader.getCellData("RegPage", "emailaddress", rowNum);
			System.out.println(emailAddress);
			
			driver.findElement(By.xpath("//*[@id = 'firstname']")).clear();
			driver.findElement(By.xpath("//*[@id = 'firstname']")).sendKeys(firstName);	
			
			driver.findElement(By.xpath("//*[@id = 'lastname']")).clear();
			driver.findElement(By.xpath("//*[@id = 'lastname']")).sendKeys(lastName);	
			
			driver.findElement(By.xpath("//*[@id = 'address1']")).clear();
			driver.findElement(By.xpath("//*[@id = 'address1']")).sendKeys(address1);	
			
			driver.findElement(By.xpath("//*[@id = 'address2']")).clear();
			driver.findElement(By.xpath("//*[@id = 'address2']")).sendKeys(address2);
			
			driver.findElement(By.xpath("//*[@id = 'city']")).clear();
			driver.findElement(By.xpath("//*[@id = 'city']")).sendKeys(city);
			
			Select select = new Select(driver.findElement(By.xpath("//*[@id = 'state']")));
			select.selectByVisibleText(state);
			
			driver.findElement(By.xpath("//*[@id = 'zip']")).clear();
			driver.findElement(By.xpath("//*[@id = 'zip']")).sendKeys(pinCode);
			
			driver.findElement(By.xpath("//*[@id = 'email']")).clear();
			driver.findElement(By.xpath("//*[@id = 'email']")).sendKeys(emailAddress);
			
			driver.findElement(By.xpath("//*[@id = 'retype_email']")).clear();
			driver.findElement(By.xpath("//*[@id = 'retype_email']")).sendKeys(emailAddress);
			
			
			reader.setCellData("RegData", "Status", rowNum, "Pass");
			//we get fail by adding using assert conditions
			
		}
	}

}

package co.edureka.tut.basic.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender {
		
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//input[@type =\"email\"]")).sendKeys("jaffagadu7@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type =\"password\"]")).sendKeys("9441144313");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(10000);
		
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.xpath("//a[@class =\"gb_b gb_hc\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Calendar")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//div[@class =\"r4nke \" and text() =\"7\"]")).click();
		
//		String Date = "13-December-2018";
//		String date[] = Date.split("-");
//		String day = date[0];
//		String month = date[1];
//		String year = date[2];
		
//		String year = "Year";
//		
//		Select select = new Select(driver.findElement(By.xpath("//div[@id=\"ow281\"]")));
//		select.selectByVisibleText(year);
		
//		Need experience to do it. As ID is changing and couldn't find any other unique term
		
//		driver.findElement(By.xpath("//div[@id =\"ow75\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class =\"jO7h3c\" and text()=\"Year\"]")).click();
		
		//incomplete
		
	}

}

package co.edureka.tut.basic.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ModelFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com");
		
		driver.findElement(By.xpath("//input[@name= 'username' and @type ='text']")).sendKeys("naveenk");
		driver.findElement(By.xpath("//input[@name= 'password' and @type ='password']")).sendKeys("naveenk");
		Thread.sleep(5000);
		driver.switchTo().frame("intercom-borderless-frame");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class, 'intercom-chat-card-author']"))).build().perform();
		
		driver.findElement(By.xpath("//div[contains(@class, 'intercom-chat-card-author' ]))//span")).click();
		
		driver.findElement(By.xpath("//input[@value ='Login and @type='submit']")).click();
		
	}

}

package co.edureka.tut.basic.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		
//		WebElement username = driver.findElement(By.id("login-username"));
//		username.sendKeys("Pavan");;
//		
//		WebElement nxtbtn = driver.findElement(By.name("signin"));
//		nxtbtn.click();
		
		//*[@id="login-username"]
//		driver.findElement(By.xpath("//input[@id=\"login-username\"]"));
//		
//		
//		driver.findElement(By.cssSelector("#login-username")).sendKeys("Pavan");
//		driver.findElement(By.linkText("Sign up")).click();
		
		
//		driver.findElement(By.partialLinkText("Trouble")).click();
		
		//class name can be duplicate
		//driver.findElement(By.className("phone-no")).click().sendKeys("Pavan");
		
//		TagName is rarely used not mentioned here
		
	}

}

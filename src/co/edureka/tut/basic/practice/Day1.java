package co.edureka.tut.basic.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class Day1 {
	
	WebDriver driver;
		
	public void invokeBrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://edureka.co");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
	
	public void searchCourse(){
		
		try {
			
			driver.findElement(By.id("homeSearchBar")).sendKeys("Java");
			//driver.findElement(By.id(id))
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		Day1 myObj = new Day1();
		myObj.invokeBrowser();
	}

}

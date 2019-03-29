package co.edureka.tut.basic.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalenderUsingJS {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
//		driver.get("https://www.spicejet.com/");
		driver.get("https://paytm.com/bus-tickets");
		Thread.sleep(3000);
//		WebElement date = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
//		String dateVal = "30-12-2018";
//		String dateVal = "30/12";
		WebElement date = driver.findElement(By.xpath("//input[@class = \"fl-input _9KqY\" and @data-reactid = \"191\"]"));
		String dateVal = "30 Dec 2018";
		
		selectDateByJS(driver, date, dateVal);
	}

	
	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",element);
		
		
	}
}

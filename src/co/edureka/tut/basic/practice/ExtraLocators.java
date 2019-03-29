package co.edureka.tut.basic.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class ExtraLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		
		driver.findElement(new ByAll(By.id("u_0_j"), By.name("firstname"), By.xpath("//input[@name = \"firstname\" and @id=\"u_0_j\"]"))).sendKeys("Pavan");
		driver.findElement(new ByIdOrName("firstname")).sendKeys("Pavan");
		driver.findElement(new ByChained(
				By.xpath("//div[@id =\"u_0_i\"]"), 
				By.xpath("//div[@class = 'uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']"), 
				By.xpath("//input[@type =\"text\" and @name=\"firstname\"]"))).sendKeys("Pavan");
		
		driver.close();
		
		
	}

}

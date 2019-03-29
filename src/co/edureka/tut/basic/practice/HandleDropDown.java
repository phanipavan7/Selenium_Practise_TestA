package co.edureka.tut.basic.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
	
	static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		String TimZ = "Pacific Standard Time";
		System.setProperty("webdriver.chrome.driver", "E:\\Sele\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Select selectTimZ = new Select(driver.findElement(By.xpath("//select[@id = \"selTz\" and @class = \"languageInputText\"]")));
		selectTimZ.selectByVisibleText(TimZ);
	}
	
	

}

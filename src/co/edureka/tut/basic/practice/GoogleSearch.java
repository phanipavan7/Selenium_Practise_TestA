package co.edureka.tut.basic.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@type = \"text\" and @title =\"Search\"]")).sendKeys("testing");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role =\"listbox\"]//li//descendant::div[@class = \"sbl1\"]"));
		System.out.println("The no: of suggestions in the List are " +list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("testing tools")) {
				list.get(i).click();
				break;
			}
//			else {	
//				System.out.println("testing tools is not found");
//				}
//			
		}
		
		driver.close();
	}

}

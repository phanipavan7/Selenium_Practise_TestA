package co.edureka.tut.basic.practice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternetLogintwo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://floor6.hotspot/login/");
		//driver.findElement(By.xpath("//input[@type =\"text\" and @name =\"username\"]")).sendKeys("9900861226");
		driver.findElement(By.xpath("//input[@type =\"text\" and @name =\"username\"]")).sendKeys("f126");
		driver.findElement(By.xpath("//input[@type =\"password\" and @name =\"password\"]")).sendKeys("1226");
		
		driver.findElement(By.xpath("//input[@type =\"submit\" and @value =\"OK\"]")).click();
		
		
		Thread.sleep(2000);
		
//		Set<String> handler = driver.getWindowHandles();
//		Iterator<String> it = handler.iterator();
//		
//		String internetloginwindow = it.next();
//		System.out.println("Internet Login Window "+internetloginwindow);
//		Thread.sleep(2000);
//		System.out.println("hello");
//		driver.close();

	}

}

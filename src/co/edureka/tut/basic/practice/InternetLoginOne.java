package co.edureka.tut.basic.practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternetLoginOne {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://floor6.hotspot/login/");
		String titlebeforelogin = driver.getTitle();
		Thread.sleep(1000);
		System.out.println("the title of the page before login is = " +titlebeforelogin);
		driver.findElement(By.xpath("//input[@type =\"text\" and @name =\"username\"]")).sendKeys("f604");
		driver.findElement(By.xpath("//input[@type =\"password\" and @name =\"password\"]")).sendKeys("4312");
		driver.findElement(By.xpath("//input[@type =\"submit\" and @value =\"OK\"]")).click();
		String titleafterlogin = driver.getTitle();
		System.out.println("the title of the page after login is = " +titleafterlogin);

//		Thread.sleep(2000);
		
//		Set<String> handler = driver.getWindowHandles();
//		Iterator<String> it = handler.iterator();
//		
//		String internetloginwindow = it.next();
//		System.out.println("Internet Login Window "+internetloginwindow);
//		Thread.sleep(2000);
//		System.out.println("hello");
		driver.close();
		
		//this flow is stopped as the new window is not opening in the execution
		
//		String newpopupwindow = it.next();
//		System.out.println("ChildWindow ID is "+newpopupwindow);
//		Thread.sleep(20000);
//		
//		driver.switchTo().window(newpopupwindow);
//		driver.manage().window().maximize();
//		System.out.println("Title of the page is "+driver.getTitle());
//		Thread.sleep(20000);
//		driver.close();
//		
//		driver.switchTo().window(internetloginwindow);
//		System.out.println("Title of the page is "+driver.getTitle());
//		Thread.sleep(2000);
//		driver.close();
		
	}

}

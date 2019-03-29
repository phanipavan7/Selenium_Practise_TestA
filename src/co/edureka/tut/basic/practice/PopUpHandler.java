package co.edureka.tut.basic.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class PopUpHandler {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://www.popuptest.com/");
		driver.findElement(By.linkText("Chromeless")).click();
		Thread.sleep(2000);
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		//the iterator will be first outside the array, when we first call that it will enter into Parent window 
		//and then the child window
		
		String ParentWindowID = it.next();
		System.out.println("ParentWindow ID is "+ParentWindowID);
		Thread.sleep(2000);
		
		String ChildWindowID = it.next();
		System.out.println("ChildWindow ID is "+ChildWindowID);
		Thread.sleep(2000);
		
		driver.switchTo().window(ChildWindowID);
		driver.manage().window().maximize();
		System.out.println("Title of the page is "+driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(ParentWindowID);
		System.out.println("Title of the page is "+driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
	}

}

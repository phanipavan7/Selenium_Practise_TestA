package co.edureka.tut.basic.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		
		WebElement rightclickButton = driver.findElement(By.xpath("//img[@alt =\"Google\"]"));
		
		action.contextClick(rightclickButton).build().perform();
		
		WebElement copy = driver.findElement(By.xpath("//img[@alt =\"Google\"]"));
		
		String copyText = copy.getText();
		System.out.println("copyText "+ copyText);
		
		//incase any button exist in the portal
	}
	
}
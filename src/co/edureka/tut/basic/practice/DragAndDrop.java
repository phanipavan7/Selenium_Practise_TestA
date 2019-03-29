package co.edureka.tut.basic.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//Browser
		//Page
		//Frame
		
		driver.switchTo().frame(0);
		
		WebElement sourceElement = driver.findElement(By.xpath("//div[@id =\"draggable\"]"));
		WebElement tragetElement = driver.findElement(By.xpath("//div[@id =\"droppable\"]"));
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(sourceElement).moveToElement(tragetElement).release().build().perform();
		driver.close();
		
	}

}

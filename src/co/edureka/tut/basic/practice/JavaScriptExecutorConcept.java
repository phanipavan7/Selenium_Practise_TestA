package co.edureka.tut.basic.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptExecutorConcept {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//input[@type =\"email\"]")).sendKeys("jaffagadu7@gmail.com");
		
		
		WebElement nxtBtn = driver.findElement(By.className("CwaK9"));
		
		flash(nxtBtn, driver);
		drawBoarder(nxtBtn, driver);
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:\\Sele\\Screenshots\\Google1.png"));
		
		
		generateAlert(driver, "there is an issue with the login button");
		
		clickElementByJS(nxtBtn, driver);
		
		refreshBrowser(driver);
		
		getTitleByJS(driver);
		System.out.println(getTitleByJS(driver));
		
		System.out.println(pageInnerText(driver));
		
		scrollPageDown(driver);
		
		WebElement forgotPwdLink = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password')]"));
		scrollIntoView(forgotPwdLink, driver);
	}
	
	public static void flash(WebElement element, WebDriver driver) {
//		//the driver will become(Convert) will become java script executor
//		We have to cast our driver into Java script executor
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i=0; i<10; i++) {
			changeColor("rgb(0,200,0)",element,driver);
			changeColor(bgcolor, element, driver);
		}
		
	}
		
	public static void changeColor(String color,WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",element);
		
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			
		}
	}
	
	//selenium cannot change any HTML DOM Structure..we can do through JS , directly we are injecting JS
	public static void drawBoarder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.boarder = '3px solid red+'",element);
		
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			
		}
	}	
	
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('"+message+"')");
		
		
	}
	
	
	public static void refreshBrowser(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
		
		
	}
	
	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click()",element);
		
	}
	
	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static String pageInnerText(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}
	
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		
	}

}


 
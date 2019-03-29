package co.edureka.tut.basic.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
////import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browsers {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
//		System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "E:\\Sele\\drivers\\geckodriver.exe");
//		driver = new FirefoxDriver();
		System.setProperty("webdriver.edge.driver", "E:\\Sele\\drivers\\MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://amazon.in");
	}

}

package co.edureka.tut.basic.practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroClass 
{

	public static void main(String args[]) 
	{
		try {
			
			System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.manage().deleteAllCookies();
			driver.manage().window().fullscreen();
			driver.get("https://amazon.in");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Perfume");
			driver.findElement(By.xpath("//input[@class='nav-input' and @value='Go']")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.quit();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}

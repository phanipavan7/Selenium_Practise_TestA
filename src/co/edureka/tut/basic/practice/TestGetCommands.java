package co.edureka.tut.basic.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGetCommands {

	WebDriver driver;

	public void invokeBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			getCommands();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void getCommands() {

		try {

			driver.get("https://amazon.in");
			String titleOfThePage = driver.getTitle();
			System.out.println("Title of the Page is: " + titleOfThePage);
			driver.findElement(By.linkText("Today's Deals")).click();
			String url = driver.getCurrentUrl();
			System.out.println("Url of the Page is: " + url);
			Thread.sleep(2000);
			driver.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		TestGetCommands myObj = new TestGetCommands();
		myObj.invokeBrowser();
	}

}

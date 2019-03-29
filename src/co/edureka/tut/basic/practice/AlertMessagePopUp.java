package co.edureka.tut.basic.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMessagePopUp {

	public static void main(String[] args) {

//		1. Alert PopUp (Accept and Dismiss)
//		2. File Upload PopUp (type =file, SendKeys(Path))
//		3. Browser Window PopUp [Advertisements PopUp {WindowHandler API = getWindowHandles()}]
//		
		System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@type = \"submit\" and @value =\"Go\"]")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		String text = alert.getText();
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct Alert Message");
		}
		else {
			System.out.println("Wrong Alert Message");
				
		}

		alert.accept();
		//alert.dismiss();
		
		driver.close();
		
	}

}

package co.edureka.tut.basic.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	//http://username:password@//url
	driver.get("ftp://username:password@107.180.51.31/public_html/nikis/index.html");
	driver.close();
	
	
	}
}
package co.edureka.tut.basic.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAccount {

	WebDriver driver;

	public void invokeBrowser() {

		try {
			
			
			System.setProperty("webdriver.chrome.driver", "E:\\Sele\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

			driver.get("https://www.gmail.com");
			driver.findElement(By.xpath("//input[@type =\"email\"]")).sendKeys("jaffagadu7@gmail.com");
			driver.findElement(By.className("CwaK9")).click();
			//
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type =\"password\"]")).sendKeys("9441144313");
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			
			String titleOfThePage = driver.getTitle();
			System.out.println("Title of the Page is:" +titleOfThePage);
			Thread.sleep(20000);
			driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
			driver.findElement(By.xpath("//div[@id =':cr' and @class='aoD hl']")).click();
//			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//			System.out.println("step1");
//			Thread.sleep(10000);
//			System.out.println("step2");
//			driver.findElement(By.xpath("//textarea[@id =':cy' and @class='vO']")).sendKeys("vsphanipavan@gmail.com");
//			System.out.println("step3");
			//driver.close();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		
		GmailAccount myObj = new GmailAccount();
		myObj.invokeBrowser();

	}

}

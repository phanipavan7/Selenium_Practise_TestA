package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//http://beust.com/eclipse/
//@BeforeMethod
//@test-1
//@AfterMethod
//
//@BeforeMethod
//@test-2
//@AfterMethod
//
//@BeforeMethod
//@test-3
//@AfterMethod

public class TestNGBasic {
	
	
	
	//pre-conditions --- starting with @Before
	
	@BeforeSuite//1
	public void setUp() {
		
		System.out.println("@BeforeSuite -------setup syste property for chrome");
		
	}
	
	@BeforeTest//2
	public void launchBrowser() {
		
		
		System.out.println("@BeforeTest-------Launch Chrome Browser");
	}
	
	@BeforeClass//3
	public void login() {
		
		System.out.println("@BeforeClass---------Login to app");
		
	}
	
	@BeforeMethod//4
	public void enterURL() {
		
		System.out.println("@BeforeMethod-------Enter URL");
		
	}
	
	//Test cases --- starting with Test
	@Test//5
	public void googleTitleTest() {
				
		System.out.println("@Test---------Google Title Test");
		
	}
	
	@Test//5
	public void searchTest() {
				
		System.out.println("@Test---------search google");
		
	}
	
	@Test//5
	public void googleLogoTest() {
				
		System.out.println("@Test----------google Logo Test");
		
	}
	
	
	//pre-conditions --- starting with @After
	
	@AfterMethod//6
	public void logout() {
		
		System.out.println("@AfterMethod----------logout from app");
		
	
	}
	
	
	@AfterClass//7
	public void closeBrowser() {
		
		System.out.println("@AfterClass--------close browser");
		
	}
	
	@AfterTest//8
	public void deleteAllCookies() {
		
		System.out.println("@AfterTest----------Login method");
		
	}
	
	@AfterSuite//9
	public void generateTestReports() {
		
		System.out.println("@AfterSuite--------Generate Test Report");
		
	}
}
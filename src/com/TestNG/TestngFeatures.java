package com.TestNG;

import org.testng.annotations.Test;

public class TestngFeatures {
	
	
	@Test
	public void loginTest() {
		
		System.out.println("Login");
		int i = 9/1;
	}
	
	@Test(dependsOnMethods ="loginTest")
	public void homePageTest() {
		
		System.out.println("homePageTest");
	}

	
	@Test(dependsOnMethods ="homePageTest")
	public void searchPageTest() {
		
		System.out.println("searchPageTest");
	}

	
	@Test(dependsOnMethods ="searchPageTest")
	public void regPageTest() {
		
		System.out.println("regPageTest");
	}


}

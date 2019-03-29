package com.TestNG;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
//	@Test(timeOut = 2)
	@Test(invocationTimeOut = 2)
	public void infiniteLoopTest() {
		
		int a = 10;
		while(a==1) {
		
			System.out.println("sum is .." +a);
		}


	}
}
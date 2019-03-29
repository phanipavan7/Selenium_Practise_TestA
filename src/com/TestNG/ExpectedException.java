package com.TestNG;

import org.testng.annotations.Test;

public class ExpectedException {
	
	
//	@Test(invocationTimeOut = 2,expectedExceptions= NumberFormatException.class )
//	public void infiniteLoopTest() {
//		
//		int a = 10;
//		while(a==1) {
//		
//			System.out.println("sum is .." +a);
//		}
//
//
//	}
	
	@Test(expectedExceptions= NumberFormatException.class)
	public void infiniteLoopTest() {
		
			String x = "100A";
			Integer.parseInt(x);
		}


}


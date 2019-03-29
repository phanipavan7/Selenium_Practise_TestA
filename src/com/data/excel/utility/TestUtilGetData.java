package com.data.excel.utility;

import java.util.ArrayList;

public class TestUtilGetData {
	
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel() { 
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
//			reader = new Xls_Reader("E:\\Sele\\Excel\\emailLogin.xlsx");
			reader = new Xls_Reader("E:\\Sele\\Excel\\emaillist.xlsx");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
//		for (int rowNum =2; rowNum<= reader.getRowCount("EmailLogin"); rowNum++) {
//			
//			String emailId = reader.getCellData("EmailLogin", "emailId", rowNum);
//			String password = reader.getCellData("EmailLogin", "password", rowNum);
//			
//			Object ob[] = {emailId, password};
//			myData.add(ob);
//		}
		
		for (int rowNum =2; rowNum<= reader.getRowCount("gmailEmails"); rowNum++) {
			
			String emailId = reader.getCellData("gmailEmails", "emailId", rowNum);
			String password = reader.getCellData("gmailEmails", "password", rowNum);
			
			Object ob[] = {emailId, password};
			myData.add(ob);
		}
		
		return myData;
	}

}
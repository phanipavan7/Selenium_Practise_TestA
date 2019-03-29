package com.data.driven.test;

import com.data.excel.utility.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {
		
		
		Xls_Reader reader = new Xls_Reader("E:\\Sele\\Excel\\DataDriven.xlsx");
//		reader.addSheet("HomePage");
		
		
		if(!reader.isSheetExist("HomePage")) {
			reader.addSheet("HomePage");
			
		}
		
		int colCount = reader.getColumnCount("RegData");
		System.out.println("Total cols present in the Registration sheet: ==== " +colCount);
		
		System.out.println(reader.getCellRowNum("RegData", "firstname", "Tom"));
	}

}

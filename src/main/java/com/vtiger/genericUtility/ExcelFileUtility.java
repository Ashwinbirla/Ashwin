package com.vtiger.genericUtility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	public String getDataFromExcel(String sheetname,int rownum,int cellnum) throws Throwable {
		FileInputStream fise=new FileInputStream(Iconstantpaths.excelpath);
	    Workbook wb = WorkbookFactory.create(fise);
	return    wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	    
		
	}
	
	}


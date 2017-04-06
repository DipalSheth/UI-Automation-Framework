package com.sheth.util;

import java.io.FileInputStream;
import java.io.IOException; 
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	static Logger logger = LogManager.getLogger(ExcelUtil.class);
	public static Object[][] getExcelData(String fileName, String sheetName){
		Object[][] data=null;
		XSSFWorkbook wb=null;;
		try {
			//loading excel file into java XSSFworkbook object
			 wb = new XSSFWorkbook( new FileInputStream(Constants.PATH+ "/test-data/" +fileName));
			
		    //get required sheet from excel
			XSSFSheet sheet = wb.getSheet("login");
			int rows = sheet.getLastRowNum();//gives no of row
			data = new Object[rows][];
            logger.info("no of rows:"+rows);
			
			for(int i=1;i<=rows;i++){
				XSSFRow row = sheet.getRow(i);
				int noOfcols = row.getLastCellNum();//gives no of col
				logger.info("no of cols:"+noOfcols);
				String[] colData =  new String[noOfcols];
				
				for(int j=0;j<noOfcols;j++){
					System.out.println(row.getCell(j));
					colData[j] = row.getCell(j).toString();
				}
				data[i-1]=colData;
			}
			
		} catch (IOException e) { 			
			logger.error("File not found-please give valid info"+e);
		}finally{
			try {
				//if(null!=wb){
				wb.close();
				
				
			} catch (IOException e) { 				
				logger.error(e);
			}
		}
		
		return data;
		
	}

	
}

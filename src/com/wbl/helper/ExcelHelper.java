package com.wbl.helper;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {
	
	
	public static Object[][] getdata(String filename){
		Object[][] data=null;
		XSSFWorkbook wb=null;
		try {
			 wb =new XSSFWorkbook(new FileInputStream(filename)) ;
			XSSFSheet sheet= wb.getSheet("testData");
			
			int rows=sheet.getLastRowNum();
			data=new Object[rows][];
			
			for(int i=1;i<=rows;i++){
				XSSFRow row=sheet.getRow(i);
				int cols=row.getLastCellNum();
				String[] coldata=new String[cols];
				
				for(int j=0;j<cols;j++){
					coldata[j]=row.getCell(j).getStringCellValue();
					}
				data[i-1]=coldata;
			}
			
			
		}  catch (IOException e) {
				e.printStackTrace();
		} finally{
			try { if(null!=wb)
				wb.close();
			} catch (IOException e) {
						e.printStackTrace();
			}
		}

		
		 	
		
		return data;
	}

}

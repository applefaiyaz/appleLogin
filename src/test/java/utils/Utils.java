package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Utils {
	
	@Test
	public static void path() {
		
	
	
	String excelpath="/Users/faiyazkhan/Downloads/Testng/rest/data/Book1.xlsx";

try {
	XSSFWorkbook workbook = new XSSFWorkbook(excelpath);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	
	DataFormatter formatter=new DataFormatter();
	Object s=formatter.formatCellValue(sheet.getRow(1).getCell(2));
	
	
	//String s=sheet.getRow(0).getCell(1).getStringCellValue();
	
	System.out.println(s);
} catch(Exception e){
	e.printStackTrace();
}
	
}
}

package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test
	
	public void Book() throws IOException {
		
	
	try
	{
		File r = new File("C:\\Users\\gaparun\\eclipse-workspace\\QtreeTech\\Book1\\Book1.xlsx");
		
		FileInputStream f = new FileInputStream(r);
		
		XSSFWorkbook xsf = new XSSFWorkbook(f);
		
		XSSFSheet sheet = xsf.getSheetAt(0);
		
		String country = sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(country);
		
		xsf.close();

	}
	catch(Exception e)
	{
		System.out.println(e.getStackTrace());
	}
	
}
}


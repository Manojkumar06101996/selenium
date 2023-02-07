package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDataFromExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./testdata/Book1.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String CustomerName = cell.getStringCellValue();
		System.out.println("Customer name : "+CustomerName);
		
		String projectname = row.getCell(1).toString();
		System.out.println("The Project name : "+projectname);
		
		boolean status = row.getCell(3).getBooleanCellValue();
		System.out.println("the marrital status is : "+status);
		
	double phonenumber = row.getCell(2).getNumericCellValue();
	
	System.out.println("Phone no is : "+phonenumber);
	System.out.println("-----------------------");
	System.out.println("Customer 2 is : "+sheet.getRow(3).getCell(0).toString());	
	
	
	
		
		
		

	}

}

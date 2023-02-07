package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToWriteData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./testdata/Book1.xlsx"); 
		Workbook workbook = WorkbookFactory.create(fis);	
		
		Sheet sheet = workbook.getSheet("Sheet1");
		sheet.createRow(4).createCell(0).setCellValue("Avi");
		sheet.getRow(4).createCell(1).setCellValue("IBM");
		sheet.getRow(4).createCell(2).setCellValue(1234567890);
		FileOutputStream fos = new FileOutputStream("./testdata/Book1.xlsx");
		workbook.write(fos);
		System.out.println("File Updated");

	}

}

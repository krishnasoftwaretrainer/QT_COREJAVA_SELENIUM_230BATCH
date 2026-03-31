package workingWithExcelFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream filein = new FileInputStream(
				"D:\\QT\\QT_Selenium_230Batch\\ExcelTestData\\WriteSingleCell.xlsx");

	XSSFWorkbook workbook = new XSSFWorkbook(filein);
	//XSSFSheet sheet1 = workbook.getSheet("TestData");
	XSSFSheet sheet1 = workbook.getSheetAt(0);
	XSSFRow row = sheet1.getRow(0);
	//String celldata=row.getCell(3).getStringCellValue();
	//double celldata=row.getCell(3).getNumericCellValue();
	int celldata=(int) row.getCell(4).getNumericCellValue();
	
	System.out.println(celldata);
	workbook.close();

	}

}

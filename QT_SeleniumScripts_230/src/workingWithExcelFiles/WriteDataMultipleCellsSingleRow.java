package workingWithExcelFiles;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataMultipleCellsSingleRow {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1 = workbook.createSheet("EmpData");

		XSSFRow row1 = sheet1.createRow(0);
		XSSFCell cell00 = row1.createCell(0);
		XSSFCell cell01 = row1.createCell(1);
		XSSFCell cell02 = row1.createCell(2);
		XSSFCell cell03 = row1.createCell(3);

		cell00.setCellValue("EmpID");
		cell01.setCellValue("EmpName");
		cell02.setCellValue("EmpDept");
		cell03.setCellValue("EmpSal");
		// Row 2
		XSSFRow row2 = sheet1.createRow(1);
		XSSFCell cell10 = row2.createCell(0);
		XSSFCell cell11 = row2.createCell(1);
		XSSFCell cell12 = row2.createCell(2);
		XSSFCell cell13 = row2.createCell(3);

		cell10.setCellValue(001);
		cell11.setCellValue("Krishna");
		cell12.setCellValue("Computers");
		cell13.setCellValue(85000);

		// Row 3
		XSSFRow row3 = sheet1.createRow(2);
		XSSFCell cell20 = row3.createCell(0);
		XSSFCell cell21 = row3.createCell(1);
		XSSFCell cell22 = row3.createCell(2);
		XSSFCell cell23 = row3.createCell(3);

		cell20.setCellValue(002);
		cell21.setCellValue("Ramesh");
		cell22.setCellValue("Accounts");
		cell23.setCellValue(55000);

		FileOutputStream fileout = new FileOutputStream(
				"D:\\QT\\QT_Selenium_230Batch\\ExcelTestData\\WriteDataMultipleCells.xlsx");
		workbook.write(fileout);

		System.out.println("Data written successfully");
		workbook.close();

	}

}

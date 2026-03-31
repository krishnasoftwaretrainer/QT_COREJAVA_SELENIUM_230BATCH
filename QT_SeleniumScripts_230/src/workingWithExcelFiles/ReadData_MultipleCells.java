package workingWithExcelFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_MultipleCells {

	public static void main(String[] args) throws IOException {
		
		FileInputStream filein = new FileInputStream(
				"D:\\QT\\QT_Selenium_230Batch\\ExcelTestData\\SwagLoginTestData.xlsx");

	XSSFWorkbook workbook = new XSSFWorkbook(filein);
	XSSFSheet sheet1=workbook.getSheetAt(0);
	
	//for(int r=0;r<=sheet1.getPhysicalNumberOfRows();r++)
	for(int r=0;r<=sheet1.getLastRowNum();r++)  //0<2 1<2 2<2 F 4 Soft Code
	//for(int r=0;r<3;r++) //Hard coded value 0<3 1<3 2<3T 3<3 F
	{
		XSSFRow row=sheet1.getRow(r); //0 1 2 
		//for(int c=0;c<row.getPhysicalNumberOfCells();c++)  //5 2
		for(int c=0;c<row.getLastCellNum();c++)  //5 2
		//for(int c=0;c<4;c++)  //Hard coded value
		{
			String celldata=row.getCell(c).getStringCellValue();//00 01 02 03 10 11 12 13
			System.out.print(celldata+" || ");
		}
		System.out.println();
	}
		
		
	}

}

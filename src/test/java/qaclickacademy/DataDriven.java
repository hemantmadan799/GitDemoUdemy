package qaclickacademy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fl=new File("C:\\Hemant\\udemy\\selenium\\resources\\inputData\\mydata.xlsx");
		FileInputStream fis=new FileInputStream(fl);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sht;
		int sheets=wb.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(wb.getSheetName(i).equalsIgnoreCase("Sheet2")) {
				sht=wb.getSheetAt(i);
				Iterator<Row> rows=sht.iterator();
				Row activeRow=rows.next();
				Iterator<Cell> cells=activeRow.cellIterator();
//				while(cells.hasNext())
//				{
//					Cell cellValue=cells.next();
////					if(cellValue.getStringCellValue().equalsIgnoreCase("TestCases"))
////					{
////						 cellValue.getce
////					}
//					System.out.println(cellValue.getStringCellValue());
//						
//					
//				}
				while(rows.hasNext())
				{
					Row rowValue=rows.next();
//					if(cellValue.getStringCellValue().equalsIgnoreCase("TestCases"))
//					{
//						 cellValue.getce
//					}
					System.out.println(rowValue.getCell(0).getStringCellValue());
						
					
				}
			}
		}
			
	}

}

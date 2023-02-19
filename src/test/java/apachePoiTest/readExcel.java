package apachePoiTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel 
{
//	public void xcell() {
//
//		String pathOfFile= ("D:\\java\\Java\\FrameWork\\testData\\Book1.xlsx");
//		FileInputStream inputStream = new FileInputStream(pathOfFile);
//		XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
//		XSSFSheet sheet=  workbook.getSheet("Sheet1");
//		
//		int rws= sheet.getLastRowNum();
//		int clms= sheet.getRow(1).getLastCellNum();
//		int j=0;
//		for (int i=1;i<rws;i++)
//		{
//			XSSFRow row=sheet.getRow(i);
//			for(j=0;j<clms;j++)
//			{
//				XSSFCell cell= row.getCell(j);
//				System.out.println(cell);
//				String x=cell;
//				usernametxtbox.sendKeys(x);
//			}
//			j++;
//			XSSFCell cell= row.getCell(j);
//			System.out.println(cell);
////			passwordtxtbox.sendKeys();
//		}
//		
//	
//}
// 
 public static void main(String[] args) throws IOException {

	String pathOfFile= ("D:\\java\\Java\\FrameWork\\testData\\Book1.xlsx");
	FileInputStream inputStream = new FileInputStream(pathOfFile);
	XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
	XSSFSheet sheet=  workbook.getSheet("Sheet1");
	
	int rws= sheet.getLastRowNum();
	int clms= sheet.getRow(1).getLastCellNum();
	for (int i=0;i<rws;i++)
	{
		XSSFRow row=sheet.getRow(i);		
		for(int j=0;j<clms;j++)
		{
			XSSFCell cell= row.getCell(j);
//			System.out.println(cell);
			switch (cell.getCellType())
			{
			case STRING 	: 	System.out.print(cell.getStringCellValue()); 		break;
			case BOOLEAN	:	System.out.print(cell.getBooleanCellValue());		break;
			case NUMERIC 	:	System.out.print(cell.getNumericCellValue()); 		break;
			}
			System.out.print("	|	");
		}
		System.out.println("	");
	}}
}
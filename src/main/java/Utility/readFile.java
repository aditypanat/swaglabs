package Utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readFile 
{
	public static String readProperty(String value) throws Exception
	{
		Properties prop= new Properties();
		FileInputStream file= new FileInputStream("D:\\java\\Java\\FrameWork\\testData\\config.property");
		prop.load(file);
		return prop.getProperty(value);
	}
	
	public static String readExcel(int row, int clm) throws Exception
	{
		FileInputStream file=new FileInputStream("D:\\java\\Java\\FrameWork\\testData\\Book2.xlsx");
		Sheet excel= WorkbookFactory.create(file).getSheet("Sheet1");
		String value= excel.getRow(row).getCell(clm).getStringCellValue();
		return value;
	}
}

package Pages;

import org.openqa.selenium.By;
//import java.io.IOException;
//
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.readFile;

public class loginPage extends TestBase
{
	@FindBy(xpath="//div[@class='login_logo']") private WebElement page1logo1;
	@FindBy(xpath="//div[@class='bot_column']") private WebElement page1logo2;
	@FindBy(xpath="//input[@id='user-name']") public  WebElement usernametxtbox;
	@FindBy(xpath="//input[@id='password']") public  WebElement passwordtxtbox;
	@FindBy(xpath="//input[@id='login-button']") public  WebElement loginbtn;
	
	@FindBy(xpath="//span[text()='Products']") public  WebElement label;
		
	 public loginPage()
	 {
		PageFactory.initElements(driver, this);
	 }
	 
	 public  String loginPageTask1() throws Exception
		{
			usernametxtbox.sendKeys(readFile.readProperty("username"));
			passwordtxtbox.sendKeys(readFile.readProperty("password"));
			loginbtn.click();
			return label.getText();	
		}
	
	public String verifyTitle()
		{
			return driver.getTitle();
		}
	
	public String verifyURL()
		{
			return driver.getCurrentUrl();
		}
		
 
//	 public void xcelfile() throws IOException 
//	 {
//
//			String pathOfFile= ("D:\\java\\Java\\FrameWork\\testData\\Book1.xlsx");
//			FileInputStream inputStream = new FileInputStream(pathOfFile);
//			XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
//			XSSFSheet sheet=  workbook.getSheet("Sheet1");
//			
//			int rws= sheet.getLastRowNum();
//			int clms= sheet.getRow(1).getLastCellNum();
//			
//			for (int i=1;i<rws;i++)
//			{
//				XSSFRow row=sheet.getRow(i);
//				for(int j=0;j<clms;j++)
//				{
//					XSSFCell cell= row.getCell(j);
////					String x=cell;
//					usernametxtbox.sendKeys(cell);
//				}
//				XSSFCell cell= row.getCell(j);
//				System.out.println(cell);
////				passwordtxtbox.sendKeys();
//			}
//	 }
	
	public boolean verifyLogo()
	{
		boolean Logo= driver.findElement(By.xpath("//div[@class='login_logo']")).isDisplayed();
//		System.out.println(Logo);
//		boolean Logo= driver.findElement(By.xpath("//a[@class='navbar-brand mr-0']")).isDisplayed();
		return Logo;
	}
	
}


package Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.inventoryPage;
import Utility.readFile;

public class inventoryPageTest extends inventoryPage
{
	inventoryPage inventory;
	@BeforeMethod (alwaysRun= true)
	public void setup() throws Exception		
	{		
		initialization();
		inventory = new inventoryPage();
	}
	
					
					@Test (groups= "sanity")
					public void inventoryTest2() throws Exception
					{
						inventory.loginPageTask1();
						String act=inventory.InventoryPageTask2();
						assertEquals(act, "3");
					}
					
					@Test (groups= "regression")
					public void inventoryTest1() throws Exception
					{
						inventory.loginPageTask1();
						String actual= inventory.InventoryPageTask1();
						System.out.println(readFile.readExcel(2, 0));
						assertEquals(actual, readFile.readExcel(2, 0));
					}
					
	@AfterMethod (alwaysRun= true)
	public void closebrowser(ITestResult it) throws IOException
	{
		if(ITestResult.FAILURE==it.getStatus())
		{
			Utility.screenshot.captureScreenshot(it.getName());
		}
		driver.close();
	}

}
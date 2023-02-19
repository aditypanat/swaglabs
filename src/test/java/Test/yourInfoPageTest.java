package Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.yourInfoPage;


public class yourInfoPageTest extends yourInfoPage
{
	yourInfoPage yourinfo;
	
	@BeforeMethod (alwaysRun= true)
		public void setup() throws Exception
		{ 
			initialization();
			yourinfo= new yourInfoPage();
		}
					
					@Test(priority=1, groups= "smoke")
					public void loginTest1() throws Exception
						{
							String actual1= yourinfo.loginPageTask1();
							assertEquals(actual1, "PRODUCTS");
						}
					
					@Test(enabled=true,groups= "sanity")
					public void inventoryTest1() throws Exception
					{
							yourinfo.loginPageTask1();
							String actual2=yourinfo.InventoryPageTask1();
							assertEquals(actual2, "YOUR CART");
						}
						
					@Test(priority=3, groups= "functional")
					public void yourCartTest1() throws Exception
						{
							yourinfo.loginPageTask1();
							yourinfo.InventoryPageTask1();
							String actuall3= yourinfo.yourCartPageTask1();
							assertEquals(actuall3, "CHECKOUT: YOUR INFORMATION");
						}
					
					@Test(priority=2,groups= "regression")
					public void yourInfoPageTest1() throws Exception 
						{
							yourinfo.loginPageTask1();
							yourinfo.InventoryPageTask1();
							yourinfo.yourCartPageTask1();
							String actuall4=yourinfo.yourInfoPageTask1();
							assertEquals(actuall4, "CHECKOUT: OVERVIEW");
						}
	
	@AfterMethod (alwaysRun= true)
	public void closeBrowser(ITestResult it) throws IOException
	{
		if(ITestResult.FAILURE==it.getStatus())
		{
			Utility.screenshot.captureScreenshot(it.getName());
		}
		driver.close();
	}
}

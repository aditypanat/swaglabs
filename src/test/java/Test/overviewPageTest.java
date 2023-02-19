package Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.overviewPage;


public class overviewPageTest extends overviewPage 
{

	overviewPage overview;
	
	@BeforeMethod (alwaysRun= true)
	 public void setup() throws Exception
	 {
		 initialization();
		 overview = new overviewPage();
		 
	 }
	
					@Test(enabled=true,groups= "sanity")
					 
					public void overviewPageTest1() throws Exception
					{
						overview.loginPageTask1();
						overview.InventoryPageTask1();
						overview.yourCartPageTask1();
						overview.yourInfoPageTask1();
						
						String Thanku= overview.overviewPageTask1();
				//		System.out.println(productList);
						
						assertEquals(Thanku, "THANK YOU FOR YOUR ORDER");
					}
					
					@Test (groups= "regression")
					public void overviewPageTest2() throws Exception
					{
				
						overview.loginPageTask1();
						overview.InventoryPageTask1();
						overview.yourCartPageTask1();
						overview.yourInfoPageTask1();
						overview.overviewPageTask2();
					}
	@AfterMethod (alwaysRun= true)
	
	public void closeBrowser()
	{
		driver.close();
	}

}

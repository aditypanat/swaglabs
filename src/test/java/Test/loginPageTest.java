package Test;

import static org.testng.Assert.assertEquals;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Pages.loginPage;
import Utility.readFile;

public class loginPageTest extends loginPage

{
	loginPage login;
	
@BeforeMethod (alwaysRun= true)
		public void setup() throws Exception
		{
			initialization();
			login=new loginPage();
		}
				
				@Test(enabled=true, /*dependsOnMethods="verifyTitleTest",*/ groups= {"sanity","smoke","regression"})
					public void loginTest1() throws Exception
					{
				
						String actual=login.loginPageTask1();
						assertEquals(actual,readFile.readExcel(1, 0));
						Reporter.log("Intentionally passed verifyTitleTest case");
					}
				
				
				@Test /*(dependsOnMethods= "loginTest1")*/ (groups= "sanity")
						public void verifyTitleTest() throws Exception   
						{
							String actTitle= verifyTitle();
							assertEquals(actTitle, readFile.readExcel(1, 1));
				//			assertTrue(false, "Intentionally failed verifyTitleTest case");
							Reporter.log("Intentionally failed verifyTitleTest case");
						}
				@Test /*(dependsOnMethods= "loginTest1()")*/ (groups= "smoke")
						public void verifyURLTest() throws Exception 
						{
					
							SoftAssert s= new SoftAssert();
							String actURL= verifyURL();
							s.assertEquals(actURL, readFile.readExcel(1, 2));
							s.assertFalse(true);
							Reporter.log("Intentionally failed verifyURLTest case");
							
						}
				@Test	(enabled= true, groups= "regression")
						public void verifyLogoTest()
						{
					
							boolean r= verifyLogo();
							assertEquals(r, true);
						}
					

@AfterMethod (alwaysRun= true)
		public void closeBrowser(ITestResult it) throws Exception
		{
			if(ITestResult.FAILURE== it.getStatus())
			{
				Utility.screenshot.captureScreenshot(it.getName());
			}
//			Thread.sleep(3000);
			driver.close();
		}



}

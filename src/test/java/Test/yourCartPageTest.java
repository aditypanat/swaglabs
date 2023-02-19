package Test;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.yourCartPage;

public class yourCartPageTest extends yourCartPage
{
	 yourCartPage yourCart;	
	
	@BeforeMethod (alwaysRun= true)
		public void setup() throws Exception
		{
			initialization();
		
			yourCart=new yourCartPage();
		}
					
					@Test (groups= "sanity")
						public void loginTest1() throws Exception
						{
							String actual=yourCart.loginPageTask1();
							assertEquals(actual, "PRODUCTS");
						}
					
					
					@Test (groups= "smoke")
						public void addInventoryTest() throws Exception
						{
							yourCart.loginPageTask1();
							String actual= yourCart.InventoryPageTask1();
							assertEquals(actual, "YOUR CART");
						}
					
					@Test(groups= {"functional" ,"regression"})
						public void yourCartTest1() throws Exception
						{ 
							yourCart.loginPageTask1();
							yourCart.InventoryPageTask1();
							String actual= yourCart.yourCartPageTask1();
							assertEquals(actual, "CHECKOUT: YOUR INFORMATION");
						}

	@AfterMethod (alwaysRun= true)
		public void closeBrowser()
		{
			driver.close();
		}
}

package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class inventoryPage extends loginPage
{
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement jacket1;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement jacket2;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']") private WebElement jacket3;
	@FindBy(xpath="//div[@id='shopping_cart_container']") private WebElement cartbtn;
@FindBy(xpath="//select[@class='product_sort_container']")private WebElement sortbtn;

@FindBy(xpath="//span[@class='shopping_cart_badge']")private WebElement noOfProduct;
	
	@FindBy(xpath="//span[@class='title']") private WebElement yourcartlabel;
	
	public inventoryPage()
		{
			PageFactory.initElements(driver, this);
		}
	

	public String InventoryPageTask1() throws Exception
		{
			 jacket1.click();
			 jacket2.click();
			 jacket3.click();
//			 sortbtn.click();
			 Select s= new Select(sortbtn);
			 s.selectByVisibleText("Price (low to high)");
			 cartbtn.click();
			 return yourcartlabel.getText();
		}
	public String InventoryPageTask2()
	{
		 jacket1.click();
		 jacket2.click();
		 jacket3.click();
		 return noOfProduct.getText();
		 
	
	}
}

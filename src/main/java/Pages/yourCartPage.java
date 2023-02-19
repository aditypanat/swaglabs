package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yourCartPage extends inventoryPage
{
@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']") private WebElement removebtn;
@FindBy(xpath="//button[@id='continue-shopping']") private WebElement continueshoppingbtn;
@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement addtocartbtn;
@FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement cartbtn;
@FindBy(xpath="//button[@id='checkout']") private WebElement checkoutbtn;

@FindBy(xpath="//span[@class='title']") private WebElement checkoutlabel;

public yourCartPage()
{
	PageFactory.initElements(driver, this );
}

public String yourCartPageTask1() throws Exception
{
	removebtn.click();
	continueshoppingbtn.click();
	addtocartbtn.click();
	cartbtn.click();
	checkoutbtn.click();
	return checkoutlabel.getText();
}







}

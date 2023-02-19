package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yourInfoPage  extends yourCartPage
{

	@FindBy(xpath="//input[@id='first-name']") private WebElement firstnametxtbox;
	@FindBy(xpath="//input[@id='last-name']") private WebElement lastnametxtbox;
	@FindBy(xpath="//input[@id='postal-code']") private WebElement zipcodetxtbox;
	@FindBy(xpath="//input[@id='continue']") private WebElement continuebtn;
	
	@FindBy(xpath="//span[@class='title']") private WebElement overviewlabel;
	
	public yourInfoPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String yourInfoPageTask1()
	{
		firstnametxtbox.sendKeys("ADITYA");
		lastnametxtbox.sendKeys("PANAT");
		zipcodetxtbox.sendKeys("442401");
		continuebtn.click();
		
		return overviewlabel.getText();
	}
}

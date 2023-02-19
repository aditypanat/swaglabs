package Pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class overviewPage extends yourInfoPage
{
@FindBy(xpath="//div[@class='cart_list']")private WebElement productNames;

//@FindBy(xpath="//div[text()='Payment Information:']")private WebElement paymentInfo;
//@FindBy(xpath="//div[text()='SauceCard #31337']")private WebElement paymentInfoDetails;
//@FindBy(xpath="//div[text()='Shipping Information:']")private WebElement shippingInfo;
//@FindBy(xpath="//div[text()='FREE PONY EXPRESS DELIVERY!']")private WebElement shippingInfoDetails;
//@FindBy(xpath="//div[@class='summary_total_label']")private WebElement productCost;

@FindBy(xpath="//button[text()='Finish']")private WebElement finishButton;
@FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']") private WebElement thankyouLogo;
@FindBy(xpath="//div[@id='checkout_complete_container']") private WebElement finallogo;


 public overviewPage()
 {
	 PageFactory.initElements(driver, this);
 }
 
 public String overviewPageTask1() throws Exception
 {
//	 my mistakes
//	 loginPageTask1();
//	 InventoryPageTask1();
//	 yourCartPageTask1();
//	 yourInfoPageTask1();
	 
	 String productnames= productNames.getText();
	 System.out.println(productnames);
	 finishButton.click();
	 return thankyouLogo.getText();
 }
 
 public void overviewPageTask2() throws IOException
 {
	 String productnames= productNames.getText();
	 System.out.println(productnames);
	 finishButton.click();
	 
	 
	 
	 
	 
//	 
//	 Date d= new Date();
//	 String dnt= d.toString().replace(":","").replace(" ", "");
////	 System.out.println(dnt);
//	 File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
////	 System.out.println(source);
////	 File source1=finallogo.getScreenshotAs(OutputType.FILE);
//	 File dest= new File("D:\\java\\Java\\FrameWork\\screenshot\\sshott" +dnt+ ".png");
//	 FileHandler.copy(source, dest);
	
 }

}
 



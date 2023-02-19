package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.readFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
 public static WebDriver  driver;
	public void initialization() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("https://www.saucedemo.com/");
		driver.get(readFile.readProperty("url"));
		
		
	}
//new change
	
}
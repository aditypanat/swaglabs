package Utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class screenshot extends TestBase {

	 public static void captureScreenshot(String name) throws IOException
	 {
		 Date d= new Date();
		 String dnt= d.toString().replace(":","").replace(" ", "");
		 File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		 File source1=finallogo.getScreenshotAs(OutputType.FILE);
		 File dest= new File("D:\\java\\Java\\FrameWork\\screenshot\\"+name+"-"+dnt+".png");
		 FileHandler.copy(source, dest);
		
	 }

	
}

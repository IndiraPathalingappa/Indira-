package Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Takescreenshot extends Base_Test{
	public static void getshot(WebDriver driver) throws IOException{
		String Store="./photo/";
		Date d1 = new Date();
		String d2 = d1.toString();
		String date = d2.replaceAll(":", "-");
	  TakesScreenshot tss = (TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dst=new File(Store+date+".png");
		FileUtils.copyFile(src,dst);

	}
}

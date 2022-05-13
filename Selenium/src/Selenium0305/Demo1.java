package Selenium0305;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo1 {
	@Test
	public void test()
	{
		ExtentReports report=new ExtentReports("./Report/a.html");
		ExtentTest test=report.startTest("TC01");
		test.log(LogStatus.PASS,"pass");
		test.log(LogStatus.FAIL,"fail");
		test.log(LogStatus.SKIP,"skip");
		report.endTest(test);
		report.flush();
	}
}

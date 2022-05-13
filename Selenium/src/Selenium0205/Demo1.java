package Selenium0205;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Demo1 {
WebDriver driver;
@BeforeMethod
public void open()
{
	System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://www.youtube.com/watch?v=t0Q2otsqC4I");
}
@AfterMethod
public void close(){
	driver.close();
}

}

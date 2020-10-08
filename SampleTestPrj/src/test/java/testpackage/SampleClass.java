package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleClass {
	
	static WebDriver driver;
	
  @BeforeTest
  public static void browserSetup() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\munee\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
  
  }
  
  @Test(priority=0)
  public static void launchUrl() throws InterruptedException
  {
	  driver.get("https://www.google.com/");
	  Thread.sleep(3000);
  }
 
}

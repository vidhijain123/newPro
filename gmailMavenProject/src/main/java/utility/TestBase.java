package utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
 

public class TestBase {
  
  public static WebDriver driver = null;
  
  @BeforeSuite
  public   void initialize() throws IOException{
	  String exePath="C:\\Users\\user\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
  }
    
  @AfterSuite
 
  public void TeardownTest()
     {
         TestBase.driver.quit();
     }
  
}


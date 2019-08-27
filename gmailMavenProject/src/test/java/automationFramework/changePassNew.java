package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import appModules.signInChange;
import utility.Constant;
import utility.ExcelUtils;
import utility.TestBase;

public class changePassNew extends TestBase {
	public static WebDriver driver = null;

  @Test
  public void chanew() throws Exception {
	  
	  ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
      
	    driver = new ChromeDriver();

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    driver.get(Constant.URL);

	    signInChange.Execute(driver);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    WebElement gmailText=driver.findElement(By.xpath("//*[@id=\":2e\"]"));
	    String text=gmailText.getText();
	    try
	    {
	    if(text.equals("Primary"))
	    {
	    	System.out.println("Login Successfully");
	    }
	    else
	    {
	    System.out.println("Login was not Successfully");
	    }	
	    }
	    catch(Throwable e)
	    {
	    	System.out.println("Inbox link was found:"+e.getMessage());
	    }
	    
    
	  
}
@Test
public void fclose()
{   
	  Apache_POI_TC.driver.close();
}
}

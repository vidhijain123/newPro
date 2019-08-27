package autoFrameworkThird;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import appModules.SignInAction;
import junit.framework.Assert;
import utility.Constant;
import utility.ExcelUtils;
import utility.TestBase;

public class emailLog_TC extends TestBase {
  @Test
  public static void checklog() throws Exception {
	  ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
      
	    driver = new ChromeDriver();

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    driver.get(Constant.URL);

	    SignInAction.Execute(driver);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    WebElement gmailText=driver.findElement(By.xpath("//div[@class='nH']//table/tbody/tr[1]/td[1]/div/div//div/div/div[2]"));
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
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div/a/span")).click();
	    
	    WebElement ex=driver.findElement(By.xpath("//*[text()='Sign out']"));	
		Assert.assertEquals(true, ex.isDisplayed());
		System.out.println("Logout is visible");
		
	  
	  
  }
}

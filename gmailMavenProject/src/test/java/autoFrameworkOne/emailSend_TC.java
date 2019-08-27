package autoFrameworkOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import appModules.SignInAction;
import automationFramework.Apache_POI_TC;
import utility.Constant;
import utility.ExcelUtils;
import utility.TestBase;

public class emailSend_TC extends TestBase {
  
  @Test
  public void funcsend() throws Exception {
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
	  driver.findElement(By.xpath("//*[text()='Sent']")).click();
	  WebElement sendText=driver.findElement(By.xpath("//*[text()='Sent']"));
	  System.out.println("hjfg");
	    String textone=sendText.getText();
	    System.out.println(textone);
	    try
	    {
	    if(textone.equals("Sent"))
	    {
	    	System.out.println("Sent opens Successfully");
	    }
	    else
	    {
	    System.out.println("Sent doesn't open not Successfully");
	    }	
	    }
	    catch(Throwable e)
	    
	    {
	    	System.out.println("Sent link was found:"+e.getMessage());
	    }
	
	  
  }
}

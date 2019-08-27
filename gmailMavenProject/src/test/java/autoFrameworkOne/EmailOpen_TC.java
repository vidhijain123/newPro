package autoFrameworkOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import appModules.SignInAction;
import utility.Constant;
import utility.ExcelUtils;
import utility.TestBase;

public class EmailOpen_TC extends TestBase {
	
private static WebDriver driver = null;
  @Test
  public static void testsix() throws Exception  {
	  
	  ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
      
	    driver = new ChromeDriver();

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    driver.get(Constant.URL);

	    SignInAction.Execute(driver);
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
	  
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@class='Cp']//table/tbody/tr[2]/td[5]/div[2]")).click();
    System.out.println("Newly recieved email is opened");
	  String  myText=driver.findElement(By.xpath("//div[@class='nH']//table/tr/td/div//div[2]/div/h2")).getText();
	  System.out.println("total:" +myText);
       System.out.println("Email Content is opened");
	  	
       
		
		// WebElement eg=driver.findElement(By.linkText("TestData (1).xlsx")); String
		  //ex=eg.getText(); Assert.assertTrue(ex.equals("TestData (1).xlsx"
		  //),"Download file is not matching with the expected file");
		  //System.out.println("Downloadable");
		 

	  
  }
}

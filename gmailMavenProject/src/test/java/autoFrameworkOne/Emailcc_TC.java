package autoFrameworkOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import appModules.SignInAction;
import autoFrameworkOne.EmailOpen_TC;
import utility.Constant;
import utility.ExcelUtils;
import utility.TestBase;


public class Emailcc_TC extends TestBase {
	
  @Test
  public static void testeight() throws Exception {
	 
	  ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
      
	    driver = new ChromeDriver();

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    driver.get(Constant.URL);

	    SignInAction.Execute(driver);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    WebElement gmailText=driver.findElement(By.xpath("//*[text()='Primary']"));
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
	driver.findElement(By.xpath("//div[@class='Cp']//table/tbody/tr[4]/td[5]/div[2]")).click();
     System.out.println("recieved email is opened");
	
	  
		  WebElement eg=driver.findElement(By.linkText("TestData (1).xlsx")); 
		  String ex=eg.getText(); 
		  Assert.assertTrue(ex.equals("TestData (1).xlsx"),"Download file is not matching with the expected file");
		  System.out.println("Downloadable");
		 
	  }
	  
	  
	}
  
  
  


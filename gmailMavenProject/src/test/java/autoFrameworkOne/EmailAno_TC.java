package autoFrameworkOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import appModules.SignInAction;
import junit.framework.Assert;
import utility.Constant;
import utility.ExcelUtils;
import utility.TestBase;

public class EmailAno_TC extends TestBase {
	private static WebDriver driver = null;
  @Test
  public void testnine() throws Exception {
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
	  
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@class='Cp']//table/tbody/tr[5]/td[5]/div[2]")).click();
    System.out.println("Recieved email is opened");
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    System.out.println("hiii");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    //WebElement exam=driver.findElement(By.xpath("//div[@class='gs']//table/tbody/tr[1]/td[1]/h3/span/span[2]/text()"));
    WebElement exam=driver.findElement(By.xpath("//*[text()='googlecommunityteam-noreply@google.com']"));
    Assert.assertEquals(true, exam.isDisplayed());
	System.out.println("Email from other mail Ids are allowed");

   
   
  }
}

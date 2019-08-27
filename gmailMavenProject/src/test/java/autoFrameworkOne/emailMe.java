package autoFrameworkOne;

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

public class emailMe extends TestBase{
  @Test
  public void send() throws Exception {
	  
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
	  
	   driver.findElement(By.xpath("//*[text()='Compose']")).click();
	   WebElement composeText=driver.findElement(By.xpath("//*[text()='New Message']"));
	    String textone=composeText.getText();
	    System.out.println(""+textone);
	    try
	    {
	    if(textone.equals("New Message"))
	    {
	    	System.out.println("Compose opens Successfully");
	    }
	    else
	    {
	    System.out.println("Compose doesn't open not Successfully");
	    }	
	    }
	    catch(Throwable e)
	    
	    {
  	System.out.println("Compose link was found:"+e.getMessage());
	    }
	    System.out.println("hiiii");
	    driver.findElement(By.xpath("//*[text()='To']"));
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//div[@class='fX aXjCH']//table/tbody/tr[1]/td[2]/div[1]/div/textarea")).sendKeys("vidhij220@gmail.com");
	    driver.findElement(By.xpath("//div[@class='aoD az6']/div/input")).sendKeys("Regard Test"); 
	    driver.findElement(By.xpath("//*[text()='Send']")).click();
	    System.out.println("Email send to me");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@class='Cp']//table/tbody/tr[1]/td[5]/div[2]")).click();
	    Thread.sleep(3000);
	    WebElement button=driver.findElement(By.xpath("//span[text()='vidhij220@gmail.com']"));
		Assert.assertEquals(true, button.isDisplayed());
		System.out.println("Verified");
  }
}

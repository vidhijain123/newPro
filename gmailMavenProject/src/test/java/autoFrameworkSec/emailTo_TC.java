package autoFrameworkSec;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import appModules.SignInAction;
import utility.Constant;
import utility.ExcelUtils;
import utility.TestBase;

public class emailTo_TC extends TestBase {
  @Test
  public static void testelven() throws Exception {
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
	    driver.findElement(By.xpath("//div[@class='fX aXjCH']//table/tbody/tr[1]/td[2]/div[1]/div/textarea")).sendKeys("vidhijain372@gmail.com");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	    driver.findElement(By.xpath("//*[text()='Cc']")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//div[@class='fX aXjCH']//table/tbody/tr[2]/td[2]/div[1]/div/textarea")).sendKeys("vidhijain372@gmail.com");
	    driver.findElement(By.xpath("//*[text()='Bcc']")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//div[@class='fX aXjCH']//table/tbody/tr[3]/td[2]/div[1]/div/textarea")).sendKeys("vidhijain372@gmail.com");
	    driver.findElement(By.xpath("//div[@class='aoD az6']/div/input")).click();
	    System.out.println("Hii");
	    driver.findElement(By.xpath("//div[@class='aoD az6']/div/input")).sendKeys("Regarding Test");
	    System.out.println("To entered");
	   	Thread.sleep(5000);			
	

	  
  }
}

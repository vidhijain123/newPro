package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;
import utility.TestBase;

public class EmailPassBlank_TC extends TestBase{
  @Test
  public void testfour() throws Exception{
	  
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		WebElement button=driver.findElement(By.xpath("//*[@id=\"headingText\"]/span"));
		Assert.assertEquals(true, button.isDisplayed());
		System.out.println("SignIn text is visible");
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
		    	System.out.println("Email and Password Field are blank");
		    	System.out.println("Element was found:"+e.getMessage());
		    } 
		    driver.quit();
	  
  }
  
}

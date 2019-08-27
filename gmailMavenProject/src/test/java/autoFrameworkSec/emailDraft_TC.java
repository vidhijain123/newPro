package autoFrameworkSec;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;
import utility.TestBase;

public class emailDraft_TC  extends TestBase{
  @Test
  public void draft() throws Exception
  {
	  
	  emailTo_TC.testelven();
	  Thread.sleep(5000);
	  System.out.println("hello");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[text()='Drafts']")).click();
	  WebElement eg=driver.findElement(By.xpath("//*[text()='Regarding Test']"));	
	  Assert.assertEquals(true, eg.isDisplayed());
	  System.out.println("It is saved in Drafts");
	  String color=driver.findElement(By.xpath("//a[text()='Vidhi Jain']")).getCssValue("color");
	  String backcolor = driver.findElement(By.xpath("//a[text()='Vidhi Jain']")).getCssValue("background-color");
	  System.out.println(color);
	  System.out.println(backcolor); 
  }
}

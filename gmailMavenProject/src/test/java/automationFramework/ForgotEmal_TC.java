package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;
import utility.TestBase;


public class ForgotEmal_TC extends TestBase {
	
  @Test
  public  void testthree() {
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		WebElement ex=driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/span/div[3]/button"));	
		Assert.assertEquals(true, ex.isDisplayed());
		System.out.println("Forgot email Functionality is visible");
		driver.quit();
	  
	    
  }
}

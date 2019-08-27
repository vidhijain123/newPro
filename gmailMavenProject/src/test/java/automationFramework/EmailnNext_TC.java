package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;
import utility.TestBase;

public class EmailnNext_TC extends TestBase {

  @Test
  public void testOne() {
	  WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		WebElement ex=driver.findElement(By.id("identifierId"));	
		Assert.assertEquals(true, ex.isDisplayed());
		WebElement eg=driver.findElement(By.id("identifierNext"));	
		Assert.assertEquals(true, eg.isDisplayed());
		System.out.println("Email and Next option are visible");
		driver.quit();
 
}
}

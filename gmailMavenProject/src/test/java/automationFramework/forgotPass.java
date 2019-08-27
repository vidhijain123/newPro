package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;
import utility.TestBase;

public class forgotPass extends TestBase {
  @Test
  public void pass() throws Exception{
	  WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		WebElement element= driver.findElement(By.id("identifierId"));
		element.sendKeys("vidhij220@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierNext")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element1=driver.findElement(By.xpath("//*[text()='Forgot password?']"));
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(element1));
	    Assert.assertTrue( element1.isDisplayed());
	    System.out.println("Forgot Password Functionality is visible");
	   // vis.click();
	   // driver.close();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
}

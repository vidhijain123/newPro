package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utility.TestBase;

public class changePass extends TestBase {
  @Test
  public void chpass() throws Exception {
	  WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		WebElement element= driver.findElement(By.id("identifierId"));
		element.sendKeys("vidhij220@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierNext")).click();
		WebElement element1=driver.findElement(By.xpath("//*[text()='Forgot password?']"));
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(element1));
		element1.click();
	
		System.out.println("kjhgfd");
		
		WebElement element2=driver.findElement(By.xpath("//*[text()='Try another way']"));
		WebDriverWait wai = new WebDriverWait(driver,5);
		wai.until(ExpectedConditions.visibilityOf(element2));
		element2.click();
		
		WebElement element3= driver.findElement(By.id("phoneNumberId"));
		element3.sendKeys("7023557191");	
		//driver.findElement(By.xpath("//*[text()='Try another way']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Send']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
	    Thread.sleep(5000);    
		//WebElement element4= driver.findElement(By.xpath("//*[text()='Create password']"));//div[@class='AxOyFc snByac']/text()[1]"));
		//WebDriverWait wat = new WebDriverWait(driver,5);
		//wat.until(ExpectedConditions.visibilityOf(element4));
		//element4.click();
	    WebDriverWait w = new WebDriverWait(driver, 10);
	    WebElement ele = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Create password']")));
	    driver.findElement(By.xpath("//*[text()='Create password']")).sendKeys("vidhi1234");
	    Thread.sleep(5000);
	  //  driver.findElement(By.xpath("//*[text()='Create password']")).click();
		driver.findElement(By.xpath("//div[@id='confirm-passwd']//div[@class='AxOyFc snByac']/text()[1]")).click();
		Thread.sleep(20000);
  }
  
}

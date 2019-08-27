package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utility.TestBase;
import java.util.Base64;
//import org.apache.commons.codec.binary.Base64;



public class passEncrypt extends TestBase {
  @Test
  public void passEncry() {
	  
	   // String password="vidhi123";
	    //byte[] decodepassword;
		//byte[] encryptedPassword = Base64.encodeBase64("password".getBytes());
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		WebElement element= driver.findElement(By.id("identifierId"));
		element.sendKeys("vidhij220@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement element2=driver.findElement(By.id("identifierNext"));
		 //byte[] encodedBytes = Base64.encodeBase64("Password".getBytes());
		 //System.out.println("encodedBytes "+ new String(encodedBytes));
       
		 //element2.sendKeys(new String(encodedBytes));

	
	  
  }
}

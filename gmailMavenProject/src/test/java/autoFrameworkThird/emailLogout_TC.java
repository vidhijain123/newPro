package autoFrameworkThird;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utility.TestBase;

public class emailLogout_TC extends TestBase {
  @Test
  public void log() throws Exception {
	  emailLog_TC.checklog();
	  Thread.sleep(5000);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[text()='Sign out']")).click();
	  System.out.println("Sign out button is clicked");
  }
}

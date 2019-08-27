package autoFrameworkSec;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import appModules.SignInAction;
import utility.Constant;
import utility.ExcelUtils;
import utility.TestBase;



public class emailHigh_TC extends TestBase {
  @Test
  public void funchigh() throws Exception {
	  
	  ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
      
	    driver = new ChromeDriver();

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    driver.get(Constant.URL);

	    SignInAction.Execute(driver);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
		String color=driver.findElement(By.xpath("//*[text()='Check']")).getCssValue("color");
		String backcolor = driver.findElement(By.xpath("//*[text()='Check']")).getCssValue("background-color");
		System.out.println(color);
		System.out.println(backcolor);
		System.out.println("It is highlighted in color");
  }
}

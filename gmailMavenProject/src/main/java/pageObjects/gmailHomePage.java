package pageObjects;   
    import org.openqa.selenium.By;
 
    import org.openqa.selenium.WebDriver;
 
    import org.openqa.selenium.WebElement;
 
     public class gmailHomePage {
 
 private static WebElement element = null;
 
 public static WebElement myEmail(WebDriver driver){
 
    element = driver.findElement(By.id("identifierId"));
 
    return element;
 
    }
 
 public static WebElement nextButton(WebDriver driver){
 
    element = driver.findElement(By.id("identifierNext"));
 
 return element;
 
    }
 
 public static WebElement myPassword(WebDriver driver){
	 
	    element = driver.findElement(By.name("password"));
	 
	 return element;
	 
	    }
 public static WebElement myPasswordNext(WebDriver driver){
	 
	    element = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span"));
	 
	 return element;
	 
	    }
 }
 

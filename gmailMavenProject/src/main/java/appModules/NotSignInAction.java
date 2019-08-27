package appModules;

    import org.openqa.selenium.WebDriver;
    import pageObjects.gmailHomePage;
    import utility.ExcelUtils;

// Now this method does not need any arguments

public class NotSignInAction {

public static void ExecuteOne(WebDriver driver) throws Exception{

//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method

String sEmail = ExcelUtils.getCellData(2, 1);

String sPassword = ExcelUtils.getCellData(2, 2);

gmailHomePage.myEmail(driver).sendKeys(sEmail);
gmailHomePage.nextButton(driver).click();
gmailHomePage.myPassword(driver).sendKeys(sPassword);
gmailHomePage.myPasswordNext(driver).click();


    }

}


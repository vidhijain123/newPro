package appModules;

    import org.openqa.selenium.WebDriver;
    import pageObjects.gmailHomePage;
    import utility.ExcelUtils;

// Now this method does not need any arguments

public class SignInAction {

public static void Execute(WebDriver driver) throws Exception{

//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method

String sEmail = ExcelUtils.getCellData(1, 1);

String sPassword = ExcelUtils.getCellData(1, 2);

gmailHomePage.myEmail(driver).sendKeys(sEmail);
gmailHomePage.nextButton(driver).click();
gmailHomePage.myPassword(driver).sendKeys(sPassword);
gmailHomePage.myPasswordNext(driver).click();


    }

}


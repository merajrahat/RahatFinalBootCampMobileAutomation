package android.tests;

import android.pages.HomePage;
import android.pages.LoginPage;
import android.pages.ProductPage;
import com.peoplentech.finalbootcampmobileautomation.ExtentTestManager;
import com.peoplentech.finalbootcampmobileautomation.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegressionTests extends TestBase {

    @Test(enabled = false)
    public void validateUserCanClickOnAccountsButton() {
        HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);
        homePage.clickOnAccountsButton();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickBetweenButtonsFromHeader() {
        HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);
        LoginPage loginPage = PageFactory.initElements(getDriver(), LoginPage.class);


        homePage.clickOnAccountsButton();
        loginPage.clickOnBackButton();
        homePage.clickOnDepositBtton();
        loginPage.clickOnBackButton();
        homePage.clickOnPayAbillButton();
        loginPage.clickOnBackButton();

    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnProductButton() {
        ProductPage productPage = PageFactory.initElements(getDriver(), ProductPage.class);
        LoginPage loginPage = PageFactory.initElements(getDriver(), LoginPage.class);
        productPage.clickProductBtn();
        productPage.clickMortgageBtn();
        loginPage.clickOnBackButton();
        productPage.clickPersonalLoansBtn();
    }

    @Test (enabled = false)
    public void validateUserBeingAbleToScrollOnProductPage() {
        HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);
        ProductPage productPage = PageFactory.initElements(getDriver(), ProductPage.class);
        LoginPage loginPage = PageFactory.initElements(getDriver(), LoginPage.class);
        homePage.clickProductBtn();
        productPage.productPageDisplay();
        sleepFor(2);

        functionSwipe("up", 200, 500);
        sleepFor(2);
        functionSwipe("down", 200, 500);
        sleepFor(2);
        ExtentTestManager.captureScreenshot(getDriver(), "validateUserBeingAbleToScrollOnProductPage.png");
        sleepFor(2);
        productPage.clickCheckingAccount();
        sleepFor(2);
        productPage.clickOnCheckingAccountPage();
        sleepFor(2);
        ExtentTestManager.captureScreenshot(getDriver(), "validateUserBeingAbleToGoToCheckingAccountsPage.png");
        sleepFor(2);
        loginPage.clickOnBackButton();
        sleepFor(2);

    }

    @Test (enabled = false)
    public void validateClickOnTransferButtonWorks(){
        HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);
        LoginPage loginPage = PageFactory.initElements(getDriver(), LoginPage.class);
        homePage.clickOnTransferButton();
        loginPage.clickOnBackButton();
    }

    @Test
    public void validateClickOnSendMoneyButton(){
        HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);
        LoginPage loginPage = PageFactory.initElements(getDriver(), LoginPage.class);
        homePage.clickOnSendMoneyButton();
        loginPage.clickOnBackButton();
    }

}

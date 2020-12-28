package android.pages;

import com.peoplentech.finalbootcampmobileautomation.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "//android.widget.Button[@text='ACCOUNTS']")
    private WebElement accountBtn;

    @FindBy(xpath = "//android.widget.Button[@text='TRANSFER']")
    private WebElement transferBtn;

    @FindBy(xpath = "//android.widget.Button[@text='DEPOSIT']")
    private WebElement depositBtn;

    @FindBy(xpath = "//android.widget.Button[@text='SEND MONEY']")
    private WebElement sendMondyBtn;

    @FindBy(xpath = "//android.widget.Button[@text='PAY A BILL']")
    private WebElement payABillBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Products']")
    private WebElement clickOnProduct;

    @FindBy(xpath = "//android.widget.TextView[@text='Bill Pay']")
    private WebElement clickOnBillPay;


    public void clickOnAccountsButton() {
        accountBtn.click();
        ExtentTestManager.log("Clicked on Accounts");

    }

    public void clickOnTransferButton() {
        transferBtn.click();
        ExtentTestManager.log("Clicked On Transfer");

    }

    public void clickOnDepositBtton() {
        depositBtn.click();
        ExtentTestManager.log("Clicked on Deposite");

    }

    public void clickOnSendMoneyButton() {
        sendMondyBtn.click();
        ExtentTestManager.log("Clicked on Send Money");

    }

    public void clickOnPayAbillButton() {
        payABillBtn.click();
        ExtentTestManager.log("Clicked on Pay A Bill");

    }

    public void clickProductBtn() {
        clickOnProduct.click();
        ExtentTestManager.log("Clicked on product");
    }


}

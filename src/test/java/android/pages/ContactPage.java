package android.pages;

import com.peoplentech.finalbootcampmobileautomation.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {

    @FindBy(xpath = "//android.widget.TextView[@text='Contact us']")
    private WebElement clickOnContactUs;

    @FindBy(xpath = "//android.widget.TextView[@text='TD ASAPTM']")
    private WebElement clickOnTDASAPTM;

    @FindBy(xpath = "//android.widget.Button[@text='Continue call']")
    private WebElement clickOnContinueCall;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc='Call button']")
    private WebElement clickCallButton;


    public void userAbleToContactTDBank(){
        clickOnContactUs.click();
        ExtentTestManager.log("Clicked on Contact us");
        clickOnTDASAPTM.click();
        ExtentTestManager.log("Clicked on TD ASAPTM");
        clickOnContinueCall.click();
        ExtentTestManager.log("Clicked on Continue call");
        clickCallButton.click();
        ExtentTestManager.log("Clicked Call button");
    }
}

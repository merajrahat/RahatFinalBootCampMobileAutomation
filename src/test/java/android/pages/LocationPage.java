package android.pages;

import com.peoplentech.finalbootcampmobileautomation.ExtentTestManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocationPage {

    @FindBy(xpath = "//android.widget.TextView[@text='Locations']")
    private WebElement clickOnLocation;

    @FindBy(xpath = "//android.widget.Button[@text='Allow only while using the app']")
    private WebElement clickAllowApp;

    @FindBy(xpath = "//android.widget.EditText[@text='Enter zip or city/state']")
    private WebElement clickZipCodeButton;

    public void userAbleToCheckLocation(){
        clickOnLocation.click();
        ExtentTestManager.log("Clicked on Locations");
        clickAllowApp.click();
        ExtentTestManager.log("Clicked Allow only while using the app");
        clickZipCodeButton.sendKeys("11694",Keys.RETURN);
        ExtentTestManager.log("Entered ZipCode");
    }
}

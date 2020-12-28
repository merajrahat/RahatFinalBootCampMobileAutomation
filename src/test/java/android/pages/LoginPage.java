package android.pages;

import com.peoplentech.finalbootcampmobileautomation.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Go Back\"]")
    private WebElement backBtn;

    public void clickOnBackButton() {
        backBtn.click();
        ExtentTestManager.log("Back button pressed");

    }
}

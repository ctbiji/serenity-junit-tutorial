package seleniumeasy.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.Collection;

@DefaultUrl("https://demo.seleniumeasy.com/dynamic-data-loading-demo.html")
public class DynamicDataPage extends SeleniumEasyForms {

    private static final By USER_DETAILS_PANEL = By.id("loading");

    public void getNewUser() {
        $(FormButton.withLable("Get new user")).click();
        withTimeoutOf(Duration.ofSeconds(30))
                .waitFor(ExpectedConditions.invisibilityOfElementWithText(USER_DETAILS_PANEL,"loading..."));
    }

    public String userDescription(){
        return $(USER_DETAILS_PANEL).getText();
    }
}

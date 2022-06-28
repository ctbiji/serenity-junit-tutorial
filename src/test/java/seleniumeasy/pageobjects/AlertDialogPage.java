package seleniumeasy.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementState;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.commons.text.TextStringBuilder;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.Collection;

@DefaultUrl("https://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html")

public class AlertDialogPage extends SeleniumEasyForms {
    private static final By ALERT_SUCCESS_MESSAGE = By.className("alert-autocloseable-success");

    public void openSuccessMessage() {
        $("#autoclosable-btn-success").click();
    }

    public String alertSuccess() {
        return $(ALERT_SUCCESS_MESSAGE).getText();
            }

    public void waitForAlertMessageToDisappear() {
        withTimeoutOf(Duration.ofSeconds(10)).waitForElementsToDisappear(ALERT_SUCCESS_MESSAGE);
        waitForRenderedElementsToDisappear(ALERT_SUCCESS_MESSAGE);//waits for something to disappear for a fixed time as 5 sec
    }

    public WebElementState alertSuceessMessage() { return  $(ALERT_SUCCESS_MESSAGE); }
}

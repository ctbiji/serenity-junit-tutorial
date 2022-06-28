package seleniumeasy.pageobjects;

import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public abstract class SeleniumEasyForms extends PageObject {

    private static final By POPUP_WINDOW_CLOSE_ICON = By.cssSelector("a[title='close']");

    @WhenPageOpens
    public void clearPopupWindows(){
        if ($(POPUP_WINDOW_CLOSE_ICON).isPresent()){
            waitFor(visibilityOfElementLocated(POPUP_WINDOW_CLOSE_ICON)).click();
            waitFor(invisibilityOfElementLocated(POPUP_WINDOW_CLOSE_ICON));
        }
    }



}

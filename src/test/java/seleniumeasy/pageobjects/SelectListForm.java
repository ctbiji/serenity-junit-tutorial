package seleniumeasy.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.Collection;

@DefaultUrl("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html")

public class SelectListForm extends SeleniumEasyForms {
    private static final By DAYS_OF_WEEK = By.id("select-demo");

    public String selectedDay() {
        return $(DAYS_OF_WEEK).getSelectedValue();
    }

    public void selectDay(String day) {
//        $("#select-demo").selectByVisibleText(day);
          $(DAYS_OF_WEEK).select().byValue(day);
    }
}

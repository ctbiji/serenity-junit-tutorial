package seleniumeasy.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;

import java.util.Collection;

@DefaultUrl("https://demo.seleniumeasy.com/basic-radiobutton-demo.html")

public class MultipleRadioButtonForms extends SeleniumEasyForms {

    public void selectGenderOption(String value) {
        inRadioButtonGroup("gender").selectByValue(value);
    }

    public void selectAgeGroup(String value) {
        inRadioButtonGroup("ageGroup").selectByValue(value);
    }

    public void getvalue() {
        $(FormButton.withLable("Get values")).click();
    }

    public String getResults() {
        return $(".groupradiobutton").getText();
    }
}

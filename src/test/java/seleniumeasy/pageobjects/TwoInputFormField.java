package seleniumeasy.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.seleniumeasy.com/basic-first-form-demo.html")
public class TwoInputFormField extends SeleniumEasyForms {

    public void enterA(String value) {
        $("#sum1").sendKeys(value);
    }

    public void enterB(String value) {
        $("#sum2").sendKeys(value);
    }

    public void getTotal() {
        $(FormButton.withLable("Get Total")).click();
    }

    public String displayTotal() {
        return $("#displayvalue").getText();
    }
}

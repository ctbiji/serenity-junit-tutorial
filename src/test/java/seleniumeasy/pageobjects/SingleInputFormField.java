package seleniumeasy.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.seleniumeasy.com/basic-first-form-demo.html")
public class SingleInputFormField extends SeleniumEasyForms {

    public void enterMessage(String message) {
        $("#user-message").type(message);
    }

    public void showMessage() {
        $("//button[.='Show Message']").click();
        $(FormButton.withLable("ShowMessage")).click();
    }

    public String displayedMessage() {
        return $("#display").getText();
    }
}

package seleniumeasy.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.seleniumeasy.com/basic-radiobutton-demo.html")

public class RadioButtonForms extends SeleniumEasyForms {

    public void selectOptions(String option) {
//        $("//input[@name='optradio'][@value='{0}}']",option).click();
        inRadioButtonGroup("optradio").selectByValue(option);
    }

    public void getCheckedValue() {
        $("#buttoncheck").click();
    }

    public String getDisplayedText() {
      return   $(".radiobutton").getText();
    }
}

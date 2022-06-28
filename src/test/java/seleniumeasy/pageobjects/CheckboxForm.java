package seleniumeasy.pageobjects;


import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.seleniumeasy.com/basic-checkbox-demo.html")
public class CheckboxForm extends SeleniumEasyForms{


    public void setAgeSelected() {
        $("#isAgeSelected").click();

    }

    public String ageText() {
       return  $("#txtAge").getText();
    }

    public boolean optionIsCheckedFor(String options) {
        return $("//label[contains(.,{0})]/input",options).isSelected();
    }

    public void checkAll() {
        $("//input[@value = 'Check All']").click();
    }
}

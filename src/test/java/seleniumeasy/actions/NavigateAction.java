package seleniumeasy.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class NavigateAction extends UIInteractionSteps {

   @Step
   public void to(FormPage formPage){
       openPageNamed(formPage.name());
   }

//    @Step
//    public void toTheSingleInputFieldForm() {
////       openUrl("https://demo.seleniumeasy.com/basic-first-form-demo.html");
//       openPageNamed("singleInputForms");
//
//    }
//
//    public void toTheSingleCheckboxForm() {
//       openPageNamed("singleCheckBoxForms");
//
//    }
}

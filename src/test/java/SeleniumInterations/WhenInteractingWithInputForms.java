package SeleniumInterations;

import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import seleniumeasy.actions.FormPage;
import seleniumeasy.actions.NavigateAction;
import seleniumeasy.pageobjects.*;

import java.util.Arrays;
import java.util.List;

public class WhenInteractingWithInputForms {

    @Steps
    NavigateAction navigate;

    SingleInputFormField singleInputFormField;

    @Test
    public void basicForms(){
//        singleInputFormField.open();
        navigate.to(FormPage.SingleInputFormField);
        singleInputFormField.enterMessage("Hi There");
        singleInputFormField.showMessage();
        assert(singleInputFormField.displayedMessage()).equalsIgnoreCase("Hi There");
        Assertions.assertThat(singleInputFormField.displayedMessage()).isEqualTo("Hi There");

    }

    TwoInputFormField twoInputFormField;

    @Test
    public void basicFormsWithMultipleFields(){
        //twoInputFormField.open();
        navigate.to(FormPage.TwoInputFormField);
        twoInputFormField.enterA("2");
        twoInputFormField.enterB("3");

        twoInputFormField.getTotal();

        assert(twoInputFormField.displayTotal()).equalsIgnoreCase("5");


    }
    CheckboxForm checkboxForm;

    @Test
    public void singleCheckbox(){
//        checkboxForm.open();
        navigate.to(FormPage.CheckboxForm);
        checkboxForm.setAgeSelected();
        assert (checkboxForm.ageText()).equalsIgnoreCase("Success - Check box is checked");

    }

    private static final List<String> ALL_THE_OPTIONS = Arrays.asList("Option 1","Option 2","Option 3","Option 4");

    @Test
    public void multipleCheckBox(){
        checkboxForm.open();
        assert (ALL_THE_OPTIONS).stream().allMatch(
                option -> !checkboxForm.optionIsCheckedFor(option)
        );
        //        assert checkboxForm.optionIsCheckedFor("Option 1");
//        assert (checkboxForm.optionIsCheckedFor("Option 2"));
//        assert (checkboxForm.optionIsCheckedFor("Option 3"));
//        assert (checkboxForm.optionIsCheckedFor("Option 4"));
        checkboxForm.checkAll();

        assert (ALL_THE_OPTIONS).stream().allMatch(
                option -> checkboxForm.optionIsCheckedFor(option)
        );

    }

    RadioButtonForms radioButtonForms;

    @Test
    public void radioButtons(){
        radioButtonForms.open();
        radioButtonForms.selectOptions("Male");
        radioButtonForms.getCheckedValue();
        assert(radioButtonForms.getDisplayedText()).equalsIgnoreCase("Radio Button 'Male' is checked");

    }

    MultipleRadioButtonForms multipleRadioButtonForms;

    @Test
    public void multipleRadioButton(){
        multipleRadioButtonForms.open();
        multipleRadioButtonForms.selectGenderOption("Female");
        multipleRadioButtonForms.selectAgeGroup("15-50");
        multipleRadioButtonForms.getvalue();
        assert  (multipleRadioButtonForms.getResults()).contains("Sex : Female");
        assert (multipleRadioButtonForms.getResults()).contains("Age group: 15-50");

    }

    SelectListForm selectListForm;

    @Test
    public void selectList(){
        selectListForm.open();
        assert (selectListForm.selectedDay()).isEmpty();
        selectListForm.selectDay("Tuesday");
        assert (selectListForm.selectedDay().equalsIgnoreCase("Tuesday"));

    }

    MultiSelectListForm multiSelectListForm;

    @Test
    public void multipleSelectList(){
        multiSelectListForm.open();
        assert (multiSelectListForm.selectedStates()).isEmpty();
        multiSelectListForm.selectStates("Florida","Ohio","Texas");
        assert (multiSelectListForm.selectedStates()).contains("Florida");
        assert (multiSelectListForm.selectedStates()).contains("Ohio");
        assert (multiSelectListForm.selectedStates()).contains("Texas");

    }

    HoverPage hoverPage;

    @Test
    public void Hover(){
        hoverPage.open();

        hoverPage.hoverOverFigure(1);
        hoverPage.captionForFigure(1).shouldBeVisible();
        hoverPage.captionForFigure(1).shouldContainText("user1");

    }
}

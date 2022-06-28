package SeleniumInterations;

import org.junit.Test;
import seleniumeasy.pageobjects.AlertDialogPage;
import seleniumeasy.pageobjects.DynamicDataPage;
import seleniumeasy.pageobjects.ModelDialogPage;

public class WhenWaitingForFormsToLoad {

    ModelDialogPage modelDialogPage;
    @Test
    public void waitingForAModelDialog(){
        modelDialogPage.open();
        modelDialogPage.saveChangesButton().shouldNotBeVisible();
        modelDialogPage.openModal();
        modelDialogPage.saveChangesButton().shouldBeVisible();
        modelDialogPage.saveChangesAction();
        modelDialogPage.saveChangesButton().shouldNotBeVisible();

    }

    AlertDialogPage alertDialogPage;

    @Test
    public void waitingForAlertToClose(){
        alertDialogPage.open();
        alertDialogPage.openSuccessMessage();

        assert (alertDialogPage.alertSuccess()).contains("I'm a auto");

        alertDialogPage.waitForAlertMessageToDisappear();

        alertDialogPage.alertSuceessMessage().shouldNotBeVisible();


    }

    DynamicDataPage dynamicDataPage;
    @Test
    public  void whenWaitingForElementsToAppear(){
        dynamicDataPage.open();

        dynamicDataPage.getNewUser();
         assert(dynamicDataPage.userDescription()).contains("First Name:");

    }
}

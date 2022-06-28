package seleniumeasy.pageobjects;

import net.serenitybdd.core.pages.ResolvableElement;
import org.openqa.selenium.By;

public class FormButton {
    public static By withLable(String label) {
        return By.xpath("//button[.='"+label+"']");
    }
}

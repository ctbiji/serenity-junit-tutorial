package seleniumeasy.pageobjects;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementState;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://the-internet.herokuapp.com/hovers")

public class HoverPage extends PageObject {

    public static final String VISIBLE_Figure = "(//*[@class='figure'])[{0}]";
    public static final String VISIBLE_CAPTION ="(//8[@class='figure-caption']){0}";

    public void hoverOverFigure(int number) {

     WebElementFacade figure = $(VISIBLE_Figure,number);
//     or
//     $$("(//*[@class='figure'])").get(number-1);
     //serenityaction
        withAction().moveToElement(figure).perform();
        //drag and drop ex
        withAction().dragAndDrop($(VISIBLE_Figure,1),$(VISIBLE_CAPTION,2)).perform();

    }

    public WebElementState captionForFigure(int number) {
        return $(VISIBLE_CAPTION,number);
            }
}

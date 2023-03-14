package stepDef;

import com.thoughtworks.gauge.Step;
import pages.SearchPage;

public class SearchPageSteps extends SearchPage {

    @Step("Scroll down to the bottom of the page twice.")
    public void scroll()
    {
        scrollDown();
    }
    @Step("Choose a product at random")
    public void select()
    {
        selectRandomProduct();
    }
}

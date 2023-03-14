package stepDef;

import com.thoughtworks.gauge.Step;
import pages.HomePage;

public class HomePageSteps extends HomePage {

    @Step("Go to categories page")
    public void categories() {
        goToCategoriesPage();
    }

    @Step("Go to my account")
    public void account()
    {
        goToMyAccountPage();
    }
}

package stepDef;

import com.thoughtworks.gauge.Step;
import pages.CategoryPage;

public class CategoryPageSteps extends CategoryPage {

    @Step("Then select Woman and then Pants.")
    public void select() throws InterruptedException {
        womanCategory();
        Thread.sleep(1000);
        pantolon();
    }

    @Step("Select Woman")
    public void implementation1() {

    }


}

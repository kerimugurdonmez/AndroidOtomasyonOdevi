package stepDef;

import com.thoughtworks.gauge.Step;
import pages.ProductPage;

public class ProductPageSteps extends ProductPage {

    @Step("Bookmark the product")
    public void favorite() {
        favoriteProduct();
    }

    @Step("Take a step back")
    public void back() {
        goBack();
    }

    @Step("Add selected product to cart")
    public void add()
    {
        addToCart();
    }
}

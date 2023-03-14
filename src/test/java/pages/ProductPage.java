package pages;

import base.BasePage;
import constants.PageElements;

public class ProductPage extends BasePage
{

    public void favoriteProduct()
    {
        clickElement(PageElements.FAVORITEBUTTON);
    }

    public void goBack()
    {
        clickElement(PageElements.BTNBACK);
    }

    public void addToCart()
    {
        clickElement(PageElements.BTNADDCART);

    }
}

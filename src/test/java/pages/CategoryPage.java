package pages;

import base.BasePage;
import constants.PageElements;
import io.appium.java_client.touch.offset.PointOption;


public class CategoryPage extends BasePage
{
    public void womanCategory()
    {
        clickElement(PageElements.BTNKADINOFCATEGORIESMENU);
    }

    public void pantolon()
    {
        clickElement(PageElements.PANTOLON);
    }


}

package pages;

import base.BasePage;
import constants.PageElements;

public class HomePage extends BasePage
{
    public void goToCategoriesPage()
    {
        clickElement(PageElements.BTNOFCATEGORIES);
    }

    public void goToMyAccountPage()
    {
        clickElement(PageElements.MYACCOUNTBTN);
    }
}

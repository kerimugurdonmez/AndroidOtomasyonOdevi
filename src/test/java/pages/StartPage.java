package pages;

import base.BasePage;
import constants.PageElements;
import org.assertj.core.api.Assert;
import org.assertj.core.error.AssertionErrorMessagesAggregrator;

public class StartPage extends BasePage
{
    public void closeTheCookie()
    {
        clickElement(PageElements.BTNCANCELOFCOOKIEPOPUP);
    }
    public void startToShopping()
    {
        clickElement(PageElements.STARTSHOPPINGBUTTON);

    }

    public void allowpermisson()
    {
        clickElement(PageElements.PERMISSONALLOWBTN);
    }
}

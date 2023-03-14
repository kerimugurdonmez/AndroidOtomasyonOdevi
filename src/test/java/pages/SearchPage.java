package pages;

import base.BasePage;
import constants.PageElements;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;

public class SearchPage extends BasePage
{


    public void scrollDown()
    {
        (new TouchAction(driver))
                .press(PointOption.point(563, 2029))
                .moveTo(PointOption.point(604, 156))
                .release()
                .perform();

        (new TouchAction(driver))
                .press(PointOption.point(534, 2041))
                .moveTo(PointOption.point(534, 70))
                .release()
                .perform();

        }

    public void selectRandomProduct()
    {
        clickElement(PageElements.RANDOMPRODUCT);
    }
}

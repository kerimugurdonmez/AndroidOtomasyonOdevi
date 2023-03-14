package stepDef;

import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import base.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.StartPage;

import static org.assertj.core.api.Assertions.assertThat;

public class StartPageSteps extends StartPage {

    @Step("Click on the Start Shopping button")
    public void start() {
        startToShopping();
    }

    @Step("Close the cookie pop-up")
    public void close() {
        closeTheCookie();
    }

    @Step("Allow notification.")
    public void notification()
    {
        allowpermisson();
    }
}

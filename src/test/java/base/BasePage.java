package base;

import com.thoughtworks.gauge.Gauge;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class BasePage extends Driver {

    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(13));

    public static Random random = new Random();
    public static Dimension dimension = driver.manage().window().getSize();
    public static TouchAction touchAction = new TouchAction(driver);


    public void goToUrl(String key) {
        driver.navigate().to(key);
        assertThat(driver.getTitle()).contains("NetWork");
        Gauge.writeMessage("Page title is %s", driver.getTitle());
    }

    public WebElement findElement(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return driver.findElement(by);
    }

    public void clickElement(By by)
    {
        findElement(by).click();
    }

    public void sendKeys(By by, CharSequence text) {
        WebElement webElement = findElement(by);
        wait.until(ExpectedConditions.elementToBeClickable(webElement)).sendKeys(text, Keys.ENTER);
    }

    public WebElement findElements(By by)
    {
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(13));
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return (WebElement) driver.findElements(by);
    }
}

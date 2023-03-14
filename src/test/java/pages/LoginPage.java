package pages;

import base.BasePage;
import constants.PageElements;
import org.openqa.selenium.By;

public class LoginPage extends BasePage
{
    public void loginTheUser() {
        driver.findElement(PageElements.EMAIL).click();
        driver.findElement(PageElements.EMAIL).sendKeys("kerimugurdonmez@gmail.com");
        driver.findElement(PageElements.PASS).click();
        driver.findElement(PageElements.PASS).sendKeys("55583469238");
    }

    public void pressLoginBtn()
    {
        driver.findElement(PageElements.BTNLOGIN).click();
    }
}

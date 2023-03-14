package stepDef;

import com.thoughtworks.gauge.Step;
import pages.LoginPage;

public class LoginPageSteps extends LoginPage {

    @Step("log in the user")
    public void logIn()
    {
        loginTheUser();
        pressLoginBtn();
    }
}

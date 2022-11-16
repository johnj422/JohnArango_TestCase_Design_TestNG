package org.espn.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.tinylog.Logger;
import static org.hamcrest.Matchers.*;

public class LoginTest extends BaseTest{

    @Parameters({"email", "password"})

    @Test(priority = 1)
    public void loginTests(String email, String password) {
        homePage.closeBanner();
        homePage.userLogin();
        homePage.changingIframe(homePage.getUserFrame());
        checkThat("ESPN Logo is displayed", homePage.isEspnLogoDisplayed(), is(true));
        checkThat("Submit button is displayed", homePage.isBtnSubmitDisplayed(), is(true));
        checkThat("Sign Up button is displayed", homePage.isBtnSignUpDisplayed(), is(true));
        Logger.info("Login In...");
        homePage.sendUserEmail(email);
        homePage.sendUserPassword(password);
        homePage.logIn();
    }

}

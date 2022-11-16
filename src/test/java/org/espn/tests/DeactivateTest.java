package org.espn.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.tinylog.Logger;
import static org.hamcrest.Matchers.*;

public class DeactivateTest extends LoginTest{

    @Parameters({"email", "password"})

    @Test(priority = 4)
    public void deactivateTest(String email, String password){
        Logger.info("Hover mouse to user icon...");
        homePage.performMouseHover(homePage.getUserIcon());
        Logger.info("Clicking profile link...");
        homePage.clickProfileLink();
        Logger.info("Changing iFrame...");
        homePage.changingIframe(homePage.getUserFrame());
        homePage.deleteAccountLink();
        homePage.waitForCancelBtn();
        Logger.info("Confirming account deletion...");
        Logger.info(homePage.getIframeTitle());
        homePage.clickSubmitBtn();
        homePage.waitForErrorMsg();
        checkThat("Account successfully deleted", homePage.getIframeTitle(), is("Your account has been deleted."));
        Logger.info("Checking if deleted account allows login in...");
        homePage.clickSubmitBtn();
        homePage.validateReLogin(email, password);
        checkThat("Account has been deactivated", homePage.getIframeTitle(), is("Account Deactivated"));
    }

}

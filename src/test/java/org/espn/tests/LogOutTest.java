package org.espn.tests;

import org.testng.annotations.Test;
import org.tinylog.Logger;
import static org.hamcrest.Matchers.*;

public class LogOutTest extends WatchTest{

    @Test(priority = 3)
    public void logOutTest(){
        Logger.info("Logging out...");
        homePage.clickLogOutButton();
        driver.getDriver().navigate().refresh();
        Logger.info("Mouse hovering to user icon...");
        homePage.performMouseHover(homePage.getUserIcon());
        checkThat("Username is blank ", homePage.validateNoUserName(), is("Welcome!"));
    }
}

package org.espn.tests;

import org.testng.annotations.Test;
import org.tinylog.Logger;

public class LogOutTest extends WatchTest{

    @Test(priority = 3)
    public void logOutTest(){
        Logger.info("Logging out...");
        homePage.clickElement(homePage.getLogOutButton());
        driver.getDriver().navigate().refresh();
        Logger.info("Mouse hover to user...");
       /* action.moveToElement(homePage.getUserOnline()).perform();
        Logger.info("User is --->" + homePage.getUserOffline());*/
    }
}

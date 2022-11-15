package org.espn.tests;

import org.testng.annotations.Test;
import org.tinylog.Logger;

public class LogOut extends WatchTest{

    @Test(priority = 3)
    public void logOutTest(){
        Logger.info("Logging out...");
        clickElement(homePage.getLogOutButton());
        Logger.info("Mouse hover to user...");
        Logger.error("User is --->" + homePage.getUserOffline() + "REVISAR NO FUNCIONA BIEN");
    }
}

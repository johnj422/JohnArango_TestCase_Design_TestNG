package org.espn.tests;

import org.testng.annotations.Test;
import org.tinylog.Logger;

public class WatchTest extends LoginTest{

    @Test(priority = 2)
    public void watchTest(){
        Logger.info("Clicking Watch...");
        homePage.clickElement(homePage.getWatchLink());
        Logger.info("Is any carrousel dispayed-->" + homePage.getCarrouselContainer());
        Logger.error("XXX---PENDIENTE REVISAR TITULOS Y DESC DE lAS CARDS---XXX");
        Logger.info("Clicking second carrousel's card...");
        homePage.clickElement(homePage.getSecondCard());
        Logger.info("Clicking closeButton");
        homePage.clickElement(homePage.getCloseButton());
        Logger.info("Going back to landing page...");
        driver.getDriver().navigate().back();
        Logger.info("Mouse hover to user...");
        /*homePage.action.moveToElement(homePage.getUserOnline()).perform();
        Logger.info("User name is --->" + homePage.getUserName());*/
    }

}

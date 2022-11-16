package org.espn.tests;

import org.espn.pages.WatchPage;
import org.testng.annotations.Test;
import org.tinylog.Logger;
import static org.hamcrest.Matchers.*;

public class WatchTest extends LoginTest{

    protected WatchPage watchPage;

    @Test(priority = 2)
    public void watchTest(){
        watchPage = new WatchPage(driver.getDriver());
        Logger.info("Navigating to Watch...");
        watchPage.navigateToWatch();
        checkThat("There is at least one carrousel", watchPage.getCarrouselContainerSize(), not(0));
        checkThat("Cards without title or description", watchPage.getNoTitleCards(), is(0));
       /*
        Logger.error("XXX---PENDIENTE REVISAR TITULOS Y DESC DE lAS CARDS---XXX");
        Logger.info("Clicking second carrousel's card...");
        homePage.clickElement(homePage.getSecondCard());
        Logger.info("Clicking closeButton");
        homePage.clickElement(homePage.getCloseButton());
        Logger.info("Going back to landing page...");
        driver.getDriver().navigate().back();
        Logger.info("Mouse hover to user...");*/
        /*homePage.action.moveToElement(homePage.getUserOnline()).perform();
        Logger.info("User name is --->" + homePage.getUserName());*/
    }

}

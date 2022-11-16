package org.espn.tests;

import org.espn.pages.WatchPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.tinylog.Logger;
import static org.hamcrest.Matchers.*;

public class WatchTest extends LoginTest{

    protected WatchPage watchPage;

    @Parameters({"user"})
    @Test(priority = 2)
    public void watchTest(String user){
        watchPage = new WatchPage(driver.getDriver());
        Logger.info("Navigating to Watch...");
        watchPage.navigateToWatch();
        checkThat("There is at least one carrousel", watchPage.getCarrouselContainerSize(), not(0));
        checkThat("Cards without title or description", watchPage.getNoTitleCards(), is(0));
        Logger.info("Clicking second carrousel's card...");
        watchPage.clickSecondCard();
        checkThat("Close button is displayed", watchPage.validateCloseButton(), is(true));
        Logger.info("Closing card details...");
        watchPage.clickCloseButton();
        Logger.info("Going back to landing page...");
        watchPage.clickBack();
        Logger.info("Mouse hover to user...");
        watchPage.performMouseHover(watchPage.getUserOnline());
        checkThat("Username is correct ", watchPage.getUserName(), containsString(user));
    }

}

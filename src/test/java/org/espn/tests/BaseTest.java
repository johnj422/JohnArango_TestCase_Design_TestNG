package org.espn.tests;

import org.tinylog.Logger;
import org.testng.annotations.*;

public class BaseTest {

    @BeforeSuite
    public void haveAccount(){
        Logger.info("Must have a valid account at espn.com \n");
    }

    @BeforeClass
    public void openBrowser() {
        Logger.info("Browser opened");
        Logger.info("Browse to espn.com");
    }

    @AfterClass
    public void closeBrowser(){
        Logger.info("Browser closed \n");
    }

}

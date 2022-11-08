package org.globantTestNG.tests;

import org.tinylog.Logger;
import org.testng.annotations.*;

public class BaseTests {



    @BeforeSuite
    public void haveAccount(){
        Logger.info("Must have a valid account at espn.com");
    }

    @BeforeClass
    public void openBrowser() {
        Logger.info("Browser opened");
    }

    @AfterClass
    public void closeBrowser(){
        Logger.info("Browser closed");
    }

}

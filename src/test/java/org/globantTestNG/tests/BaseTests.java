package org.globantTestNG.tests;

import org.testng.log4testng.Logger;
import org.testng.annotations.*;

public class BaseTests {

    Logger logger = Logger.getLogger(BaseTests.class);

    @BeforeSuite
    public void haveAccount(){
        logger.info("Must have a valid account at espn.com");
    }

    @BeforeClass
    public void openBrowser() {
        logger.info("Browser opened");
    }

    @AfterClass
    public void closeBrowser(){
        logger.info("Browser closed");
    }

}

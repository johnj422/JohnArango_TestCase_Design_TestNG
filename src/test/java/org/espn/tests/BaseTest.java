package org.espn.tests;

import org.espn.configuration.Driver;
import org.tinylog.Logger;
import org.testng.annotations.*;
import static java.lang.String.format;
import org.espn.pages.HomePage;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matcher;

public class BaseTest {

    protected Driver driver;
    protected HomePage homePage;

    @Parameters({"browser","url"})

    @BeforeClass
    public void testSetup(String browser, String url){
        driver = new Driver(browser);
        Logger.info("Deleting all cookies");
        driver.getDriver().manage().deleteAllCookies();
        driver.getDriver().manage().window().maximize();
        Logger.info(format("Navigating to %s", url));
        driver.getDriver().get(url);
        homePage = new HomePage(driver.getDriver());
    }

    @AfterClass
    public void teardown(){
        Logger.info("Shutting down");
        driver.getDriver().quit();
    }

    protected <T> void checkThat(String description, T actualValue, Matcher<? super T> expectedValue){
        Logger.info(format("Checking that " + description + " [Expectation: %s]", expectedValue));
        try {
            MatcherAssert.assertThat(actualValue, expectedValue);
        } catch (AssertionError e){
            Logger.error(format("Assertion Error: [%s]", e.getMessage().replaceAll("\n", "")));
        }
    }

}

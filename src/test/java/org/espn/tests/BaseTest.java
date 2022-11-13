package org.espn.tests;

import org.espn.configuration.Driver;
import org.espn.configuration.WebOperations;
import org.openqa.selenium.WebDriver;
import org.tinylog.Logger;
import org.testng.annotations.*;
import static java.lang.String.format;

public class BaseTest extends WebOperations {

    private Driver driver;

    public BaseTest(WebDriver driver) {
        super(driver);
    }


    @Parameters({"browser", "url"})



    @BeforeTest
    public void testSetup(String browser, String url){
        driver = new Driver(browser);
        Logger.info("Deleting all cookies");
        driver.getDriver().manage().deleteAllCookies();
        Logger.info(format("Navigating to %s", url));
        driver.getDriver().get(url);
        driver.getDriver().manage().window().maximize();

    }

/*    @AfterSuite
    public void teardown(){
        driver.getDriver().quit();
    }*/


}

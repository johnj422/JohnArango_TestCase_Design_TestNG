package org.espn.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.tinylog.Logger;
import static java.lang.String.format;
import org.espn.pages.HomePage;


import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected HomePage homePage;
    @Parameters({"url"})

    @BeforeMethod
    public void setup(String url){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5L));
        Logger.info("Deleting all cookies");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        Logger.info(format("Navigating to %s", url));
        driver.get(url);

        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void teardown(){
        Logger.info("Shutting down");
        driver.quit();
    }

}

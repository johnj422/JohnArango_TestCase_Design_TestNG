package org.espn.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.tinylog.Logger;

import static java.lang.String.format;

public class LoginTest extends BaseTest{
    @Test
    public void testClick() throws InterruptedException {
        try {
            waitForVisibility(homePage.getUserSession());
            Logger.info("Showing user iFrame...");
        } catch (Error e){
            Logger.error(format(e.getMessage()));
        }

        try {
            clickElement(homePage.getUserLogin());
            Logger.info("Login window...");
        } catch (Error e){
            Logger.error(format("Login window error " + e.getMessage()));
        }

        Logger.info("Switching to iFrame...");
        WebElement frame = homePage.getUserFrame();
        driver.switchTo().frame("oneid-iframe");
        Logger.info("Sending userEmail...");
        homePage.getUserEmail().sendKeys("test");
    }
    public void clickElement(WebElement element) {
        waitForClickable(element);
        element.click();
    }
    public void waitForClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waitForVisibility(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}

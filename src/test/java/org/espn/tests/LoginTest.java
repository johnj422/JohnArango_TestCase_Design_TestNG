package org.espn.tests;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.tinylog.Logger;

public class LoginTest extends BaseTest{
    @Test(priority = 1)
    public void loginTests() {
        if (homePage.validatePromoBanner()){
            driver.switchTo().frame(homePage.getPromoBannerIFrame());
            clickElement(homePage.getBannerCloseButton());
        }
        waitForVisibility(homePage.getUserSession());
        Logger.info("Showing user iFrame...");
        clickElement(homePage.getUserLogin());
        Logger.info("Login window...");
        Logger.info("Switching to iFrame...");
        driver.switchTo().frame(homePage.getUserFrameModal());
        Logger.info("Validating ESPN Logo...");
        waitForVisibility(homePage.getEspnLogo());
        Logger.info("Validating Log In button...");
        waitForVisibility(homePage.getBtnSubmit());
        Logger.info("Validating Sign Up button...");
        waitForVisibility(homePage.getBtnCreateAccount());
        Logger.info("Sending userEmail...");
        homePage.getUserEmail().sendKeys("salmones_factores_02@icloud.com");
        Logger.info("Sending userPassword...");
        homePage.getUserPassword().sendKeys("Test234*56");
        Logger.info("Login In....");
        clickElement(homePage.getBtnSubmit());
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

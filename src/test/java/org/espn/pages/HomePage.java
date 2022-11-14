package org.espn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(css = "#global-user-trigger")
    private WebElement userSession;

    @FindBy(css = "article[id='sideLogin-left-rail'] button[class='button-alt med']")
    private WebElement userLogin;

    @FindBy(className = "input-InputLoginValue")
    private WebElement userEmail;

    @FindBy(css = "oneid-iframe")
    private WebElement userFrame;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getUserSession() {
        return userSession;
    }

    public WebElement getUserLogin() {
        return userLogin;
    }

    public WebElement getUserEmail() {
        return userEmail;
    }

    public WebElement getUserFrame() {
        return userFrame;
    }

}

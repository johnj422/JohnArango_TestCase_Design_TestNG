package org.espn.pages;

import org.espn.configuration.WebOperations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;


public class HomePage extends WebOperations {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Promo Banner Locators
    @FindBy(css = ".promo-banner-container > iframe")
    private WebElement promoBannerIFrame;

    @FindBy(css = "#fittPageContainer .PromoBanner__CloseBtn")
    private WebElement bannerCloseButton;

    //Login Locators
    @FindBy(css = "article[id='sideLogin-left-rail'] button[class='button-alt med']")
    private WebElement userLogin;

    @FindBy(className = "input-InputLoginValue")
    private WebElement emailInput;

    @FindBy(className = "input-InputPassword")
    private WebElement passwordInput;

    @FindBy(id = "oneid-iframe")
    private WebElement userFrame;

    @FindBy(id ="logo")
    private WebElement espnLogo;

    @FindBy(id = "BtnSubmit")
    private WebElement btnSubmit;

    @FindBy(id = "BtnCreateAccount")
    private WebElement btnCreateAccount;

    //Logout Locators

    @FindBy(css = "li[class='user hover'] div[class='global-user'] div[class='global-user-container'] ul[class='account-management'] li a[class='small']")
    private WebElement logOutButton;

    @FindBy(css = "div[class='container'] li:nth-child(5) a:nth-child(1)")
    private WebElement profileLink;

    @FindBy(css = ".user")
    private WebElement userIcon;

    @FindBy(css = ".display-user")
    private WebElement userOffline;

    public void closeBanner() {
        if (promoBannerIFrame.isDisplayed()){
            super.getDriver().switchTo().frame(promoBannerIFrame);
            clickElement(bannerCloseButton);
        }
    }

    public void userLogin(){
        clickElement(userLogin);
    }

    public WebElement getUserFrame() {
        return userFrame;
    }

    public void changingIframe(WebElement iFrame){
        super.getDriver().switchTo().frame(iFrame);
    }

    public boolean isEspnLogoDisplayed() {
        return espnLogo.isDisplayed();
    }

    public boolean isBtnSubmitDisplayed() {
        return btnSubmit.isDisplayed();
    }

    public boolean isBtnSignUpDisplayed() {
        return btnCreateAccount.isDisplayed();
    }

    public void sendUserEmail(String email){
        emailInput.sendKeys(email);
    }

    public void sendUserPassword(String password){
        passwordInput.sendKeys(password);
    }

    public void logIn(){
        clickElement(btnSubmit);
    }

    public void clickLogOutButton() {
        clickElement(logOutButton);
    }

    public WebElement getUserIcon() {
        return userIcon;
    }

    public String validateNoUserName(){
        return userOffline.getText();
    }

    public WebElement getProfileLink() {
        return profileLink;
    }
}

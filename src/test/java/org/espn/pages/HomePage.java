package org.espn.pages;

import org.espn.configuration.WebOperations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import java.util.stream.Stream;

public class HomePage extends WebOperations {

    @FindBy(css = ".promo-banner-container > iframe")
    private WebElement promoBannerIFrame;

    @FindBy(css = "#fittPageContainer .PromoBanner__CloseBtn")
    private WebElement bannerCloseButton;

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

    @FindBy(css = "a[name='&lpos=sitenavcustom+sitenav_watch'] span span[class='link-text']")
    private WebElement watchLink;

    @FindBy(css = ".BucketsContainer > div")
    private List<WebElement> carrouselContainer;

    @FindBy(css = ".BucketsContainer > div:nth-child(1) > section > div:nth-child(2) > div > div > ul")
    private List<WebElement> carrouselCards;

    @FindBy(css = ".BucketsContainer > div:nth-child(1) > section > div:nth-child(2) > div > div > ul > li:nth-child(2)")
    private WebElement secondCard;

    @FindBy(css = "button.lightbox__closebtn")
    private WebElement closeButton;

    @FindBy(css = ".user")
    private WebElement userOnline;

    @FindBy(css = ".display-user")
    private WebElement userOffline;

    @FindBy(css = ".display-user > span")
    private WebElement userName;

    @FindBy(css = "li[class='user hover'] div[class='global-user'] div[class='global-user-container'] ul[class='account-management'] li a[class='small']")
    private WebElement logOutButton;

    @FindBy(css = "div[class='container'] li:nth-child(5) a:nth-child(1)")
    private WebElement profileLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

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
    public WebElement getWatchLink() {
        return watchLink;
    }

    public boolean getCarrouselContainer() {
        return (carrouselContainer.size()>0);
    }

    public Stream<Object> getCarrouselCards() {
        return carrouselCards.stream().map(WebElement::getText);
    }

    public WebElement getSecondCard() {
        return secondCard;
    }

    public WebElement getCloseButton() {
        return closeButton;
    }

    public WebElement getUserOnline() {
        return userOnline;
    }

    public String getUserOffline() {
        return userOffline.getText();
    }

    public String getUserName() {
        return userName.getText();
    }

    public WebElement getLogOutButton() {
        return logOutButton;
    }

    public WebElement getProfileLink() {
        return profileLink;
    }
}

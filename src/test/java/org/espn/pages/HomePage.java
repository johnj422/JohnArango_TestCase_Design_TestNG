package org.espn.pages;

import org.espn.tests.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;
import java.util.stream.Stream;

public class HomePage {
    String userFrameModal = "oneid-iframe";
    @FindBy(css = "#global-user-trigger")
    private WebElement userSession;

    @FindBy(css = "article[id='sideLogin-left-rail'] button[class='button-alt med']")
    private WebElement userLogin;

    @FindBy(className = "input-InputLoginValue")
    private WebElement userEmail;

    @FindBy(className = "input-InputPassword")
    private WebElement userPassword;

    @FindBy(css = "oneid-iframe")
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

    @FindBy(css = "li[class='user hover'] li[class='display-user']")
    private WebElement userOffline;

    @FindBy(css = ".display-user > span")
    private WebElement userName;

    @FindBy(css = "li[class='user hover'] div[class='global-user'] div[class='global-user-container'] ul[class='account-management'] li a[class='small']")
    private WebElement logOutButton;

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
    public WebElement getUserPassword() {
        return userPassword;
    }

    public WebElement getUserFrame() {
        return userFrame;
    }
    public String getUserFrameModal() {
        return userFrameModal;
    }

    public WebElement getEspnLogo() {
        return espnLogo;
    }

    public WebElement getBtnSubmit() {
        return btnSubmit;
    }

    public WebElement getBtnCreateAccount() {
        return btnCreateAccount;
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


}

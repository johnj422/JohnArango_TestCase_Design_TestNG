package org.espn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.tinylog.Logger;

import java.util.List;

public class WatchPage extends HomePage{

    public WatchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[name='&lpos=sitenavcustom+sitenav_watch'] span span[class='link-text']")
    private WebElement watchLink;

    @FindBy(css = ".BucketsContainer > div")
    private List<WebElement> carrouselContainer;

    @FindBy(css = ".BucketsContainer > div:nth-child(1) > section > div:nth-child(2) > div > div > ul > li")
    private List<WebElement> carrouselCards;

    public void navigateToWatch(){
        clickElement(watchLink);
    }

    public int getCarrouselContainerSize() {
        return carrouselContainer.size();
    }

    public int getNoTitleCards() {
        int count = 0;
        for(WebElement carrouselCard : carrouselCards){
            if(carrouselCard.getText().isEmpty()){
                count++;
            }
        } return count;
    }

}

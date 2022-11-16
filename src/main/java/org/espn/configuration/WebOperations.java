package org.espn.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.PageFactory.initElements;

public class WebOperations {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public WebOperations(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5L));
        initElements(driver, this);
    }

    protected WebDriver getDriver(){
        return driver;
    }
}

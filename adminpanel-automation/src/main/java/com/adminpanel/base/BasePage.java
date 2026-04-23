package com.adminpanel.base;

import com.adminpanel.utils.ConfigReader;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public  WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(ConfigReader.getTimeout()));
    }

    protected WebElement waitForVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected WebElement waitForClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected void click(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

        try {
            element.click();
        } catch (Exception e) {
            // fallback to JS click
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }
    }

    protected void type(By locator, String value) {
        WebElement element = waitForVisible(locator);
        element.clear();
        element.sendKeys(value);
    }

    protected String text(By locator) {
        return waitForVisible(locator).getText();
    }

    protected void selectByVisibleText(By locator, String value) {
        new Select(waitForVisible(locator)).selectByVisibleText(value);
    }

    protected Alert switchToAlert() {
        return wait.until(ExpectedConditions.alertIsPresent());
    }

    protected void open(String path) {
        driver.get(ConfigReader.getBaseUrl() + path);
    }
    public void sendKeys(By locator, String value) {
        waitForVisible(locator).sendKeys(value);
    }
    
}
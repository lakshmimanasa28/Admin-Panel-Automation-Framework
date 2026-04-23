package com.adminpanel.pages;

import com.adminpanel.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage extends BasePage {

    public FramePage(WebDriver driver) {
        super(driver);
    }

    // Frames on the page
    private By leftFrame = By.name("left");
    private By middleFrame = By.name("middle");
    private By rightFrame = By.name("right");

    // Body inside frame
    private By bodyText = By.tagName("body");

    // Switch methods
    public void switchToLeftFrame() {
        driver.switchTo().frame(waitForVisible(leftFrame));
    }

    public void switchToMiddleFrame() {
        driver.switchTo().frame(waitForVisible(middleFrame));
    }

    public void switchToRightFrame() {
        driver.switchTo().frame(waitForVisible(rightFrame));
    }

    // Get text inside frame
    public String getFrameText() {
        return text(bodyText);
    }

    // Switch back
    public void switchToDefault() {
        driver.switchTo().defaultContent();
    }
}
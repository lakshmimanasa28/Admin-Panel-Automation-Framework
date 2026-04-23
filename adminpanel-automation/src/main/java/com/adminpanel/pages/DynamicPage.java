package com.adminpanel.pages;

import com.adminpanel.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicPage extends BasePage {

    public DynamicPage(WebDriver driver) {
        super(driver);
    }

    private final By startBtn = By.id("button00");

    public void clickStart() {
        click(startBtn);
    }
}
package com.adminpanel.pages;

import com.adminpanel.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage extends BasePage {
    public AlertPage(WebDriver driver) {
        super(driver);
    }

   
    private final By result = By.id("dialog-text");
    private By alertBtn = By.xpath("//button[text()='Show alert box']");
    private By confirmBtn = By.xpath("//button[text()='Show confirm box']");
    private By promptBtn = By.xpath("//button[text()='Show prompt box']");

    public void acceptAlert() {
        click(alertBtn);
        switchToAlert().accept();
    }

    public void acceptConfirm() {
        click(confirmBtn);
        switchToAlert().accept();
    }

    public void dismissConfirm() {
        click(confirmBtn);
        switchToAlert().dismiss();
    }

    public void promptAndAccept(String textValue) {
        click(promptBtn);
        switchToAlert().sendKeys(textValue);
        switchToAlert().accept();
    }

    public String getResult() {
        return text(result);
    }
}
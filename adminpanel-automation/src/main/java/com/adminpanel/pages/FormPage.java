package com.adminpanel.pages;

import com.adminpanel.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage extends BasePage {

    public FormPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    private By username = By.name("username");
    private By password = By.name("password");
    private By comments = By.name("comments");
    private By submitBtn = By.cssSelector("input[type='submit']");
    private By resultText = By.id("_valueusername"); // (may vary slightly)

    // Actions
    public void fillBasicForm(String user, String pass, String comment) {
        type(username, user);
        type(password, pass);
        type(comments, comment);
    }

    public void submitForm() {
        click(submitBtn);
    }

    public String getResultText() {
        return text(resultText);
    }
}
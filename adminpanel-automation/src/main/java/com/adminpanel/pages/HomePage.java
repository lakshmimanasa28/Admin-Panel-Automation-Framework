package com.adminpanel.pages;

import com.adminpanel.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void openTablePage() {
        driver.get("https://testpages.eviltester.com/pages/basics/html-tag-table/");
    }
    public void openBasicForm() {
        open("/basic-html-form-test.html");
    }

    public void openSortableTable() {
        open("/tables/sortable-table.html");
    }

    public void openPagedTable() {
        driver.get("https://testpages.eviltester.com/styled/tables/paged-table.html");
    }

    public void openAlertsPage() {
        open("/alerts/alert-test.html");
    }

    public void openDynamicPage() {
    	driver.get("https://testpages.eviltester.com/styled/dynamic-controls-simple.html");
    }

    public void openFramesPage() {
        driver.get("https://testpages.eviltester.com/styled/frames/frames-test.html");
    }
}
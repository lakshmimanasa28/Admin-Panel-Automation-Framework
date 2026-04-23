package com.adminpanel.pages;

import com.adminpanel.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TablePage extends BasePage {
    public TablePage(WebDriver driver) {
        super(driver);
    }

    private final By header1 = By.xpath("//table//th[1]");
    private final By header2 = By.xpath("//table//th[2]");
    private By firstRowCell = By.cssSelector("#myTable tbody tr:nth-child(1) td:nth-child(1)");
    private final By nextPage = By.linkText("next");
  
    private final By nextBtn = By.id("next");
    private final By table = By.id("myTable");
    public boolean headersVisible() {
        return waitForVisible(header1).isDisplayed() && waitForVisible(header2).isDisplayed();
    }

    public void sortByFirstColumn() {
        click(header1);
    }


   
    public String firstRowValue() {
        return text(firstRowCell);
    }

    public void clickNext() {

        String oldValue = driver.findElement(By.xpath("//table//tr[2]/td[1]")).getText();

        click(nextBtn);

        wait.until(ExpectedConditions.not(
            ExpectedConditions.textToBePresentInElementLocated(
                By.xpath("//table//tr[2]/td[1]"), oldValue
            )
        ));
    }

    public void goToNextPage() {
        click(nextBtn);
    }
}
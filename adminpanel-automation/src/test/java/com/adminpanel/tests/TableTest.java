package com.adminpanel.tests;

import com.adminpanel.base.BaseTest;
import com.adminpanel.pages.HomePage;
import com.adminpanel.pages.TablePage;
import com.adminpanel.utils.ConfigReader;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableTest extends BaseTest {

    @Test
    public void testSortableTable() {

        HomePage home = new HomePage(driver);
        home.openTablePage();   // ✅ FIXED

        TablePage table = new TablePage(driver);

        Assert.assertTrue(table.headersVisible());
    }
  
    @Test
    public void testTableData() {

        driver.get(ConfigReader.get("baseUrl") + "/pages/basics/html-tag-table/");

        List<WebElement> rows = driver.findElements(By.xpath("//table//tr[td]"));

        Assert.assertTrue(rows.size() > 0, "Table is empty");
    }
}
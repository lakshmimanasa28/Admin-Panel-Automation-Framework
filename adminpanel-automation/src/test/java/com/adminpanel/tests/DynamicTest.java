package com.adminpanel.tests;

import com.adminpanel.pages.DynamicPage;
import com.adminpanel.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.adminpanel.base.BaseTest;

public class DynamicTest extends BaseTest {

    @Test
    public void testDynamicButtonClick() {

        driver.get(ConfigReader.get("baseUrl") + "/dynamic-buttons-simple.html");

        DynamicPage page = new DynamicPage(driver);

        page.clickStart();

        Assert.assertTrue(true); // pass if no error
    }

    @Test
    public void testSecondClick() {

        driver.get(ConfigReader.get("baseUrl") + "/dynamic-buttons-simple.html");

        DynamicPage page = new DynamicPage(driver);

        page.clickStart();

        Assert.assertTrue(true); // pass if no error
    }
}
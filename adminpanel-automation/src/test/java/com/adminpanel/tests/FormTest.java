package com.adminpanel.tests;

import com.adminpanel.base.BaseTest;
import com.adminpanel.pages.FormPage;
import com.adminpanel.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.adminpanel.utils.ConfigReader;

public class FormTest extends BaseTest {

    @DataProvider(name = "formData")
    public Object[][] data() {
        return new Object[][]{
                {"santosh", "12345", "hello world"},
                {"manasa", "abcde", "testing form"}
        };
    }

    @Test(dataProvider = "formData")
    public void testBasicForm(String user, String pass, String comment) {

        HomePage home = new HomePage(driver);
        home.openBasicForm();

        FormPage form = new FormPage(driver);
        form.fillBasicForm(user, pass, comment);
        form.submitForm();

        Assert.assertTrue(form.getResultText() != null);
    }
}
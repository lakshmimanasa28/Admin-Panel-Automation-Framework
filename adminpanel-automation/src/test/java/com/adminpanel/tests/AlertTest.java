package com.adminpanel.tests;

import com.adminpanel.base.BaseTest;
import com.adminpanel.pages.AlertPage;
import com.adminpanel.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {

	@Test
	public void testAlertAccept() {

	    HomePage home = new HomePage(driver);
	    home.openAlertsPage();   // ✅ VERY IMPORTANT

	    AlertPage alert = new AlertPage(driver);
	    alert.acceptAlert();
	}

	@Test
	public void testConfirmDismiss() {

	    HomePage home = new HomePage(driver);
	    home.openAlertsPage();   // ✅ VERY IMPORTANT

	    AlertPage alert = new AlertPage(driver);
	    alert.dismissConfirm();
	}
}
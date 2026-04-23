package com.adminpanel.tests;

import com.adminpanel.base.BaseTest;
import com.adminpanel.pages.FramePage;
import com.adminpanel.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTest extends BaseTest {

    @Test
    public void testFrames() {

        HomePage home = new HomePage(driver);
        home.openFramesPage();   // 🔥 important

        FramePage frame = new FramePage(driver);

        // LEFT FRAME
        frame.switchToLeftFrame();
        String leftText = frame.getFrameText();
        Assert.assertTrue(leftText.length() > 0);
        frame.switchToDefault();

        // MIDDLE FRAME
        frame.switchToMiddleFrame();
        String middleText = frame.getFrameText();
        Assert.assertTrue(middleText.length() > 0);
        frame.switchToDefault();

     
        frame.switchToRightFrame();
        String rightText = frame.getFrameText();
        Assert.assertTrue(rightText.length() > 0);
        frame.switchToDefault();
    }
}
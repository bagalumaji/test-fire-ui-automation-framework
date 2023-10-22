package com.bagal.tests.login;

import com.bagal.pages.HomePage;
import com.bagal.report.ExtentLogger;
import com.bagal.report.ExtentReport;
import com.bagal.testbase.TestBase;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.bagal.configs.TestFireConfigReader.getTestFireConfigs;
import static com.bagal.report.ExtentLogger.info;
import static com.bagal.report.ExtentLogger.pass;

public class LoginTests extends TestBase {
    @Test
    public void loginTest(){
        ExtentReport.initReport();
        ExtentReport.createTest("Login Test");
        HomePage homePage = new HomePage().clickOnSignInLink();
        info("clicked on login link");
        Assert.assertTrue(homePage.isPageLoaded());
        info("login page loaded");
        homePage.loginToApplication(getTestFireConfigs().username(), getTestFireConfigs().password());
        info("username and password entered");
        pass("login test passed");
        ExtentReport.flushReport();
    }
}

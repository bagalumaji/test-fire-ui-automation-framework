package com.bagal.tests.login;

import com.bagal.pages.HomePage;
import com.bagal.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.bagal.configs.TestFireConfigReader.getTestFireConfigs;
import static com.bagal.report.ExtentLogger.info;
import static org.testng.AssertJUnit.assertTrue;

public class LoginTests extends TestBase {
    @Test(description = "verify user is able to login to application")
    public void loginTest(){
        HomePage homePage = new HomePage().clickOnSignInLink();
        info("clicked on login link");
        Assert.assertTrue(homePage.isPageLoaded());
        info("login page loaded");
        homePage.loginToApplication(getTestFireConfigs().username(), getTestFireConfigs().password());
        info("username and password entered");
        assertTrue(false);
    }
}

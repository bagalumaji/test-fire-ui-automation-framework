package com.bagal.tests.login;

import com.bagal.pages.HomePage;
import com.bagal.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.bagal.configs.TestFireConfigReader.getTestFireConfigs;

public class LoginTests extends TestBase {
    @Test
    public void loginTest(){
        HomePage homePage = new HomePage().clickOnSignInLink();
        Assert.assertTrue(homePage.isPageLoaded());
        homePage.loginToApplication(getTestFireConfigs().username(), getTestFireConfigs().password());
    }
}

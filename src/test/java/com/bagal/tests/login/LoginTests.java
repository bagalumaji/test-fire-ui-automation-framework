package com.bagal.tests.login;

import com.bagal.pages.LoginPage;
import com.bagal.testbase.TestBase;
import org.testng.annotations.Test;

import static com.bagal.configs.TestFireConfigReader.getTestFireConfigs;
import static org.testng.Assert.assertTrue;

public class LoginTests extends TestBase {
    @Test(description = "verify user is able to login to application")
    public void loginTest(){
        LoginPage loginPage = new LoginPage().clickOnSignInLink();

        assertTrue(loginPage.isPageLoaded());
        boolean pageLoaded = loginPage
                .loginToApplication(getTestFireConfigs().username(), getTestFireConfigs().password())
                .isPageLoaded();
        assertTrue(pageLoaded);
    }
}

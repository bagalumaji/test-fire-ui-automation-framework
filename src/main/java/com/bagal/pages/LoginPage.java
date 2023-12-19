package com.bagal.pages;

import org.openqa.selenium.By;

import static com.bagal.report.ExtentLogger.info;
import static com.bagal.uiactions.PageAction.*;

public class LoginPage extends BasePage {
    private final static By SING_IN_LINK = By.id("AccountLink");
    private final static By TEXT_BOX_USER_NAME = By.id("uid");
    private final static By TEXT_BOX_PASSWORD = By.id("passw");
    private final static By BTN_LOGIN = By.name("btnSubmit");


    @Override
    public boolean isPageLoaded() {
        info("login page loaded");
        return isDisplayed(SING_IN_LINK);
    }

    public LoginPage clickOnSignInLink() {
        click(SING_IN_LINK);
        info("clicked on login link");
        return this;
    }

    public HomePage loginToApplication(String username, String password) {
        return enterUserName(username)
                .enterPassword(password)
                .clickOnLoginButton();
    }

    private LoginPage enterUserName(String username) {
        type(TEXT_BOX_USER_NAME,username);
        info("entered username");
        return this;
    }

    private LoginPage enterPassword(String password) {
        type(TEXT_BOX_PASSWORD,password);
        info("entered password");
        return this;
    }

    private HomePage clickOnLoginButton() {
        click(BTN_LOGIN);
        info("clicked on login button");
        return new HomePage();
    }
}

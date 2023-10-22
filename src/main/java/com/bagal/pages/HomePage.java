package com.bagal.pages;

import com.bagal.pages.basepage.BasePage;
import org.openqa.selenium.By;

import static com.bagal.uiactions.PageAction.*;

public class HomePage extends BasePage {
    private final static By SING_IN_LINK = By.id("AccountLink");
    private final static By TEXT_BOX_USER_NAME = By.id("uid");
    private final static By TEXT_BOX_PASSWORD = By.id("passw");
    private final static By BTN_LOGIN = By.name("btnSubmit");


    @Override
    public boolean isPageLoaded() {
        return isDisplayed(SING_IN_LINK);
    }

    public HomePage clickOnSignInLink() {
        click(SING_IN_LINK);
        return this;
    }

    public void loginToApplication(String username, String password) {
        enterUserName(username)
                .enterPassword(password)
                .clickOnLogin();
    }

    private HomePage enterUserName(String username) {
        type(TEXT_BOX_USER_NAME,username);
        return this;
    }

    private HomePage enterPassword(String password) {
        type(TEXT_BOX_PASSWORD,password);
        return this;
    }

    private HomePage clickOnLogin() {
        click(BTN_LOGIN);
        return this;
    }

}

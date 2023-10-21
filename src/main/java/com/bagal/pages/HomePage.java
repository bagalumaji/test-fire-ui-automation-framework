package com.bagal.pages;

import com.bagal.pages.basepage.BasePage;
import org.openqa.selenium.By;

import static com.bagal.uiactions.PageAction.click;
import static com.bagal.uiactions.PageAction.isDisplayed;

public class HomePage extends BasePage {
    private By singInLink = By.id("AccountLink");

    @Override
    public boolean isPageLoaded() {
        return isDisplayed(singInLink);
    }

    public HomePage clickOnSignInLink() {
        click(singInLink);
        return this;
    }

    public void loginToApplication(String username, String password) {
        enterUserName(username)
                .enterPassword(password)
                .clickOnLogin();
    }

    private HomePage enterUserName(String username) {
        return this;
    }

    private HomePage enterPassword(String password) {
        return this;
    }

    private HomePage clickOnLogin() {
        return this;
    }

}

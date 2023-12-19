package com.bagal.pages;

import com.bagal.uiactions.PageAction;
import org.openqa.selenium.By;

public class HomePage extends BasePage{
    private static final By SIGN_OFF_LINK=By.linkText("Sign Off");
    @Override
    public boolean isPageLoaded() {
        return PageAction.isDisplayed(SIGN_OFF_LINK);
    }

}

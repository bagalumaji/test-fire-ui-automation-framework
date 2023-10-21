package com.bagal.uiactions;

import com.bagal.factories.ExplicitWaitFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;

public final class PageAction {
    private PageAction(){}

    public static void click(By element){
        ExplicitWaitFactory.waitForElementToBeClickable(element).click();
    }
    public static void click(By element,int timeout){
        ExplicitWaitFactory.waitForElementToBeClickable(element,timeout).click();
    }
    public static void type(By element,String text){
        ExplicitWaitFactory.waitForVisibilityOfElement(element).sendKeys(text);
    }
    public static void type(By element,int timeout,String text){
        ExplicitWaitFactory.waitForVisibilityOfElement(element,timeout).sendKeys(text);
    }
    public static boolean isDisplayed(By element){
        try {
           return ExplicitWaitFactory.waitForVisibilityOfElement(element).isDisplayed();
        }catch (TimeoutException e){
            return false;
        }
    }
    public static boolean isDisplayed(By element,int timeout){
        try {
            return ExplicitWaitFactory.waitForVisibilityOfElement(element,timeout).isDisplayed();
        }catch (TimeoutException e){
            return false;
        }
    }
}

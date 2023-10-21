package com.bagal.factories;

import com.bagal.drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.bagal.configs.TestFireConfigReader.getTestFireConfigs;

public final class ExplicitWaitFactory {
    private ExplicitWaitFactory(){}

    public static WebElement waitForVisibilityOfElement(By element){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(element));
    }
    public static WebElement waitForVisibilityOfElement(By element,int timeout){
        return getWait(timeout).until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static WebElement waitForElementToBeClickable(By element){
        return getWait().until(ExpectedConditions.elementToBeClickable(element));
    }
    public static WebElement waitForElementToBeClickable(By element,int timeout){
        return getWait(timeout).until(ExpectedConditions.elementToBeClickable(element));
    }
    private static WebDriverWait getWait(){
        return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(getTestFireConfigs().defaultTimeout()));
    }
    private static WebDriverWait getWait(int timeout){
        return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(timeout));
    }
}

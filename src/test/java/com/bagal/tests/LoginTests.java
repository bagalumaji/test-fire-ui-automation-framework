package com.bagal.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static com.bagal.configs.TestFireConfigReader.getTestFireConfigs;

public class LoginTests {
    @Test
    public void loginTest(){
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getTestFireConfigs().url());
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        driver.quit();
    }
}

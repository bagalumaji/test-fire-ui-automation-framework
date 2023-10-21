package com.bagal.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.bagal.configs.TestFireConfigReader.getTestFireConfigs;

public class TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getTestFireConfigs().url());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

package com.bagal.testbase;

import com.bagal.drivers.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    @BeforeMethod(alwaysRun = true)
    public void setup() {
        Driver.initDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        Driver.quitDriver();
    }
}

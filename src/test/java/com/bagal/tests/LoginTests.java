package com.bagal.tests;

import com.bagal.drivers.DriverManager;
import com.bagal.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @Test
    public void loginTest(){
        System.out.println("DriverManager.getDriver().getCurrentUrl() = " + DriverManager.getDriver().getCurrentUrl());
        System.out.println("DriverManager.getDriver().getTitle() = " + DriverManager.getDriver().getTitle());
    }
}

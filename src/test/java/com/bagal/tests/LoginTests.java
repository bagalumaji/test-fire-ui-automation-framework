package com.bagal.tests;

import com.bagal.configs.TestFireConfigReader;
import org.testng.annotations.Test;

public class LoginTests {
    @Test
    public void loginTest(){
        System.out.println("ConfigReader.getTestFireConfigs().url() = " + TestFireConfigReader.getTestFireConfigs().url());
    }
}

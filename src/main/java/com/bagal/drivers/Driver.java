package com.bagal.drivers;

import com.bagal.factories.DriverFactory;

import java.util.Objects;

import static com.bagal.configs.TestFireConfigReader.getTestFireConfigs;

public final class Driver {
    private Driver(){}
    public static void initDriver(){
        if(Objects.isNull(DriverManager.getDriver())){
            DriverManager.setDriver(DriverFactory.getDriver());
            DriverManager.getDriver().get(getTestFireConfigs().url());
        }
    }
    public static void quitDriver(){
        if(Objects.nonNull(DriverManager.getDriver())){
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}

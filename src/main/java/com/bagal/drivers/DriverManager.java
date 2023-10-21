package com.bagal.drivers;

import org.openqa.selenium.WebDriver;

import java.util.Objects;

public final class DriverManager {
    private DriverManager(){}
    private static final ThreadLocal<WebDriver> WEB_DRIVER_THREAD_LOCAL = new ThreadLocal<>();

    static void setDriver(WebDriver driver){
        if(Objects.nonNull(driver)){
            WEB_DRIVER_THREAD_LOCAL.set(driver);
        }
    }

    public static WebDriver getDriver(){
        return WEB_DRIVER_THREAD_LOCAL.get();
    }

    public static void unload(){
        WEB_DRIVER_THREAD_LOCAL.remove();
    }
}

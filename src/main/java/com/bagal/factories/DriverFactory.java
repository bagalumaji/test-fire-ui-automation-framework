package com.bagal.factories;

import com.bagal.exceptions.InvalidBrowserNameException;
import com.bagal.factories.browseroptions.ChromeBrowserOptions;
import com.bagal.factories.browseroptions.FirefoxBrowserOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.bagal.configs.TestFireConfigReader.getTestFireConfigs;

public final class DriverFactory {
    private DriverFactory(){}
    public static WebDriver getDriver(){

        if(getTestFireConfigs().browser().equalsIgnoreCase("chrome")){
            return new ChromeDriver(ChromeBrowserOptions.getChromeOptions());
        } else if (getTestFireConfigs().browser().equalsIgnoreCase("firefox")) {
            return new FirefoxDriver(FirefoxBrowserOptions.getFirefoxOptions());
        } else {
            throw new InvalidBrowserNameException(getTestFireConfigs().browser()+"Invalid Browser Name ");
        }
    }
}

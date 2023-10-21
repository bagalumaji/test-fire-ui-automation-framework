package com.bagal.browseroptions;

import com.bagal.configs.TestFireConfigReader;
import org.openqa.selenium.firefox.FirefoxOptions;

public final class FirefoxBrowserOptions {
    private FirefoxBrowserOptions(){}

    public static FirefoxOptions getFirefoxOptions(){
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--private");
        if(TestFireConfigReader.getTestFireConfigs().headless()){
            options.addArguments("--headless");
        }
        return options;
    }
}

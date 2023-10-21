package com.bagal.browseroptions;

import com.bagal.configs.TestFireConfigReader;
import org.openqa.selenium.chrome.ChromeOptions;

public final class ChromeBrowserOptions {
    private ChromeBrowserOptions(){}

    public static ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        if(TestFireConfigReader.getTestFireConfigs().headless()){
            options.addArguments("--headless");
        }
        return options;
    }
}

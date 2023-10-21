package com.bagal.configs;

import org.aeonbits.owner.ConfigCache;

public class TestFireConfigReader {
    public static TestFireConfig getTestFireConfigs(){
       return ConfigCache.getOrCreate(TestFireConfig.class);
    }
}

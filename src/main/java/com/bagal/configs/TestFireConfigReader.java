package com.bagal.configs;

import org.aeonbits.owner.ConfigCache;

public final class TestFireConfigReader {
    private TestFireConfigReader(){}
    public static TestFireConfig getTestFireConfigs(){
       return ConfigCache.getOrCreate(TestFireConfig.class);
    }
}

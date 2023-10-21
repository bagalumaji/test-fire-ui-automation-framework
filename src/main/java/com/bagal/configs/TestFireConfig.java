package com.bagal.configs;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/configs/application.properties",
})
public interface TestFireConfig extends Config {
    String url();
    @Key("explicit.mintime")
    int explicitMinimumTime();
    @Key("explicit.maxtime")
    int explicitMaximumTime();
    String browser();
}

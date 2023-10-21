package com.bagal.configs;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/configs/application.properties",
})
public interface TestFireConfig extends Config {
    @Key("url")
    String url();
    @Key("explicit.default.timeout")
    int defaultTimeout();
    @Key("browser")
    String browser();

    @Key("headless")
    boolean headless();

    @Key("explicit.minimum.timeout")
    int minimumTimeout();
    @Key("explicit.maximum.timeout")
    int maximumTimeout();

    @Key("username")
    String username();

    @Key("password")
    String password();
}

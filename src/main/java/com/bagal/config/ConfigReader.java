package com.bagal.config;
import org.aeonbits.owner.ConfigCache;
public final class ConfigReader {
    private ConfigReader() {}
    public static IConfig getConfig() {
        return ConfigCache.getOrCreate(IConfig.class);
    }
}

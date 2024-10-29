package com.bagal.driver;

import com.bagal.driver.factory.LocalChromeManager;
import com.bagal.driver.factory.LocalFirefoxManager;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public final class DriverFactory {
    private DriverFactory() {}
    private static Map<String, Supplier<WebDriver>> MAP = new HashMap<>();
    static {
        MAP.put("CHROME", LocalChromeManager::getDriver);
        MAP.put("FIREFOX", LocalFirefoxManager::getDriver);
    }
    public static WebDriver getDriver(String browser) {
        return MAP.get(browser.toUpperCase()).get();
    }
}

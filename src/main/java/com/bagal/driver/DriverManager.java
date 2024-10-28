package com.bagal.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {
    private DriverManager() {}
    private static final ThreadLocal<WebDriver> WEB_DRIVER_THREAD_LOCAL = new ThreadLocal<>();

    static void setDriver(WebDriver driver) {
        WEB_DRIVER_THREAD_LOCAL.set(driver);
    }

    public static WebDriver getDriver() {
        return WEB_DRIVER_THREAD_LOCAL.get();
    }

    public static void unloadDriver() {
        WEB_DRIVER_THREAD_LOCAL.remove();
    }
}

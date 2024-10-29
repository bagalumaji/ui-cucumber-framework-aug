package com.bagal.driver.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class LocalChromeManager {
    private LocalChromeManager(){}

    public static WebDriver getDriver() {
        return new ChromeDriver();
    }
}

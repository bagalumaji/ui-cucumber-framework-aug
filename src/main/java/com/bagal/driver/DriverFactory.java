package com.bagal.driver;

import com.bagal.config.ConfigReader;
import com.bagal.exceptions.BrowserNotSupportedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class DriverFactory {
    private DriverFactory() {
    }

    public static WebDriver getDriver() {
        switch (ConfigReader.getConfig().browser().toUpperCase()) {
            case "CHROME":
                return new ChromeDriver();
            case "FIREFOX":
                return new FirefoxDriver();
            default:
                throw new BrowserNotSupportedException(ConfigReader.getConfig().browser().toUpperCase()+" is not supported");
        }
    }
}

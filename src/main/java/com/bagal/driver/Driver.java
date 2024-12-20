package com.bagal.driver;

import com.bagal.config.ConfigReader;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public final class Driver {
    private Driver() {}
    public static void initializeDriver() {
        if(Objects.isNull(DriverManager.getDriver())) {
            WebDriver driver = DriverFactory.getDriver(ConfigReader.getConfig().browser());
            driver.manage().window().maximize();
            driver.get(ConfigReader.getConfig().url());
            DriverManager.setDriver(driver);
        }
    }
    public static void closeDriver() {
        if(Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unloadDriver();
        }
    }
}

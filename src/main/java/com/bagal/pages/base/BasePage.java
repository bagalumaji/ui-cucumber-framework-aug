package com.bagal.pages.base;

import com.bagal.driver.DriverManager;
import org.openqa.selenium.support.PageFactory;

abstract public class BasePage {
    public BasePage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }
}

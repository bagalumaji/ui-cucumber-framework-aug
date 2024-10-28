package com.bagal.hooks;

import com.bagal.driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
    @Before
    public void setup() {
        Driver.initializeDriver();
    }
    @After
    public void teardown() {
        Driver.closeDriver();
    }
}

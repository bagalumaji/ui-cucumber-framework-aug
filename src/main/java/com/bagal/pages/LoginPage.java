package com.bagal.pages;

import com.bagal.pages.base.BasePage;

public final class LoginPage extends BasePage {
    public void loginToApplication(String username, String password) {
        enterUserName(username);
        enterPassword(password);
        clickOnLoginButton();
    }
    public void enterUserName(String username) {

    }
    public void enterPassword(String password) {

    }
    public void clickOnLoginButton() {}

    public boolean isDisplayedOrangeHRMLogo(){
        return false;
    }
    public void verifyOrangeHRMLogo() {
        //assertTrue(isDisplayedOrangeHRMLogo());
    }
}

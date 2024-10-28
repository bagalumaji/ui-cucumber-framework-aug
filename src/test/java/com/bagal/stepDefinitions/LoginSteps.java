package com.bagal.stepDefinitions;

import com.bagal.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();
    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
       loginPage.verifyOrangeHRMLogo();
    }

    @When("the user enters {string} as the username and {string} as the password")
    public void theUserEntersAsTheUsernameAndAsThePassword(String username, String password) {
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
    }

    @And("the user clicks on the login button")
    public void theUserClicksOnTheLoginButton() {
        loginPage.clickOnLoginButton();
    }

    @Then("the user should be redirected to the dashboard")
    public void theUserShouldBeRedirectedToTheDashboard() {

    }

    @And("the user should see the {string} heading")
    public void theUserShouldSeeTheHeading(String arg0) {
    }
}
